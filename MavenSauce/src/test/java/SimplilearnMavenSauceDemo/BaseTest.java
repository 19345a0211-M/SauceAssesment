package SimplilearnMavenSauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {


		static WebDriver driver;

		@BeforeTest

		public void launchApplication() {

			driver=new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://www.saucedemo.com/");

			}

		@AfterTest

		public void closeBrowser() {

			driver.quit();

		}



}

