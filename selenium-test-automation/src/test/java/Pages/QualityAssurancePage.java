package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class QualityAssurancePage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://useinsider.com/careers/quality-assurance/");
        Thread.sleep(100);
        // Click the 'QAJobsMenu'
        WebElement SeeallQAjobs = driver.findElement(By.xpath("//div[@class = \"button-group d-flex flex-row\"]"));
        SeeallQAjobs.click();

        // Click the 'Filter' menu

        //WebElement FilterMenuButton = driver.findElement(By.xpath("//div/button[@class='btn d-flex']"));
        //FilterMenuButton.click();

        // Click the 'Filter by location' menu
        WebElement FilterDropDown= driver.findElement(By.xpath("//span[@class=\"select2-selection__rendered\"]"));
        FilterDropDown.click();
        List<WebElement> FilterbyMenu = driver.findElements(By.xpath("//span[@class=\"select2-selection select2-selection--single\"]"));
        for(WebElement element : FilterbyMenu){
            if(element.getText().equals("//span[@aria-activedescendant]")){
                    element.click();
                    break;
            }

        }

        // Click the 'SelectIstanbul' menu
        WebElement SelectIstanbul = driver.findElement(By.xpath("//span[@id= \"select2-filter-by-location-container\"]"));
        SelectIstanbul.click();

        // Click the 'Filter by Department' menu
        WebElement FilterbyDepartment = driver.findElement(By.xpath("//span[@class= \"select2-selection select2-selection--single\"]"));
        FilterbyDepartment.click();

        // Click the 'Quality Assurance' menu
        WebElement SelectQualityAssurance = driver.findElement(By.xpath("//span[@class=\"select2-selection__rendered\"]"));
        SelectQualityAssurance.click();





    }
}
