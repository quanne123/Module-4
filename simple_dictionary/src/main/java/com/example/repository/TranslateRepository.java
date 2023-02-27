package com.example.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class TranslateRepository implements ITranslateRepository{
    private static final Map<String, String> listMap = new HashMap<>();

    static {
        listMap.put("love", "tình yêu");
        listMap.put("friendship", "tình bạn");
        listMap.put("comradeship", "tình đồng chí");
    }
    @Override
    public Map<String, String> listMap() {
        return listMap;
    }

    @Override
    public String lookUp(String word) {
        String wordFound = "not found";
        for (String a : listMap.keySet()){
            if (a.equals(word)){
                wordFound = listMap.get(a);
                return wordFound;
            }
        }
        return wordFound;
    }
}
