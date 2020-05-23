package am.itu.qu.tashirpizza.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class MenuBaseTest {
	protected WebDriver driver;
	public static final String TASHIR_PIZZA_URL = "http://www.tashirpizza.am/eng/";

	@BeforeClass
	public void prepareEnv() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(TASHIR_PIZZA_URL);
		driver.manage().window().maximize();

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
