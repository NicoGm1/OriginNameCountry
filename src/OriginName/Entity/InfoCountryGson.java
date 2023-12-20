package OriginName.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InfoCountryGson implements Comparable<InfoCountryGson>{
    private String country_id;
    private Float probability;


    @Override
    public String toString() {
        return "CountryInfo{" +
                "country_id='" + country_id + '\'' +
                ", probability=" + probability +
                '}';
    }

    @Override
    public int compareTo(InfoCountryGson o) {
        return (int)(o.probability*1000 - this.probability*1000);
    }
}
