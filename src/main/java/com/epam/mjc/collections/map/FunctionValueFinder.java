package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        return functionMap.containsKey( requiredValue );
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for ( Integer e : sourceList ) {
            Integer key = 5 * e + 2;
            hashMap.put( key , e );
        }
        return hashMap;
    }
}
