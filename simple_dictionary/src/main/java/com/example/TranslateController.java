package com.example;

import com.example.repository.ITranslateRepository;
import com.example.repository.TranslateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
@Controller
public class TranslateController {
    @Autowired
    private ITranslateRepository translateRepository = new TranslateRepository();



    @GetMapping("/search")
   public String toHome(){
        return "/search";
    }

    @PostMapping("/search")
    public ModelAndView toTranslate(@RequestParam String word){
        return new ModelAndView("/search","search",translateRepository.lookUp(word));
    }
}
