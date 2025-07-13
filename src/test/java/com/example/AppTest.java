package com.example;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertTrue;

public class AppTest {
    @Test
    public void testGoogleTitle() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // runs without opening browser
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        driver.quit();

        assertTrue(title.contains("Google"));
    }
}
