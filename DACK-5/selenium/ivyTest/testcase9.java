package ivyTest;

import drive.driverFactory.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class testcase9 {
    public static void testHandleCheckboxes() {
        //1. Dang ky tai khoan
        WebDriver driver = driverFactory.getChromeDriver();
//        try {
//            //step 1 đi đến trang ivymoda
//            driver.get("https://ivymoda.com");
//            Thread.sleep(2000);
//            //step 2 click đăng nhập
//            driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/div[2]/a/i")).click();
//            Thread.sleep(2000);
//            //step 3 đi đến trang đăng ký
//            driver.findElement(By.xpath("//div[1]/a[1]/button[1]")).click();
//            Thread.sleep(3000);
//            //step 4 thực hiện đăng ký
//            //enter ho
//            driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Le");
//            Thread.sleep(3000);
//            //enter ten
//            driver.findElement(By.xpath("//*[@placeholder=\"Tên...\"]")).clear();
//            driver.findElement(By.xpath("//*[@placeholder=\"Tên...\"]")).sendKeys("Tinh");
//            Thread.sleep(3000);
//            //enter Email
//            driver.findElement(By.xpath("//*[@id='main']/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/input[1]")).clear();
//            driver.findElement(By.xpath("//*[@id='main']/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("letinh110@gmail.com");
//            Thread.sleep(2000);
//            //enter Điện thoại
//            driver.findElement(By.xpath("//*[@id='main']/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/input[1]")).clear();
//            driver.findElement(By.xpath("//*[@id='main']/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys("0328691781");
//            Thread.sleep(2000);
//            //enter Ngày sinh
//            driver.findElement(By.xpath("//*[@id='main']/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]")).clear();
//            driver.findElement(By.xpath("//*[@id='main']/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]")).sendKeys("09/02/1995");
//            Thread.sleep(2000);
//            //enter Giới tính
//            Select gt = new Select(driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/form/div[1]/div[4]/div[2]/div/select")));
//            gt.selectByVisibleText("Nam");
//            Thread.sleep(2000);
//            //enter Tỉnh/ Thành Phố
//            Select tp = new Select(driver.findElement(By.xpath("//*[@id='main']/div[1]/div[2]/div[1]/form[1]/div[1]/div[5]/div[1]/div[1]/select[1]")));
//            tp.selectByVisibleText("Hồ Chí Minh");
//            Thread.sleep(2000);
//            //enter Quận/ Huyện
//            Select huyen = new Select(driver.findElement(By.xpath("//*[@id='main']/div[1]/div[2]/div[1]/form[1]/div[1]/div[5]/div[2]/div[1]/select[1]")));
//            huyen.selectByVisibleText("Tân Phú");
//            Thread.sleep(2000);
//            //enter Phường/ Xã
//            Select xa = new Select(driver.findElement(By.xpath("//*[@id='main']/div[1]/div[2]/div[1]/form[1]/div[1]/div[6]/div[1]/div[1]/select[1]")));
//            xa.selectByVisibleText("Hòa Thạnh");
//            Thread.sleep(2000);
//            //enter địa chỉ
//            driver.findElement(By.xpath("//*[@id='main']/div/div/div/form/div/div/div/div/textarea[1]")).clear();
//            driver.findElement(By.xpath("//*[@id='main']/div/div/div/form/div/div/div/div/textarea[1]")).sendKeys("13 Luy Ban Bich");
//            Thread.sleep(2000);
//            //enter mật khẩu
//            driver.findElement(By.xpath("//*[@id='main']/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/input[1]")).clear();
//            driver.findElement(By.xpath("//*[@id='main']/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/input[1]")).sendKeys("tinh1234");
//            Thread.sleep(2000);
//            //enter Nhập lại mật khẩu
//            driver.findElement(By.xpath("//*[@id='main']/div[1]/div[2]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/input[1]")).clear();
//            driver.findElement(By.xpath("//*[@id='main']/div[1]/div[2]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/input[1]")).sendKeys("tinh1234");
//            Thread.sleep(2000);
//            // Nhập mã Capcha ( Nhập tay đúng theo hình)
//            Thread.sleep(20000);
//            //check điều khoản
//            driver.findElement(By.xpath("//*[@id='main']/div[1]/div[2]/div[1]/form[1]/div[2]/div[5]/div[1]/div[1]/input[1]")).click();
//            driver.findElement(By.xpath("//*[@id='main']/div[1]/div[2]/div[1]/form[1]/div[2]/div[5]/div[2]/div[1]/input[1]")).click();
//            Thread.sleep(2000);
//            //Submit
//            driver.findElement(By.xpath("//*[@id=\"bnt_register\"]")).click();
//            Thread.sleep(3000);
//        }catch (Exception e){
//            e.printStackTrace();
//
//        }
//
//        // Quit browser session
//        driver.quit();
        try {
        //step 1
        driver.get("https://ivymoda.com/");
        //step 2
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/div[2]/a/i")).click();
        //step 3
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div[2]/div/div/a/button")).click();


        //step 4

        //enter ho
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/form/div[1]/div[2]/div[1]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/form/div[1]/div[2]/div[1]/div/input")).sendKeys("letran");
        Thread.sleep(2000);

        //enter email
        driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("letinh110@gmail.com");
        Thread.sleep(2000);
//
//
       // enter birthday
            driver.findElement(By.xpath("//*[@id='main']/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]")).clear();
            driver.findElement(By.xpath("//*[@id='main']/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]")).sendKeys("09/02/1995");
//        driver.findElement(By.xpath("//*[@id=\"dp1656858696949\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"dp1656858696949\"]")).sendKeys("10/10/2010");
        Thread.sleep(2000);

        //enter city
        driver.findElement(By.xpath("//*//*[@id=\"register_region_id\"]")).click();
        driver.findElement(By.xpath("//*//*[@id=\"register_region_id\"]")).sendKeys("Trà Vinh");
        Thread.sleep(2000);


            //enter provide //*[@id="vnward_id"]
            driver.findElement(By.xpath("//*[@id=\"register_city_id\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"register_city_id\"]")).sendKeys("Càng Long");
            Thread.sleep(2000);
//
            //enter address city
            driver.findElement(By.xpath("//*[@id=\"vnward_id\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"vnward_id\"]")).sendKeys("Càng Long");
            Thread.sleep(2000);

//
            //enter address
            driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/form/div[1]/div[7]/div/div/textarea")).click();
            driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/form/div[1]/div[7]/div/div/textarea")).sendKeys("adc");
            Thread.sleep(2000);
//
            //enter name
            driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/form/div[1]/div[2]/div[2]/div/input")).click();
            driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/form/div[1]/div[2]/div[2]/div/input")).sendKeys("tinh");
            Thread.sleep(2000);

            //enter Numberphone
            driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/form/div[1]/div[3]/div[2]/div/input")).click();
            driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/form/div[1]/div[3]/div[2]/div/input")).sendKeys("0123456789");
            Thread.sleep(2000);

            //enter set
            driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/form/div[1]/div[4]/div[2]/div/select")).click();
            driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/form/div[1]/div[4]/div[2]/div/select/option[2]")).click();
            Thread.sleep(2000);



            //enter password
            driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/form/div[2]/div[2]/div/div/input")).click();
            driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/form/div[2]/div[2]/div/div/input")).sendKeys("abcdef");
            Thread.sleep(2000);

            //enter again password
            driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/form/div[2]/div[3]/div/div/input")).click();
            driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/form/div[2]/div[3]/div/div/input")).sendKeys("abcdef");
            Thread.sleep(20000);
            //enter

            driver.findElement(By.xpath("//*[@id=\"bnt_register\"]")).click();
            Thread.sleep(20000);
    }catch (Exception e){
        e.printStackTrace();

    }

    //7. Quit browser session
        driver.quit();
    }

}
