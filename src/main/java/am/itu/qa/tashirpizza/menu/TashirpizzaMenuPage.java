package am.itu.qa.tashirpizza.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.tashirpizza.base.TashirpizzaBasePage;

public class TashirpizzaMenuPage extends TashirpizzaBasePage {

	public TashirpizzaMenuPage(WebDriver driver) {
		super(driver);
	}

	public static final String DISHES_BTN_XPATH = "//li[@data-filter='category-39']";
	public static final String RISSOTO_BTN_XPATH = "//button[@data-filter='.category-14']";
	public static final String PASTA_BTN_XPATH = "//button[@data-filter='.category-16']";
	public static final String BREAD_BTN_XPATH = "//button[@data-filter='.category-43']";
	public static final String DRINKS_BTN_XPATH = "//li[@data-filter='category-24']";
	public static final String OTHER_BTN_XPATH = "//button[@data-filter='.category-29']";
	public static final String TEA_BTN_XPATH = "//button[@data-filter='.category-30']";
	public static final String COFFEE_BTN_XPATH = "//button[@data-filter='.category-31']";
	public static final String WATER_BTN_XPATH = "//button[@data-filter='.category-7']";
	public static final String MINERAL_BTN_XPATH = "//button[@data-filter='.category-9']";
	public static final String MINERALL_BTN_XPATH = "//a[contains(text(),'Mineral water')]";

	@FindBy(xpath = DISHES_BTN_XPATH)
	WebElement dishesBtn;

	@FindBy(xpath = RISSOTO_BTN_XPATH)
	WebElement rissotoBtn;

	@FindBy(xpath = PASTA_BTN_XPATH)
	WebElement pastaBtn;

	@FindBy(xpath = BREAD_BTN_XPATH)
	WebElement breadBtn;

	@FindBy(xpath = DRINKS_BTN_XPATH)
	WebElement drinksBtn;
	
	@FindBy(xpath = OTHER_BTN_XPATH)
	WebElement otherBtn;

	@FindBy(xpath = TEA_BTN_XPATH)
	WebElement teaBtn;

	@FindBy(xpath = COFFEE_BTN_XPATH)
	WebElement coffeeBtn;
	
	@FindBy(xpath = WATER_BTN_XPATH)
	WebElement waterBtn;
	
	@FindBy(xpath = MINERAL_BTN_XPATH)
	WebElement mineralBtn;
	
	@FindBy(xpath = MINERALL_BTN_XPATH)
	WebElement minerallBtn;

	public void clickOnDishesBtn() {
		dishesBtn.click();

	}

	public void clickOnRissotoBtn() {
		rissotoBtn.click();

	}

	public void clickOnPastaBtn() {
		pastaBtn.click();
	}

	public void clickOnBreadBtn() {
		breadBtn.click();
	}

	public void clickOnDrinksBtn() {
		drinksBtn.click();

	}
	
	public void clickOnOtherBtn() {
		otherBtn.click();

	}

	public void clickOnTeaBtn() {
		teaBtn.click();

	}

	public void clickOnCoffeeBtn() {
		coffeeBtn.click();
	}
	
	public void clickOnWaterBtn() {
		waterBtn.click();
	}
	
	public void clickOnMineralBtn() {
		mineralBtn.click();
	}
	
	public void clickOnMinerallBtn() {
		minerallBtn.click();
	}

	public boolean menuDisplayed() {
		return dishesBtn.isDisplayed();
	}
}
