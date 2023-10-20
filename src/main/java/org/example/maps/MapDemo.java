package org.example.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args){

        Map<Integer, String> map = new LinkedHashMap<>(){

            //anonymous class used with UI/UX
            @Override
            public String toString(){
                return this.keySet().toString();
            }
        };

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(5, "Five");
        map.put(4, "Four");

        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());

        for(Integer key : map.keySet()) {
            System.out.println("{" + key + ":" + map.get(key) + "}");
        }
    }
}








