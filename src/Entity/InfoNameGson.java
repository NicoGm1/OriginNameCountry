package Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
@NoArgsConstructor@Getter@Setter@AllArgsConstructor
public class InfoNameGson {

    private Integer count;
    private String name;
    private List<CountryInfo> country;


    public List<CountryInfo> triCountry() {
        List<CountryInfo> ordonedCountry = country;
        Collections.sort(ordonedCountry);
        return ordonedCountry;
    }

    @Override
    public String toString() {
        return "InfoNameGson {" +
                "count=" + count +
                ", name='" + name + '\'' +
                ", country=" + country +
                '}';
    }


}
