package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeaftapDropDown {
	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@href='pages/Dropdown.html']")).click();
		WebElement dropIndex = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select dd1=new Select(dropIndex);
		dd1.selectByIndex(3);
		WebElement dropText = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select dd2=new Select(dropText);
		dd2.selectByVisibleText("UFT/QTP");
		WebElement dropValue = driver.findElement(By.xpath("//select[@id='dropdown3']"));
		Select dd3=new Select(dropValue);
		dd3.selectByValue("3");
		WebElement getOption = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select dd4=new Select(getOption);
		List<WebElement> options = dd4.getOptions();
		System.out.println(options.size());
		WebElement multiSelect = driver.findElement(By.xpath("(//select)[6]"));
		Select combo=new Select(multiSelect);
		combo.selectByVisibleText("Selenium");
		combo.selectByVisibleText("Appium");
		combo.selectByVisibleText("UFT/QTP");
		combo.selectByVisibleText("Loadrunner");
		Thread.sleep(2000);
		combo.deselectByVisibleText("Appium");
		combo.deselectByVisibleText("Selenium");
		
		driver.close();

	}

}
