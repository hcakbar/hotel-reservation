package com.akbar.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class QuoteRequestController {

    @GetMapping
    public String beginQuoteRequest() {
        //add implementation
        return "newQuote";
    }

    @PostMapping
    public String submitQuoteRequest() {
        //add implementation
        return "newQuoteConfirmation";
    }


}
