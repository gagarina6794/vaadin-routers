package com.example.application.views.webdriver;

import com.example.application.views.ContentLayoutEmpty1;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

import static com.example.application.views.webdriver.ConstantUtils.words;

@Route(value = "google", layout = ContentLayoutEmpty1.class)
public class RandomGoogleLayout extends VerticalLayout {

    private final Image image = new Image();
    private WebDriver driver;

    public RandomGoogleLayout() {
        setSizeFull();

        Button btn = new Button("Get random image", e -> {
            String randomWord = words.get(RandomUtils.nextInt(0, words.size() - 1));
            String imageSrc = getImageSrc(randomWord);
            if (imageSrc != null) {
                image.setSrc(imageSrc);
            }
        });
        add(btn);
        add(image);
    }

    private String getImageSrc(String criteria) {
        initDriver(true);
        String url = "https://www.google.com/search?q=image+" + criteria;
        driver.get(url);

        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='uciohe']"));
        int randomIndex = RandomUtils.nextInt(0, elements.size() - 1);
        WebElement imageLink = elements.get(randomIndex).findElement(By.tagName("a"));
        imageLink.click();

        List<WebElement> images = driver.findElements(By.tagName("img"));
        randomIndex = RandomUtils.nextInt(20, images.size() - 1);
        WebElement image = images.get(randomIndex);
        String src = image.getAttribute("src");
        driver.close();
        return src;
    }

    private void initDriver(boolean headless) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/webdriver/linux/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(headless);
        driver = new ChromeDriver(options);
    }

}
