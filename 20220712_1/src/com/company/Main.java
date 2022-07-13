package com.company;
/*
Дана Map<String, String>, если в ней есть ключ ‘a’ и ‘b’,
то нужно  создать новый ключ ‘ab’ с суммой значений от ключей a и b.
Примеры:
mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b":"There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}

 */


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("c","jack");
        map.put("a","Hi");
        map.put("v","john");
        map.put("b","There");
        map.put("d","nick");
        mapAB(map,"v","c");
        System.out.println(map);

        addSummaryValue(map, List.of("a","b","c"));
        System.out.println(map);

    }

    public static void mapAB (Map<String,String> map){
        if (map!=null && !map.isEmpty() && map.containsKey("a") && map.containsKey("b")){
            map.put("ab", map.get("a")+map.get("b"));
        }

    }
    public static void mapAB (Map<String,String> map, String a, String b){
        if (map!=null && !map.isEmpty() && map.containsKey(a) && map.containsKey(b)){
            map.put(a+b, map.get(a)+map.get(b));
        }

    }

    public static void addSummaryValue (Map<String,String> map, List<String> keys){
        if (map!=null && !map.isEmpty() && map.keySet().containsAll(keys) ){
            String resValue="";
            String resKey="";
            for (String key: keys) {
                resKey+=key;
                resValue+=map.get(key);
            }
            map.put(resKey,resValue);
        }
    }


}
