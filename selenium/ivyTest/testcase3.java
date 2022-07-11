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
public class testcase3 {
    public static void testHandleCheckboxes() {
        //1. them vao gio hang
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //step 1
            driver.get("https://ivymoda.com/");
            //step 2
            driver.findElement(By.xpath("//*[@id=\"search-quick\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/form/div/div/div/label[1]/a")).click();
            Thread.sleep(2000);
            //step 3
            driver.findElement(By.xpath("//*[@id=\"products\"]/div/section/div/div[1]/div[2]/div[2]/div/div[1]/div/div[4]/a")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"products\"]/div/section/div/div[1]/div[2]/div[2]/div/div[1]/div/div[5]/ul/li[1]/button")).click();
            Thread.sleep(2000);
            //step 4
            driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/div[4]/a")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/div[4]/div/div[3]/div[2]/a")).click();
            Thread.sleep(2000);
            //step 5
            driver.findElement(By.xpath("//*[@id=\"box_product_total_cart\"]/div[1]/table/tbody/tr[1]/td[3]/div/div[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"box_product_total_cart\"]/div[1]/table/tbody/tr[1]/td[3]/div/div[2]")).click();
            Thread.sleep(2000);
            //step 6
            driver.findElement(By.xpath("//*[@id=\"box_product_total_cart\"]/div[1]/table/tbody/tr[1]/td[5]/a/span")).click();
            //*[@id="box_product_total_cart"]/div[1]/table/tbody/tr[1]/td[5]/a/span





        }catch (Exception e){
            e.printStackTrace();

        }

        //7. Quit browser session
        driver.quit();
    }
}


