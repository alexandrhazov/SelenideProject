package com.example.selenideproject.BaseTest;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/*
 * Main Page of AppleInsider
 */
public class MainPage {
    public MainPage(String url) {
        Selenide.open(url);
    }

    private final SelenideElement textBoxInput = $x("//input[@name='s']");

    /**
     * Performing the search among articles and pushing Enter button
     * @param searchString search string
     */
    public SearchPage search(String searchString){
        textBoxInput.setValue(searchString);
        textBoxInput.sendKeys(Keys.ENTER);
        return new SearchPage();
    }
}
