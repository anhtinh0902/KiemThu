package ivyTest;

import drive.driverFactory.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class testcase4 {
    public static void testHandleCheckboxes() {
        //mua hang
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //step 1
            driver.get("https://ivymoda.com/");
            //step 2
            driver.findElement(By.xpath("//*[@id=\"search-quick\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/form/div/div[1]/div/label[1]")).click();
            Thread.sleep(2000);
            //step 3
            driver.findElement(By.xpath("//*[@id=\"products\"]/div/section/div/div[1]/div[2]/div[2]/div/div[1]/div/div[4]/a")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"products\"]/div/section/div/div[1]/div[2]/div[1]/div/div[1]/div/div[6]/a")).click();
            //*[@id="products"]/div/section/div/div[1]/div[2]/div[1]/div/div[1]/div/div[6]/a

        }catch (Exception e){
            e.printStackTrace();

        }

        //7. Quit browser session
        driver.quit();
    }
}
