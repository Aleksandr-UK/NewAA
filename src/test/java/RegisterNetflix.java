import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterNetflix {
@Test
    public void RefisterNetfix() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.netflix.com/ua/");
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("aleks077@icloud.com");
    driver.findElement(By.xpath("//div[@class=\"email-form-lockup\"]//button[@type=\"submit\"]")).click();
    driver.get("https://www.netflix.com/signup/password?locale=uk-UA");
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Aleksandr2107");
    driver.findElement(By.xpath("//button[@type]")).click();
    driver.get("https://www.netflix.com/signup");
    driver.findElement(By.xpath("//button[@type]")).click();
    driver.get("https://www.netflix.com/signup/planform");
    driver.findElement(By.xpath("//button[@autocomplete='off']")).click();
    driver.get("https://www.netflix.com/signup/password");
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Aleksandr2107");
    driver.findElement(By.xpath("//button[@type='submit']")).click();




}
}
