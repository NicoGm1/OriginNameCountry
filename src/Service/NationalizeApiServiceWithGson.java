package Service;

import Entity.InfoName;
import Entity.InfoNameGson;
import com.google.gson.Gson;

public class NationalizeApiServiceWithGson {

    private static final HttpClientService httpClientService = new HttpClientService();

    public static InfoNameGson getInfoFromName(String name) {
        name = name.toLowerCase();
        name = UrlEncoding.encodeValue(name);
        String url = "https://api.nationalize.io/?name=" + name;
        String json = httpClientService.get(url);
        // String json = "{\"count\":449,\"name\":\"surget\",\"country\":[{\"country_id\":\"FR\",\"probability\":0.611},{\"country_id\":\"BE\",\"probability\":0.048},{\"country_id\":\"AR\",\"probability\":0.046},{\"country_id\":\"CI\",\"probability\":0.04},{\"country_id\":\"GI\",\"probability\":0.04}]}\n";
        if (json.isEmpty()) {
            return null;
        }
        Gson gson = new Gson();
        return gson.fromJson(json, InfoNameGson.class);
    }
}
