package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CareersPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://useinsider.com");

        // Click the 'Company' menu
        WebElement companyMenu = driver.findElement(By.linkText("Company"));
        companyMenu.click();

        // Click 'Careers'
        WebElement careersLink = driver.findElement(By.linkText("Careers"));
        careersLink.click();

        // Check if Career page is open (you can use driver.getTitle() for this)

        // Check if Our Locations block is open
        WebElement OurLocationsOpen = driver.findElement(By.xpath("//div/h2[@class= 'elementor-heading-title elementor-size-default']"));
        System.out.println("OurLocationsOpen.isDisplayed() = " + OurLocationsOpen.isDisplayed());

        // Check if Teams block is open
        List<WebElement> TeamsOpen = driver.findElements(By.linkText("Teams"));
        if (!TeamsOpen.isEmpty()){
            System.out.println("TeamsOpen.isDisplayed() = " + TeamsOpen.get(0).isDisplayed());
        }else
            System.out.println("Teams element is not available");


        // Check if Life at Insider block is open
        WebElement LifeatInsiderOpen = driver.findElement(By.xpath("//div/h2[@class= 'elementor-heading-title elementor-size-default']"));
        System.out.println("LifeatInsiderOpen.isDisplayed() = " + LifeatInsiderOpen.isDisplayed());

    }
}


