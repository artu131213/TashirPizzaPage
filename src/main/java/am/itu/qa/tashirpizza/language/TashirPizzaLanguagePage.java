package am.itu.qa.tashirpizza.language;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.tashirpizza.base.TashirpizzaBasePage;

public class TashirPizzaLanguagePage extends TashirpizzaBasePage {

	public TashirPizzaLanguagePage(WebDriver driver) {
		super(driver);
		
	}

	public static final String ARM_BTN_XPATH = "//a[@href='http://www.tashirpizza.am/arm/?___from_store=eng']";
	public static final String RU_BTN_XPATH = "//a[contains(text(),'Рус')]";
	public static final String ENG_BTN_XPATH = "//a[contains(text(),'Eng')]";

	@FindBy(xpath = ARM_BTN_XPATH)
	WebElement armBtn;
	
	@FindBy(xpath = RU_BTN_XPATH)
	WebElement ruBtn;
	
	@FindBy(xpath = ENG_BTN_XPATH)
	WebElement engBtn;

	public void clickOnArmBtn() {
		armBtn.click();

	}
	
	public void clickOnRuBtn() {
		ruBtn.click();
}
	
	public void clickOnEngBtn() {
		engBtn.click();
}
	
}
