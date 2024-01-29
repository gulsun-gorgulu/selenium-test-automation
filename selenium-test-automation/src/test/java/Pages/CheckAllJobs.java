package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckAllJobs {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //all jobs' Position
        driver.get("https://useinsider.com/careers/open-positions/?department=qualityassurance");

        // Check if Position block is contains
        List<WebElement> PositionContains = driver.findElements(By.linkText("Quality Assurance"));
        if (!PositionContains.isEmpty()){
            System.out.println("PositionContains.isDisplayed() = " + PositionContains.get(0).isDisplayed());
        }else
            System.out.println("Position is not contains Quality Assurance");

        // Check if Department block is contains
        List<WebElement> DepartmentContains = driver.findElements(By.xpath("//span[@class= \"position-department text-large font-weight-600 text-primary\"]"));
        if (!DepartmentContains.isEmpty()){
            System.out.println("DepartmentContains.isDisplayed() = " + DepartmentContains.get(0).isDisplayed());
        }else
            System.out.println("Department is not contains Quality Assurance");

        // Check if Location block is contains
        List<WebElement> LocationContains = driver.findElements(By.xpath("//div[@class =\"position-location text-large\"]"));
        if (!DepartmentContains.isEmpty()){
            System.out.println("LocationContains.isDisplayed() = " + LocationContains.get(0).isDisplayed());
        }else
            System.out.println("Location is not contains Istanbul, Turkey");
    }

}
