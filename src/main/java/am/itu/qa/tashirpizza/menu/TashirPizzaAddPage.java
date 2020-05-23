package am.itu.qa.tashirpizza.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.tashirpizza.base.TashirpizzaBasePage;

public class TashirPizzaAddPage extends TashirpizzaBasePage{

	public TashirPizzaAddPage(WebDriver driver) {
		super(driver);
		
	}

	public static final String PIZZA_BTN_XPATH = "//li[@data-filter='.category-3']";
	public static final String TWO_BTN_XPATH = "//form[@id='product_addtocart_form_67_1']/div/div/span[2]";
	public static final String ADD_TO_CART_BTN_XPATH = "//form[@id='product_addtocart_form_67_1']/div/button";
	public static final String MY_CART_BTN_XPATH = "//html[@id='top']/body/div[2]/div/div[5]/div/div/div[2]/div/div/div";
	public static final String REMOVE_BTN_XPATH = "//a[@title='Remove This Item']";
	
	@FindBy(xpath = PIZZA_BTN_XPATH)
	WebElement pizzaBtn;

	@FindBy(xpath = TWO_BTN_XPATH)
	WebElement twoBtn;
	
	@FindBy(xpath = ADD_TO_CART_BTN_XPATH)
	WebElement addtocartBtn;
	
	@FindBy(xpath = MY_CART_BTN_XPATH)
	WebElement mycartBtn;
	
	@FindBy(xpath = REMOVE_BTN_XPATH)
	WebElement removeBtn;
	
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
	
	public  void clickOnRemoveBtn() {
		removeBtn.click();
		
		}
	
	public boolean isPizzaDisplayed() {
		return pizzaBtn.isDisplayed();
	}
}
