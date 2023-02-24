package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;
@Controller
public class TranslateController {
    private static final Map<String, String> listMap = new HashMap<>();

    static {
        listMap.put("love", "tình yêu");
        listMap.put("friendship", "tình bạn");
        listMap.put("comradeship", "tình đồng chí");
    }

    @GetMapping("/search")
    public String search(@RequestParam(required = false) String word, Model model) {
        if (word == null) {
            model.addAttribute("search", "can't search");
            return "/search";
        }
        model.addAttribute("search",listMap.get(word));
        return "/search";
    }

}
