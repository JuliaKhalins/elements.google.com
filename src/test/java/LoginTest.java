import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class LoginTest {

        private WebDriver driver;

        @Before
        public void start()  {
            driver = new ChromeDriver();

        }

        @Test
        public void TestForm() {

            driver.navigate().to("http://localhost/litecart/en/");
            driver.findElement(By.name("email")).sendKeys("julia@gmail.com");
            driver.findElement(By.name("password")).sendKeys("ducks");
            driver.findElement(By.name("login")).click();

        }

        @After
        public void stop() {
            driver.quit();
            driver = null;
        }
    }
