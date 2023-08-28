package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swapedMap = new HashMap<>();

        for ( Map.Entry<Integer, String> e : sourceMap.entrySet() ){
            String key = e.getValue();
            Integer value = e.getKey();

            if( swapedMap.containsKey(key)  && swapedMap.get(key) > value  ) {
                swapedMap.put( key , value);
            }

            swapedMap.put( key , value);
        }
        return swapedMap;
    }
}
