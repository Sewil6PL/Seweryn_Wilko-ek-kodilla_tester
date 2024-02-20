package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\Chrom\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        // Zamknięcie ewentualnego wyskakującego okienka z komunikatem
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            System.out.println("Brak wyskakującego okienka.");
        }

        // Przełączenie kategorii na Elektronika i wpisanie "Mavic mini" do pola wyszukiwania
        driver.findElement(By.xpath("//select[@data-role='filters-dropdown-toggle']")).click();
        driver.findElement(By.xpath("//option[text()='Elektronika']")).click();
        driver.findElement(By.cssSelector("button[data-role='search-button']")).click();
        driver.findElement(By.cssSelector("input[type='search']")).sendKeys("Mavic mini");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }
}
