package SimplilearnMavenSauceDemo;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceDemo {
	
	static WebDriver driver;
	@BeforeTest
	public void launchApplication() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		}

	@Test
	public void main() throws InterruptedException {
		WebElement usr=driver.findElement(By.id("user-name"));
		usr.sendKeys("standard_user");
		WebElement pwd=driver.findElement(By.id("password"));
		pwd.sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	driver.findElement(By.id("shopping_cart_container")).click();
	driver.findElement(By.id("checkout")).click();
	
	WebElement fn=driver.findElement(By.id("first-name"));
	fn.sendKeys("ABC");
	
	//Thread.sleep(2000);
	WebElement ln=driver.findElement(By.id("last-name"));
	ln.sendKeys("DEF");
	
	//Thread.sleep(2000);
	WebElement pc=driver.findElement(By.id("postal-code"));
	pc.sendKeys("123");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("finish")).click();
	String exceptedText="Thank you for your order!";
	WebElement text=driver.findElement(By.xpath("//h2[contains(@class,'complete-header')][1]"));
	String actualText=text.getText();
	assertEquals(exceptedText,actualText);

	System.out.println(exceptedText);
	System.out.println(actualText);
	}


    @AfterTest

    public void closeBrowser() {
	    driver.quit();
	
    }
}