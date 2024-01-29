package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class LeverApplicationPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://useinsider.com/careers/quality-assurance/");
        Thread.sleep(100);
        // Click the 'QAJobsMenu'
        WebElement SeeallQAjobs = driver.findElement(By.xpath("//div[@class = \"button-group d-flex flex-row\"]"));
        SeeallQAjobs.click();
        // Click the 'Filter by Department' menu
        WebElement FilterbyDepartment = driver.findElement(By.xpath("//span[@class= \"select2-selection select2-selection--single\"]"));
        FilterbyDepartment.click();

        // Click the 'Quality Assurance' menu
        WebElement SelectQualityAssurance = driver.findElement(By.xpath("//span[@class=\"select2-selection__rendered\"]"));
        SelectQualityAssurance.click();

        // Click the 'Filter' menu
        // Click the 'Filter by location' menu
        WebElement FilterDropDown = driver.findElement(By.xpath("//span[@class=\"select2-selection__rendered\"]"));
        FilterDropDown.click();
        List<WebElement> FilterbyMenu = driver.findElements(By.xpath("//span[@class=\"select2-selection select2-selection--single\"]"));
        for (WebElement element : FilterbyMenu) {
            if (element.getText().equals("//span[@aria-activedescendant]")) {
                element.click();
                break;
            }

        }
        // Click the 'SelectIstanbul' menu
        WebElement SelectIstanbul = driver.findElement(By.xpath("//span[@id= \"select2-filter-by-location-container\"]"));
        SelectIstanbul.click();


        // View Role butonunu bulmak için ilk olarak iş ilanlarının üstüne gitmeliyiz sonrasında View Role butonu görünür olacak ona tıklayacağız
        WebElement Clickthepage = driver.findElement(By.xpath("//div[@class=\"position-list-item-wrapper bg-light\"]"));
        WebElement viewRoleLink = driver.findElement(By.linkText("View Role"));

        Actions actions = new Actions(driver);
        actions
                .moveToElement(Clickthepage)
                .build()
                .perform();
        Thread.sleep(500);
        viewRoleLink.click();

        // Tarayıcıyı kapatın
        driver.quit();
    }
}
