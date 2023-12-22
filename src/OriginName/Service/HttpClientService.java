package OriginName.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientService {

    private final HttpClient httpClient = HttpClient.newHttpClient();

    private static HttpClientService httpClientService;

    private HttpClientService() {
    }

    public static HttpClientService getHttpClientService() {
        if (httpClientService == null) {
            httpClientService = new HttpClientService();
        }
        return httpClientService;
    }



    public HttpResponse<String> get(String url) {
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .header("Accept", "application/json")
                .build();

        return send(httpRequest, url);
    }

    public HttpResponse<String> post(String url, String body) {
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .uri(URI.create(url))
                .header("Content-Type", "application/json")
                .build();

        return send(httpRequest, url);
    }

    private HttpResponse<String> send(HttpRequest httpRequest, String url) {
        HttpResponse<String> response = null;
        try {
            response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            System.out.println("Error while calling : " + url);
            System.out.println(e.getMessage());
        }
        return response;
    }

}

