package SimplilearnMavenSauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaucePages {
	

		 WebDriver driver;

		 public SaucePages(WebDriver driver) {
			 PageFactory.initElements(driver,this);
		 }

		@FindBy(id="user-name")
		WebElement usr;

		@FindBy(id="password")
		WebElement pwd;

		@FindBy(id="login-button")
		WebElement loginBtn;

		@FindBy(id="add-to-cart-sauce-labs-backpack")
		WebElement addToCart;

		@FindBy(id="shopping_cart_container")
		WebElement openCart;

		@FindBy(id="checkout")
		WebElement checkOut;
		
		@FindBy(id="first-name")
		WebElement fn;

		@FindBy(id="last-name")
		WebElement ln;

		@FindBy(id="postal-code")
		WebElement pc;

		@FindBy(id="continue")
		WebElement con;

		@FindBy(id="finish")
		WebElement fin;

		public void username(String arg) {
			usr.sendKeys(arg);
		}

		public void password(String arg) {
			pwd.sendKeys(arg);

		}

		public void loginButton() {
			loginBtn.click();

		}

		

		public void addToCartButton() {
			addToCart.click();

		}

		public void openCartBtn() {
			openCart.click();

		}

		public void check() {
			checkOut.click();

			}

		public void firstName(String arg) {
			fn.sendKeys(arg);

		}

		public void lastName(String arg) {
			ln.sendKeys(arg);

		}

		public void postalCode(String arg) {
			pc.sendKeys(arg);

		}

		public void continueButton() {
			con.click();

		}

		public void finishBtn() {
			fin.click();

		}

}
