package com.example.selenideproject.BaseTest;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchPage {

    private final ElementsCollection articleTittles = $$x("//h2//a[1]");

    /**
     *
     * @return return href of first element in collection
     */
    public String getHrefFromArticle(){
       return articleTittles.first().getAttribute("href");
    }
}
