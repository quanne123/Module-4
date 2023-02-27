package com.currency.controller;

import com.currency.service.ConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvertController {
    @Autowired
    private ConvertService convertService;

    @GetMapping
    public String toConvert() {
        return "/convert";
    }

    @PostMapping("/convert")
    public ModelAndView toResult(@RequestParam String amount, @RequestParam String rate) {
        return new ModelAndView("/convert", "result", convertService.convert(Double.parseDouble(amount), Double.parseDouble(rate)));
    }
}
