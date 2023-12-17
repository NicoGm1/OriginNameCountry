package Service;

import TestScanner.InfoName;
import lombok.experimental.UtilityClass;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

@UtilityClass
public class NationalizeApiService {

    private static final HttpClientService httpClientService = new HttpClientService();

    public static String getInfoFromName(String name){
        StringBuilder sb = new StringBuilder("Votre nom : ");
        sb.append(name);
        String url = "https://api.nationalize.io/?name=" + name;
        // String json = httpClientService.get(url);
        String json = "{\"count\":449,\"name\":\"surget\",\"country\":[{\"country_id\":\"FR\",\"probability\":0.611},{\"country_id\":\"BE\",\"probability\":0.048},{\"country_id\":\"AR\",\"probability\":0.046},{\"country_id\":\"CI\",\"probability\":0.04},{\"country_id\":\"GI\",\"probability\":0.04}]}\n";
        if (json.isEmpty()) {
            return null;
        }
        InfoName infoName = new InfoName();
        JSONTokener tokener = new JSONTokener(json);
        JSONObject object = new JSONObject(tokener);
        JSONArray country = object.getJSONArray("country");
        for (int i = 0; i < country.length(); i++) {

        }
        return sb.toString();
    }
}
