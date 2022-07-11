package ivyTest;
import  drive.driverFactory.driverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;

import static org.testng.AssertJUnit.assertEquals;
@Test
public class testcase1 {
    public static void testHandleCheckboxes() {
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //step 1
            driver.get("https://ivymoda.com/");
            //step 2
            driver.findElement(By.xpath("//*[@id=\"search-quick\"]")).click();

            driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/form/div/div[1]/div/label[1]")).click();
            Thread.sleep(2000);

        }catch (Exception e){
            e.printStackTrace();

        }

        //7. Quit browser session
        driver.quit();
    }
}


