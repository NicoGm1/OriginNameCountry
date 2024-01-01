package OriginName.Service;

import OriginName.Entity.InfoNameGson;
import com.google.common.base.Strings;
import com.google.gson.Gson;
import lombok.experimental.UtilityClass;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.net.http.HttpResponse;

@UtilityClass
public class NationalizeApiServiceWithGson {

    private static final HttpClientService httpClientService = HttpClientService.getHttpClientService();


    /**
     * @param name nom de famille
     * @return the body request embedded in InfoNameGson class. Return null when an error occurs
     */
    public static InfoNameGson getInfoFromName(String name) {
        name = name.toLowerCase();
        name = UrlEncoding.encodeValue(name);
        String url = "https://api.nationalize.io/?name=" + name;
        HttpResponse<String> apiReponse = httpClientService.get(url);
        // String json = "{\"count\":449,\"name\":\"surget\",\"country\":[{\"country_id\":\"FR\",\"probability\":0.611},{\"country_id\":\"BE\",\"probability\":0.048},{\"country_id\":\"AR\",\"probability\":0.046},{\"country_id\":\"CI\",\"probability\":0.04},{\"country_id\":\"GI\",\"probability\":0.04}]}\n";
        if (apiReponse == null || apiReponse.statusCode() != 200) {
            if (apiReponse == null){
                System.out.println("Communication avec api.nationalize.io impossible");
            }
            if (apiReponse != null) {
                JSONTokener tokener = new JSONTokener(apiReponse.body());
                JSONObject object = new JSONObject(tokener);
                System.out.println("error "+ apiReponse.statusCode() + " : " + object.getString("error"));
            }
            return null;
        }
        System.out.println("apiReponse = " + apiReponse);

        Gson gson = new Gson();
        return gson.fromJson(apiReponse.body(), InfoNameGson.class);
    }
}