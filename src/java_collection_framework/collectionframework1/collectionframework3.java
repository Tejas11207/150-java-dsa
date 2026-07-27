package java_collection_framework.collectionframework1;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class collectionframework3 {

    static void main() {


        // map - {key , uski value }
        //unique only key honi chaiye ... value duplicate hoto bhi chalyega
        // order are depended on the type of map hash ,link, tree

        // kisi bhi chiz ko map krenme kaam aaata ha i
        // yaha <string , string> jo pehle string hai voh key and sec2 one was the value
        Map<String, String> mp1 = new HashMap<>();

        //insertion in map

        mp1.put("in", "India");
        mp1.put("uk", "england");
        mp1.put("usa", "america");

        System.out.println(mp1);


        Map<String, String> mp2 = new HashMap<>();
        mp2.put("br", "brazil");
        System.out.println(mp2);


        // dono ko krena hai add menas combine / union
        mp1.putAll(mp2);
        System.out.println(mp1);

        System.out.println("the putifabsent value" + mp1.putIfAbsent("in", "indonesia"));

        // get - value krega return
        System.out.println(mp1.get("uk"));

        System.out.println(mp1.getOrDefault("u", "la")); // get or default me key   input kru if  key are not there so toh voh default value return kreg

        System.out.println("check krega wheater the key exits or not"+ mp1.containsKey("la")); // la not exist fLASE
        System.out.println("check krega wheater the value exits or not"+mp1.containsValue("India"));

        System.out.println("replace the value of key with new value"+mp1.replace("uk","scoutland"));
        System.out.println("changed value"+mp1);

        System.out.println("remove krdo scoutland"+ mp1.remove("uk")); // remove the entery by key

        System.out.println(mp1);
        // remove my value that has key associated with value
        System.out.println("remove kre do key or value ko " + mp1.remove("usa","america")); //true or flase me aayega ans
        System.out.println(mp1);

        //keyset retrun a set of keys present in a map

        java.util.Set<String> keySet= mp1.keySet();
        System.out.println(keySet);


        //collection me bhi
        java.util.Collection<String> vs = mp1.values();
        System.out.println(vs);

        //get all the entries from  the map
        Set<Map.Entry<String,String>> entryset = mp1.entrySet();
        System.out.println("prinitng all the value "+entryset);

    }}