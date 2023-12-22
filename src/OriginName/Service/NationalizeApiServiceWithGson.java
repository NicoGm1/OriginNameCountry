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

    public static InfoNameGson getInfoFromName(String name) {
        name = name.toLowerCase();
        name = UrlEncoding.encodeValue(name);
        String url = "https://api.nationalize.io/?nae=" + name;
        HttpResponse<String> json = httpClientService.get(url);
        // String json = "{\"count\":449,\"name\":\"surget\",\"country\":[{\"country_id\":\"FR\",\"probability\":0.611},{\"country_id\":\"BE\",\"probability\":0.048},{\"country_id\":\"AR\",\"probability\":0.046},{\"country_id\":\"CI\",\"probability\":0.04},{\"country_id\":\"GI\",\"probability\":0.04}]}\n";
        if (json == null || json.statusCode() != 200) {
            if (json == null){
                System.out.println("Communication avec api.nationalize.io impossible");
            }
            if (json != null) {
                JSONTokener tokener = new JSONTokener(json.body());
                JSONObject object = new JSONObject(tokener);
                System.out.println("error : " + object.getString("error"));
            }
            return null;
        }

        Gson gson = new Gson();
        return gson.fromJson(json.body(), InfoNameGson.class);
    }
}