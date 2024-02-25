package com.kodilla.selenium.visual;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Paths;
import java.util.logging.Logger;

public class OcularExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(chromeOptions);

        //Ocular.config()
              //  .resultPath(Paths.get("C:\\Users\\PC\\Desktop\\SEW\\AAAATester automatyzujący szkolenie\\results"))
             //   .snapshotPath(Paths.get("C:\\Users\\PC\\Desktop\\SEW\\AAAATester automatyzujący szkolenie\\snapshots"))
              //  .globalSimilarity(95)
               // .saveSnapshot(true);

        WorldTimePage page = new WorldTimePage(webDriver);

        page.open();
        page.close();
    }
}