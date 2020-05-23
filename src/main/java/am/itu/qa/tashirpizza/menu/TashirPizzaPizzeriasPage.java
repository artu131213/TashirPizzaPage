package am.itu.qa.tashirpizza.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.tashirpizza.base.TashirpizzaBasePage;

public class TashirPizzaPizzeriasPage extends TashirpizzaBasePage {

	public TashirPizzaPizzeriasPage(WebDriver driver) {
		super(driver);
		
	}

	public static final String YEREVAN_BTN_XPATH = "//img[@src='http://www.tashirpizza.am/media/storelocator/storelocator/1-rio_3.jpg']";
	public static final String CLOSE_BTN_XPATH = "//a[@class='fancybox-item fancybox-close']";
	public static final String GAI_BTN_XPATH = "//img[@src='http://www.tashirpizza.am/media/storelocator/storelocator/m2_1.jpg']";
	
	@FindBy(xpath = YEREVAN_BTN_XPATH)
	WebElement yerevanBtn;
	
	@FindBy(xpath = CLOSE_BTN_XPATH)
	WebElement closeBtn;
	
	@FindBy(xpath = GAI_BTN_XPATH)
	WebElement gaiBtn;
	
	public void clickOnYerevanBtn() {
		yerevanBtn.click();
	}
	
	public void clickOnCloseBtn() {
		closeBtn.click();
	}
	
	public void clickOnGaiBtn() {
		gaiBtn.click();
	}
	
	public boolean menuDisplayed() {
	     return yerevanBtn.isDisplayed();
	
}
	
}
