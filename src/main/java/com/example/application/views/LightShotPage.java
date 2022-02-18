package com.example.application.views;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LightShotPage {

    private WebDriver driver;

    @FindBy(xpath = "//*[contains(@id, 'screenshot-image')]")
    private WebElement imageField;

    @FindBy(xpath = "//*[contains(@class, 'twitter-item__userpic')]")
    private WebElement twitterImage;

    public LightShotPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getImageField() {
        return imageField;
    }

    public WebElement getTwitterImage() {
        return twitterImage;
    }
}