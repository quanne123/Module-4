package com.example.repository;

import java.util.Map;

public interface ITranslateRepository {
    Map<String,String> listMap();

    String lookUp(String word);

}
