package Service;

import Entity.InfoName;
import lombok.experimental.UtilityClass;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

@UtilityClass
public class NationalizeApiService {

    private static final HttpClientService httpClientService = new HttpClientService();

    public static InfoName getInfoFromName(String name){
        String url = "https://api.nationalize.io/?name=" + name;
        String json = httpClientService.get(url);
        // String json = "{\"count\":449,\"name\":\"surget\",\"country\":[{\"country_id\":\"FR\",\"probability\":0.611},{\"country_id\":\"BE\",\"probability\":0.048},{\"country_id\":\"AR\",\"probability\":0.046},{\"country_id\":\"CI\",\"probability\":0.04},{\"country_id\":\"GI\",\"probability\":0.04}]}\n";
        if (json.isEmpty()) {
            return null;
        }
        return getInfoName(json);
    }

    private static InfoName getInfoName(String json) {
        InfoName infoName = new InfoName();
        JSONTokener tokener = new JSONTokener(json);
        JSONObject object = new JSONObject(tokener);
        infoName.setCount(object.getInt("count"));
        infoName.setName(object.getString("name"));
        JSONArray countryArray = object.getJSONArray("country");
        for (int i = 0; i < countryArray.length(); i++) {
            JSONObject countryObj = countryArray.getJSONObject(i);
            infoName.addCountryStats(countryObj.getDouble("probability"), countryObj.getString("country_id"));
        }
        return infoName;
    }
}
