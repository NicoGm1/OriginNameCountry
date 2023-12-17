package Service;

public class Dump {

    public static void dump(Object objet){
        JSONObject json = JSONObject.fromObject(dataObject );
        System.out.println(json.toString());
    }
}
