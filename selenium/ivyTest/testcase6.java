


package ivyTest;

import drive.driverFactory.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class testcase6 {
    public static void testHandleCheckboxes() {
        //1. loc theo chiec khau
        WebDriver driver = driverFactory.getChromeDriver();
        // Loc theo
        try {
            //step 1 đi đến trang ivymoda.com
            driver.get("https://ivymoda.com/");
            //step 2
            driver.findElement(By.xpath("//*[@id=\"search-quick\"]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/form/div/div/div/label[1]/a")).click();
            Thread.sleep(2000);
            //step 3
            driver.findElement(By.xpath("//*[@id=\"products\"]/div/section/div/div[1]/div[1]/div/ul/li[4]/p/span[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"products\"]/div/section/div/div[1]/div[1]/div/ul/li[4]/div/label[1]/span")).click();
            Thread.sleep(2000);
            //step 4
            driver.findElement(By.xpath("//*[@id=\"products\"]/div/section/div/div[1]/div[1]/div/div[1]/div/div[2]/button")).click();
            Thread.sleep(2000);

        }catch (Exception e){
            e.printStackTrace();

        }
        driver.close();
        driver.quit();
    }
}