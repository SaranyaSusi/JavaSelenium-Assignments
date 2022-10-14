package week2.day1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement elementCreateAccount = driver.findElement(By.linkText("Create New Account"));
		elementCreateAccount.click();
		
		WebElement firstname=driver.findElement(By.name("firstname"));
		firstname.sendKeys("Saranya");
		
		WebElement Lastnamename=driver.findElement(By.name("lastname"));
		Lastnamename.sendKeys("Vadivelu");
		
		
				
		
		}
}
