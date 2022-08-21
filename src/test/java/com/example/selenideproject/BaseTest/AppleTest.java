package com.example.selenideproject.BaseTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppleTest extends BaseTest{

    private final static String BASE_URL = "https://appleinsider.ru/";
    private final static String SEARCH_STRING = "Чем iPhone 13 отличается от iPhone 12";

    @Test
    public void checkHref(){
         String href = new MainPage(BASE_URL)
                .search(SEARCH_STRING)
                .getHrefFromArticle();
        Assertions.assertTrue(href.contains("iphone-13"));
    }


}
