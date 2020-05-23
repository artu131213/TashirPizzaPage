package am.itu.qa.tashirpizza.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.tashirpizza.base.TashirpizzaBasePage;


public class TashirPizzaContactsPage extends TashirpizzaBasePage {

	public TashirPizzaContactsPage(WebDriver driver) {
		super(driver);
		
	}
	
	public static final String NAME_INPUT_XPATH = "//input[@name='name']";
	public static final String EMAIL_INPUT_XPATH = "//input[@name='email']";
	public static final String TELEPHONE_INPUT_XPATH = "//input[@name='telephone']";
	public static final String COMMENT_INPUT_XPATH = "//textarea[@name='comment']";
	public static final String SUBMIT_BTN_XPATH = "//button[@type='submit']";
	public static final String ERROR_XPATH = "//div[@class='validation-advice']";
	
	@FindBy(xpath = NAME_INPUT_XPATH)
	WebElement nameInput;

	@FindBy(xpath = EMAIL_INPUT_XPATH)
	public WebElement emailInput;

	@FindBy(xpath = TELEPHONE_INPUT_XPATH)
	WebElement telephoneInput;
	
	@FindBy(xpath = COMMENT_INPUT_XPATH)
	WebElement commentInput;

	@FindBy(xpath = SUBMIT_BTN_XPATH)
	WebElement submitBtn;

	@FindBy(xpath = ERROR_XPATH)
	WebElement errorMsg;

	public void typeName(String name) {
		nameInput.sendKeys(name);
	}

	public void typeEmail(String email) {
		emailInput.sendKeys(email);

	}

	public void typeTelephone(String telephone) {
		telephoneInput.sendKeys(telephone);

	}
	
	public void typeComment(String comment) {
	    commentInput.sendKeys(comment);

	}
	
	public void clickOnSubmitBtn() {
		submitBtn.click();
	}

	public boolean contactsDisplayed() {
		return errorMsg.isDisplayed();
	}


}
