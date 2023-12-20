package OriginName.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collections;
import java.util.List;

@NoArgsConstructor@Getter@Setter@AllArgsConstructor
public class InfoNameGson {

    private Integer count;
    private String name;
    private List<InfoCountryGson> country;


    public List<InfoCountryGson> triCountry() {
        List<InfoCountryGson> ordonedCountry = country;
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
