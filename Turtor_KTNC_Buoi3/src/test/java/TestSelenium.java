import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestSelenium {
    EdgeDriver edgeDriver;
    @BeforeEach
    public void setUp(){
        WebDriverManager.edgedriver().setup();

        edgeDriver = new EdgeDriver();
    }

//    @Test
//    public void test(){
//        edgeDriver.get("https://cchatclothes.vn/user/signup");
//        WebElement inputName = edgeDriver.findElement(By.xpath("//input[@id='fullName']"));
//        inputName.sendKeys("phuocdm1702");
//
//        WebElement inputPhone = edgeDriver.findElement(By.xpath("//input[@id='mobile']"));
//        inputPhone.sendKeys("0325262006");
//
//        WebElement inputEmail = edgeDriver.findElement(By.xpath("//input[@id='email']"));
//        inputEmail.sendKeys("phuocdm1702@gmail.com");
//
//        WebElement inputPass = edgeDriver.findElement(By.xpath("//input[@id='password']"));
//        inputPass.sendKeys("Cn8935001853152");
//
//        WebElement btnDangKy = edgeDriver.findElement(By.xpath("//button[@id='btnsingup']"));
//        btnDangKy.click();
//
//
//
////        edgeDriver.navigate().refresh();
////        edgeDriver.navigate().back();
////        edgeDriver.navigate().forward();
//    }

    @Test
    public void testDangNhap(){
        edgeDriver.get("https://cchatclothes.vn/user/signin");
        WebElement inputUserName = edgeDriver.findElement(By.xpath("//input[@id='username']"));
        inputUserName.sendKeys("phuocdm1702@gmail.com");

        WebElement inputPasss = edgeDriver.findElement(By.xpath("//input[@id='password']"));
        inputPasss.sendKeys("Cn8935001853152");

        WebElement btnDangNhap = edgeDriver.findElement(By.xpath("//button[@id='btnsignin']"));
        btnDangNhap.click();

    }


//    @AfterEach
//    public void tearDown(){
//        if(edgeDriver != null){
//            edgeDriver.quit();
//        }
//    }

}
