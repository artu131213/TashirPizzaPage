package am.itu.qa.tashirpizza.menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.tashirpizza.base.TashirpizzaBasePage;

public class TashirPizzaCheckoutPage extends TashirpizzaBasePage{

	public TashirPizzaCheckoutPage(WebDriver driver) {
		super(driver);
		
	}

	public static final String PIZZA_BTN_XPATH = "//li[@data-filter='.category-3']";
	public static final String TWO_BTN_XPATH = "//form[@id='product_addtocart_form_67_1']/div/div/span[2]";
	public static final String ADD_TO_CART_BTN_XPATH = "//form[@id='product_addtocart_form_67_1']/div/button";
	public static final String MY_CART_BTN_XPATH = "//html[@id='top']/body/div[2]/div/div[5]/div/div/div[2]/div/div/div";
	public static final String CHECKOUT_BTN_XPATH = "//button[@class='cart_sidebar_action_button']";
	public static final String NAME_INPUT_XPATH = "//input[@id='billing:firstname']";
	public static final String LASTNAME_INPUT_XPATH = "//input[@id='billing:lastname']";
	public static final String EMAIL_INPUT_XPATH = "//input[@name='billing[email]']";
	public static final String ADDRESS_INPUT_XPATH = "//input[@title='Street Address']";
	public static final String STATE_BTN_XPATH = "//select[@id='billing:region_id']";
	public static final String PROVINCE_BTN_XPATH = "//option[@value='486']";
	public static final String TELEPHONE_INPUT_XPATH = "//input[@name='billing[telephone]']";
	public static final String ORDER_INPUT_XPATH = "//button[@title='Order Now']";
	

	@FindBy(xpath = PIZZA_BTN_XPATH)
	WebElement pizzaBtn;

	@FindBy(xpath = TWO_BTN_XPATH)
	WebElement twoBtn;
	
	@FindBy(xpath = ADD_TO_CART_BTN_XPATH)
	WebElement addtocartBtn;
	
	@FindBy(xpath = MY_CART_BTN_XPATH)
	WebElement mycartBtn;
	
	@FindBy(xpath = CHECKOUT_BTN_XPATH)
	WebElement checkoutBtn;
	
	@FindBy(xpath = NAME_INPUT_XPATH)
	WebElement nameInput;
	
	@FindBy(xpath = LASTNAME_INPUT_XPATH)
	WebElement lastnameInput;
	
	@FindBy(xpath = EMAIL_INPUT_XPATH)
	WebElement emailInput;
	
	@FindBy(xpath = ADDRESS_INPUT_XPATH)
	WebElement addressInput;
	
	@FindBy(xpath = STATE_BTN_XPATH)
	WebElement stateBtn;
	
	@FindBy(xpath = PROVINCE_BTN_XPATH)
	WebElement provinceBtn;
	
	@FindBy(xpath = TELEPHONE_INPUT_XPATH)
	WebElement telephoneInput;
	
	@FindBy(xpath = ORDER_INPUT_XPATH)
	WebElement orderBtn;
	
	
	
	public  void clickOnPizzaBtn() {
		pizzaBtn.click();
		
		}
	
	public  void clickOnTwoBtn() {
		twoBtn.click();
		
		}
	
public  void clickOnAddToCartBtn() {
		addtocartBtn.click();
		
		}

	public  void clickOnMyCartBtn() {
		mycartBtn.click();
		
		}
	
	public  void clickCheckoutCartBtn() {
		waitForElementPresent(10, By.xpath(CHECKOUT_BTN_XPATH));
		checkoutBtn.click();
		
		}
	
	public void typeName(String name) {
		nameInput.sendKeys(name);
	}
	
	public void typeLastName(String lastname) {
		lastnameInput.sendKeys(lastname);
	}
	
	public void typeEmail(String email) {
		emailInput.sendKeys(email);
	}
	
	public void typeAddress(String address) {
		addressInput.sendKeys(address);
	}
	
	public  void clickOnStateBtn() {
		stateBtn.click();
		
		}
	
	public  void clickOnProvinceBtn() {
		provinceBtn.click();
		
		}
	
	public void typeTelephone(String address) {
		telephoneInput.sendKeys(address);
	}
	
	public  void clickOnOrderBtn() {
		orderBtn.click();
		
		}
	
	public boolean isPizzaDisplayed() {
		return pizzaBtn.isDisplayed();
	}
	
	public boolean isCheckoutDisplayed() {
		return checkoutBtn.isDisplayed();
	}
}

	

