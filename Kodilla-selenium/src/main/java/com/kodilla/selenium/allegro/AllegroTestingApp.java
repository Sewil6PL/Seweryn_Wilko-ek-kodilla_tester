package com.kodilla.selenium.allegro;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\Chrom\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        // Oczekiwanie na załadowanie strony i pierwszego wyniku wyszukiwania
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-role='search-user']")));

        // Zamknięcie ewentualnego wyskakującego okienka z komunikatem
        try {
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            System.out.println("Brak wyskakującego okienka.");
        }

        // Przełączenie kategorii na Elektronika i wpisanie "Mavic mini" do pola wyszukiwania
        driver.findElement(By.cssSelector("button[data-role='filters-dropdown-toggle']")).click();
        driver.findElement(By.cssSelector("option[value='/kategoria/elektronika']")).click();
        driver.findElement(By.cssSelector("button[data-role='search-button']")).click();
        driver.findElement(By.cssSelector("input[type='search']")).sendKeys("Mavic mini");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Znalezienie wszystkich kart produktów
        List<WebElement> productCards = driver.findElements(By.cssSelector("section > article"));

        // Wyświetlenie informacji o produktach
        for (WebElement card : productCards) {
            System.out.println(card.getText());
        }

        // Zamknięcie przeglądarki
        driver.quit();
    }
}

