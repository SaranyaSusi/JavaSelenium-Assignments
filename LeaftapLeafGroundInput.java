package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeaftapLeafGroundInput {
	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		Thread.sleep(2000);
		driver.findElement(By.id("j_idt88:name")).sendKeys("Saranya Susi");

		
		WebElement countryName = driver.findElement(By.id("j_idt88:j_idt91"));
		countryName.sendKeys(":India");

	
		boolean disabled = driver.findElement(By.id("j_idt88:j_idt93")).isDisplayed();
		System.out.println("The textbox disabled is" + " " + disabled);

		
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt88:j_idt95")).clear();

		
		WebElement retreiveText = driver.findElement(By.id("j_idt88:j_idt97"));
		String text = retreiveText.getAttribute("value");
		System.out.println("The Retreived text from the textbox is" + " " + text);

		
		driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("saranya@gmail.com", Keys.TAB);

		
		WebElement description = driver.findElement(By.tagName("textarea"));
		description.sendKeys(
				"I am stronger than what you think about me");

		
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		String errorMessgae = driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText();
		System.out.println("The Error message is" + " " + errorMessgae);

		
		Thread.sleep(5);
		WebElement typeName = driver.findElement(By.id("j_idt106:auto-complete_input"));
		typeName.sendKeys("Saranya");
		driver.findElement(By.xpath("//li[@data-item-label='Saranya3']")).click();

		
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt106:j_idt116_input")).sendKeys("12/11/1992");
		WebElement bdayDate = driver.findElement(By.id("j_idt106:j_idt116_input"));
		String bday = bdayDate.getText();
		if (!bdayDate.equals(bday)) {
			System.out.println("You have choosen the DOB correctly");
		} else {
			System.out.println("You have not choosen the DOB correctly");

		}

		// type number and confirm the value change
		Thread.sleep(2000);
		WebElement sendNumber = driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']"));
		sendNumber.sendKeys("99");
		String textNum = sendNumber.getText();
		driver.findElement(By.xpath("(//span[@class='ui-button-text'])[3]")).click();
		WebElement textTwo = driver.findElement(By.id("j_idt106:j_idt118_input"));
		String textSecondNum = textTwo.getText();
		if (!textNum.equals(textSecondNum)) {
			System.out.println("The Number is not Changed");
		} else {
			System.out.println("The Number is Changed");
		}

		driver.close();

	}

}
