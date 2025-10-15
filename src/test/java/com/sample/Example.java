package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {
@Test
public void launchUrl() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage");
        
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        System.out.println("Title: " + driver.getTitle());
        driver.quit();

}
}
