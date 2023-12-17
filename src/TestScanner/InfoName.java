package TestScanner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class InfoName {

    private String name;

    private int count;

    private Map<String, Double> countryStats = new HashMap<>();

    public void addCountryStats(String country,Double probability){
        countryStats.put(country,probability);
    }
}
