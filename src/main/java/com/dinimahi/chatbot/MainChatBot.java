package com.dinimahi.chatbot;

import spark.ModelAndView;
import spark.Spark;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

import java.util.HashMap;

public class MainChatBot{
    public static void main(String[] args) {
        System.out.println("Hello Mr. Human Being");
        Spark.staticFileLocation("public_html");
        Spark.get("/", (request, response) -> {
            HashMap<String, Object> model = new HashMap<>();
            return new ThymeleafTemplateEngine().render(new ModelAndView(model, "index"));
        });
    }
}