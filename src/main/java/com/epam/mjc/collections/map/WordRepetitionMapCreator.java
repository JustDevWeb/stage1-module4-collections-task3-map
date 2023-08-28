package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        String[] words = splitString(sentence);

        Map<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            int counter = 1;
            String word = words[i].toLowerCase();
            for ( int j = i + 1; j < words.length; j++ ) {
                if (word.equals(words[j].toLowerCase())) {
                    counter++;
                }
            }
            if( !hashMap.containsKey(word) ) {
                hashMap.put(word,counter);
            }
        }

        return hashMap;
    }

    public String[] splitString (String sentence) {
        String[] words = sentence.split("[ .,]");
        List<String> wordsList = new ArrayList<>(List.of(words));
        wordsList.removeAll(List.of(""));

        return wordsList.toArray(new String[0]);
    }
}
