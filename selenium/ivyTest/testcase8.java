package ivyTest;

import drive.driverFactory.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class testcase8 {
    public static void testHandleCheckboxes() {
        //Dang nhap tai khoang
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //step 1
            driver.get("https://ivymoda.com/");
            //step 2
            driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/div[2]/a/i")).click();
            //step 3
            driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div[1]/div/form/div[1]/input")).click();
            driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div[1]/div/form/div[1]/input")).sendKeys("letinh110@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div[1]/div/form/div[2]/input")).click();
            driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div[1]/div/form/div[2]/input")).sendKeys("tinh1234");
            Thread.sleep(2000);
            //step 4
            driver.findElement(By.xpath("//*[@id=\"but_login_email\"]")).click();
            Thread.sleep(2000);
            //step 5
            driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[3]/div[2]/div[1]/form/div[8]/div[2]/button")).click();
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();

        }

        //7. Quit browser session
        driver.quit();
    }
}
