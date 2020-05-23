package am.itu.qa.tashirpizza.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.tashirpizza.base.TashirpizzaBasePage;
import am.itu.qa.tashirpizza.language.TashirPizzaLanguagePage;
import am.itu.qa.tashirpizza.menu.TashirPizzaAddPage;
import am.itu.qa.tashirpizza.menu.TashirPizzaCheckoutPage;
import am.itu.qa.tashirpizza.menu.TashirPizzaContactsPage;
import am.itu.qa.tashirpizza.menu.TashirPizzaPizzeriasPage;
import am.itu.qa.tashirpizza.menu.TashirPizzaSushiPage;
import am.itu.qa.tashirpizza.menu.TashirpizzaMenuPage;


public class TashirpizzaHomePage extends TashirpizzaBasePage {

	public TashirpizzaHomePage(WebDriver driver) {
		super(driver);

	}

	public static final String MY_MENU_XPATH = "//li[@class='level0 nav-menu']";

	@FindBy(xpath = MY_MENU_XPATH)
	WebElement my1Page;

	public TashirpizzaMenuPage navigateToMenu() {
		my1Page.click();
		return new TashirpizzaMenuPage(this.driver);

	}
	
	public static final String MY_CONTACTS_XPATH = "//li[@class='level0 nav-contacts last']";

	@FindBy(xpath = MY_CONTACTS_XPATH)
	WebElement my2Page;

	public TashirPizzaContactsPage navigateToContacts() {
		my2Page.click();
		return new TashirPizzaContactsPage(this.driver);

	}
	
	public static final String MY_MENU1_XPATH = "//li[@class='level0 nav-menu']";

	@FindBy(xpath = MY_MENU1_XPATH)
	WebElement my3Page;

	public TashirPizzaCheckoutPage navigateToMenu2() {
		my3Page.click();
		return new TashirPizzaCheckoutPage(this.driver);

	}

	public static final String MY_MENU2_XPATH = "//li[@class='level0 nav-menu']";

	@FindBy(xpath = MY_MENU2_XPATH)
	WebElement my4Page;

	public TashirPizzaAddPage navigateToMenu3() {
		my3Page.click();
		return new TashirPizzaAddPage(this.driver);

	}
	
	public static final String HOME_XPATH = "//img[@alt='Magento Commerce']";

	@FindBy(xpath = HOME_XPATH)
	WebElement myPage;

	public TashirPizzaLanguagePage navigateToHome() {
		myPage.click();
		return new TashirPizzaLanguagePage(this.driver);

	}
	
	public static final String MY_MENU3_XPATH = "//li[@class='level0 nav-menu']";

	@FindBy(xpath = MY_MENU3_XPATH)
	WebElement my5Page;

	public TashirPizzaSushiPage navigateToMenu5() {
		my1Page.click();
		return new TashirPizzaSushiPage(this.driver);

	}
	
	public static final String PIZZERIAS_XPATH = "//li[@class='level0 nav-pizzerias']";

	@FindBy(xpath = PIZZERIAS_XPATH)
	WebElement my7Page;

	public TashirPizzaPizzeriasPage navigateToMenu7() {
		my7Page.click();
		return new TashirPizzaPizzeriasPage(this.driver);

	}
}
