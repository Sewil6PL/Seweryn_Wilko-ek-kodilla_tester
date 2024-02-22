package com.kodilla.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaStoreSearchTest {public static void main(String[] args) {
    // Ścieżka do chromedriver.exe - należy dostosować do własnej konfiguracji
    System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\Chrom\\chromedriver.exe");

    // Inicjalizacja WebDrivera
    WebDriver driver = new ChromeDriver();

    // Przejście do strony Kodilla Store
    driver.get("https://kodilla.com/pl/test/store");

    // Lista fraz do wyszukania
    String[] searchPhrases = {"NoteBook", "School", "Brand", "Business", "Gaming", "Powerful"};

    // Testy dla każdej z fraz
    for (String phrase : searchPhrases) {
        // Wyszukiwanie frazy
        WebElement searchInput = driver.findElement(By.cssSelector("input[name='search']"));
        searchInput.clear();
        searchInput.sendKeys(phrase);
        searchInput.sendKeys(Keys.ENTER);

        // Pobranie liczby wyników wyszukiwania
        WebElement searchResult = driver.findElement(By.cssSelector(".search-results-count"));
        int resultCount = Integer.parseInt(searchResult.getText().replaceAll("\\D", ""));

        // Weryfikacja czy liczba wyników jest poprawna
        System.out.println("Wyszukiwanie frazy: " + phrase);
        if (resultCount == 0) {
            System.out.println("Brak wyników dla frazy: " + phrase);
        } else {
            System.out.println("Liczba wyników dla frazy " + phrase + ": " + resultCount);
        }
    }

    // Zamknięcie przeglądarki
    driver.quit();
}
}