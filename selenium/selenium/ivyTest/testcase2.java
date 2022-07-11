package ivyTest;
import  drive.driverFactory.driverFactory;
import drive.driverFactory.driverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;

import static org.testng.AssertJUnit.assertEquals;
@Test
public class testcase2 {
    public static void testHandleCheckboxes() {
        //Chon sp va loc theo mau
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //step 1
            driver.get("https://ivymoda.com/");
            //step 2
            driver.findElement(By.xpath("//*[@id=\"search-quick\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/form/div/div/div/label[1]/a")).click();
            Thread.sleep(2000);
            //step 3
            driver.findElement(By.xpath("//*[@id=\"products\"]/div/section/div/div[1]/div[1]/div/ul/li[2]/p/span[1]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"products\"]/div/section/div/div[1]/div[1]/div/ul/li[2]/div/div/label[1]/span")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"products\"]/div/section/div/div[1]/div[1]/div/div[1]/div/div[2]/button")).click();
            Thread.sleep(4000);

        }catch (Exception e){
            e.printStackTrace();

        }

        //7. Quit browser session
        driver.quit();
    }
}


