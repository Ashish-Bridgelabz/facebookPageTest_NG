package com.bridgelabz.facebook.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PostArticlePage {
    WebDriver driver;

    //By textArea = By.xpath("//*[@id=\"js_6m\"]/div[1]/div/div[1]/div[1]/div[2]/div/div/div/div/div/div/div[1]");
    // By textArea = By.xpath("//*[@id=\"js_14\"]/div[1]/div/div[1]/div[1]/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div");
    // By textArea = By.xpath("//*[@id=\"facebook\"]/body");
    // By textArea = By.xpath("//div[@class='m9osqain a5q79mjw']");
    // By textArea = By.xpath("/html/body");
    //LOCATING ELEMENTS
    By textArea = By.xpath("//*[@id=\"facebook\"]/body");
    By textBox = By.xpath("//*[@id=\"js_6m\"]/div[1]/div/div[1]/div[1]/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div");
    By privacy = By.xpath("//span[@class='l3itjdph cga1ltu']");
    By post = By.xpath("//*[@id=\"js_6m\"]/div[2]/div[3]/div[2]/button/span");

    public PostArticlePage(WebDriver driver) {

        this.driver = driver;
    }

    //THIS METHOD IS FOR CLICK ON TEXT AREA
    public void statusTextArea() {

        driver.findElement(textArea).click();
    }

    //THIS METHOD IS FOR DISPLAY THE MESSAGE
    public void textBoxArea(String message) {
        driver.findElement(textBox).sendKeys(message);
    }

    //THIS METHOD IS FOR PRIVACY
    public void privacyOnlyForMe() {
        driver.findElement(privacy).click();
    }

    //THIS METHOD FOR CLICK ON POST BUTTON
    public void postButton() {
        driver.findElement(post).click();
    }


}
