package am.itu.qa.tashirpizza.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.tashirpizza.base.TashirpizzaBasePage;

public class TashirPizzaSushiPage extends TashirpizzaBasePage {

	public TashirPizzaSushiPage(WebDriver driver) {
		super(driver);
		
	}

	public static final String SUSHI_BTN_XPATH = "//li[@data-filter='category-23']";
	public static final String SUSHII_BTN_XPATH = "//button[@data-filter='.category-32']";
	public static final String ROLLS_BTN_XPATH = "//button[@data-filter='.category-33']";
	public static final String BIGROLLS_BTN_XPATH = "//button[@data-filter='.category-34']";
	public static final String ASSORTI_BTN_XPATH = "//button[@data-filter='.category-35']";
	public static final String SALADS_BTN_XPATH = "//button[@data-filter='.category-36']";
	public static final String DESSERT_BTN_XPATH = "//li[@data-filter='category-6']";
	
	@FindBy(xpath = SUSHI_BTN_XPATH)
	WebElement sushiBtn;
	
	@FindBy(xpath = SUSHII_BTN_XPATH)
	WebElement sushiiBtn;
	
	@FindBy(xpath = ROLLS_BTN_XPATH)
	WebElement rollsBtn;
	
	@FindBy(xpath = BIGROLLS_BTN_XPATH)
	WebElement bigrollsBtn;
	
	@FindBy(xpath = ASSORTI_BTN_XPATH)
	WebElement assortiBtn;
	
	@FindBy(xpath = SALADS_BTN_XPATH)
	WebElement saladsBtn;
	
	@FindBy(xpath = DESSERT_BTN_XPATH)
	WebElement dessertBtn;
	
	public void clickOnSushiBtn() {
		sushiBtn.click();
	}
	
	public void clickOnSushiiBtn() {
		sushiiBtn.click();
	}
	
	public void clickOnRollsBtn() {
		rollsBtn.click();
	}
	
	public void clickOnBigRollsBtn() {
		bigrollsBtn.click();
	}
	
	public void clickOnAssortiBtn() {
		assortiBtn.click();
	}
	
	public void clickOnSaladsBtn() {
		saladsBtn.click();
	}
	
	public void clickOnDessertBtn() {
		dessertBtn.click();
	}
	
	public boolean menuDisplayed() {
	     return sushiBtn.isDisplayed();
	
}
	
}
