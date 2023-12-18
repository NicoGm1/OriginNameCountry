package Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class InfoName {

    private String name;

    private int count;

    private Map<Double, String> countryStats = new HashMap<>();

    public void addCountryStats(Double probability ,String country){
        countryStats.put(probability, country);
    }


}
