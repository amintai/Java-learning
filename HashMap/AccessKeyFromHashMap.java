package HashMap;

import java.util.HashMap;
import java.util.Map;

public class AccessKeyFromHashMap {
    public static void main(String args []) {

        Map<String,String> userCityMapping = new HashMap<>();

        userCityMapping.put("amin","vadodara");
        userCityMapping.put("mihir","surat");
        userCityMapping.put("maulik","ahemdabad");

        System.out.println(userCityMapping);

        // checking with key
        String name = "amin";
        if(userCityMapping.containsKey(name)){
            String city = userCityMapping.get(name);
            System.out.println("Username:'"+name+"'lives in '"+city+"'");
        } else {
            System.out.println("User not found :"+name);
        }

        // checking with value
        if(userCityMapping.containsValue("srat")){
            System.out.println("User Found ");
        } else {
            System.out.println("user not found ");
        }

        userCityMapping.put(name,"delhi");
        System.out.println(userCityMapping);


        userCityMapping.putIfAbsent("deep","mumbai");
        System.out.println(userCityMapping);


    }
}
