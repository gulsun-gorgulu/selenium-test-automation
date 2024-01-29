package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsiderHomePage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://useinsider.com");
        String title = driver.getTitle();
        System.out.println("title = " + title);
        String url = driver.getCurrentUrl();
        System.out.println("url = " + url);
    }
}
