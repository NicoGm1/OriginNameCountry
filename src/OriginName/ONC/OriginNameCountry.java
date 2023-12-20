package OriginName.ONC;


import OriginName.Entity.InfoNameGson;
import OriginName.Service.CountryFromCode;
import OriginName.Service.NationalizeApiServiceWithGson;
import lombok.experimental.UtilityClass;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

@UtilityClass
public class OriginNameCountry {

    private static final Scanner sc = new Scanner(System.in);

//    }

    public static void originNameCountryGson() {
        System.out.println("Bonjour !");
        System.out.println("J'ai decouvert quelque chose de super ! Regarde !");
        System.out.println("Donne moi un nom de famille :                                     // (ff pour quitter)");
        String name = sc.nextLine();
        if (name.equals("ff")) {
            return;
        }
        if (name.isEmpty()) {
            System.out.println("tu n'as pas de nom ? =)");
            originNameCountryGson();
            return;
        }
        InfoNameGson infoNameGson = NationalizeApiServiceWithGson.getInfoFromName(name);
        if (infoNameGson == null) {
            System.out.println("info sur le nom non trouvé =(");
            return;
        }
        System.out.println("D'après la base de donnée de nationalize.io");
        if (!infoNameGson.getName().isEmpty()) {
            System.out.println("Votre nom : " + infoNameGson.getName().toUpperCase() + " est present " + infoNameGson.getCount() + " fois dans la base de donnée");
            System.out.println("voici les " + infoNameGson.getCountry().size() + " pays où il est le plus representé: ");
            infoNameGson.triCountry().forEach(s -> {
                BigDecimal probabilityBigDecimal = new BigDecimal(Float.toString(s.getProbability()));
                BigDecimal multipliedResult = probabilityBigDecimal.multiply(new BigDecimal("100"));
                DecimalFormat decimalFormat = new DecimalFormat("#.#");
                String formattedResult = decimalFormat.format(multipliedResult);
                System.out.println(formattedResult + "% en " + CountryFromCode.getCountryFromCode(s.getCountry_id()));
            });
        }
        originNameCountryGson();
    }
}







//    public static void originNameCountry() {                 // first obsolete code but I'm keeping it because it's my first one ! =)
//        System.out.println("Bonjour !");
//        System.out.println("J'ai decouvert quelque chose de super ! Regarde !");
//        System.out.println("Donne moi un nom de famille :");
//        String name = sc.nextLine();
//        if (name.isEmpty()) {
//            System.out.println("tu n'as pas de nom ? =)");
//            return;
//        }
//        InfoName infoName = NationalizeApiService.getInfoFromName(name);
//        System.out.println("D'après la base de donnée de nationalize.io");
//        if (infoName == null) {
//            System.out.println("info sur le nom non trouvé =(");
//            return;
//        }
//        if (!infoName.getName().isEmpty()) {
//            System.out.println("Votre nom : " + infoName.getName() + " est present " + infoName.getCount() + " fois dans la base de donnée");
//            System.out.println("voici les " + infoName.getCountryStats().size() + " pays où il est le plus representé:");
//            sortandsoutHashmap(infoName.getCountryStats());
//        }
//    }

        //    public void sortandsoutHashmap(Map<Double, String> hashmap) {
//        Map<Double, String> map = new TreeMap<Double, String>(hashmap);
//        Set<Map.Entry<Double, String>> set = map.entrySet();
//        for (Object o : set) {
//            Map.Entry entry = (Map.Entry) o;
//            Double pourcentage = ((Double)entry.getKey() * 100);
//            System.out.println(pourcentage + "% sont du pays: " + getCountry(entry.getValue()));
//        }


