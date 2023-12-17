package Service;

import org.json.JSONObject;

public class Dump {

    public static void dump(Object objet){
        JSONObject jsonObject = new JSONObject(objet);
        String str = objet.getClass().getSimpleName() + " " + jsonObject.toString(4);
        System.out.println(str);
    }

}
