package SimplilearnMavenSauceDemo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SauceDemoTest extends BaseTest {


		@Test

		public void addProduct() {

			SaucePages saucePages =new SaucePages(driver);

	        saucePages.username("standard_user");

			saucePages.password("secret_sauce");

			saucePages.loginButton();

	        saucePages.addToCartButton();

	        saucePages.openCartBtn();

	        saucePages.check();

	        saucePages.firstName("abc");

	        saucePages.lastName("def");

	        saucePages.postalCode("123");

	        saucePages.continueButton();

	        saucePages.finishBtn();

	        String exceptedText="Thank you for your order!";

	    	WebElement Text=driver.findElement(By.xpath("//h2[contains(@class,'complete-header')][1]"));

	    	String actualText=Text.getText();

	    	assertEquals(exceptedText,actualText);

	    	System.out.println(exceptedText);

	    	System.out.println(actualText);
	    	
	    	
		}	
		
}		

