package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\Chrom\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        driver.findElement(By.id("gh-ac")).sendKeys("Laptop");
        driver.findElement(By.id("gh-btn")).sendKeys(Keys.RETURN);
    }
}

