package OriginName.Service;

import lombok.experimental.UtilityClass;
import org.json.JSONObject;
@UtilityClass
public class Dump {

    public static void dump(Object objet){
        if (objet instanceof String){
            System.out.println(objet);
        }
        JSONObject jsonObject = new JSONObject(objet);
        String str = objet.getClass().getSimpleName() + " " + jsonObject.toString(4);
        System.out.println(str);
    }

}
