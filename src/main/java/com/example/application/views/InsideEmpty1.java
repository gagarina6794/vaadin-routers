package com.example.application.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;

@Route(value = "inside-empty-1", layout = ContentLayoutEmpty1.class)
public class InsideEmpty1 extends VerticalLayout {

    private final Image image = new Image();

    public InsideEmpty1() {
        setSizeFull();
        getElement().setProperty("background", "#89ddff");
        getElement().setProperty("color", "#FFFFFF");

        Button btn = new Button("Get random image", e -> {
            String randomLetter = RandomStringUtils.randomAlphabetic(2).toLowerCase();
            String randomNumber = "" + RandomUtils.nextInt(0, 9) + RandomUtils.nextInt(0, 9) + RandomUtils.nextInt(0, 9) + RandomUtils.nextInt(0, 9);
            System.out.println("Code - " + randomLetter + randomNumber);
            String imageSrc = getImageSrc(randomLetter + randomNumber);
            setImage(imageSrc);
        });
        add(btn);
        add(image);
    }

    private String getImageSrc(String linkParams) {
        WebDriver driver = initDriver(true);
        String url = "https://prnt.sc/" + linkParams;
        System.out.println("URL - " + url);
        driver.get(url);

        String src;
        try {
            LightShotPage lightShotPage = new LightShotPage(driver);
            WebElement imageField = lightShotPage.getImageField();
            src = imageField.getAttribute("src");
        } catch (Exception exception) {
            LightShotPage lightShotPage = new LightShotPage(driver);
            WebElement twitterImage = lightShotPage.getTwitterImage();
            src = twitterImage.getAttribute("src");
        }
        driver.close();
        return src;
    }

    private WebDriver initDriver(boolean headless) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/webdriver/linux/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(headless);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://image.prntscr.com/image/zdkPk-GMSa_rdG6k3v59LQ.png");
        return driver;
    }

    private void setImage(String imageUrl) {
        String[] strings = imageUrl.split("/");
        String imageName = strings[strings.length - 1];

        try {
            URL url = new URL(imageUrl);
            InputStream in = new BufferedInputStream(url.openStream());
            StreamResource streamResource = new StreamResource(imageName, () -> in);
            image.setSrc(streamResource);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}
