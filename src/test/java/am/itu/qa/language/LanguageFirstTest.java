package am.itu.qa.language;

import org.testng.annotations.Test;

import am.itu.qa.tashirpizza.home.TashirpizzaHomePage;
import am.itu.qa.tashirpizza.language.TashirPizzaLanguagePage;
import am.itu.qu.tashirpizza.base.MenuBaseTest;

public class LanguageFirstTest extends MenuBaseTest {
	
	@Test(priority = 20)
	public void tashirpizzaArmTest() throws InterruptedException {
		
		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");

		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);
		
		System.out.println("Steps");
		
		TashirPizzaLanguagePage arm = home.navigateToHome();
		Thread.sleep(4000);
		
		System.out.println("In TashirPizza HOME page click on language ARM icon");
		arm.clickOnArmBtn();
		Thread.sleep(4000);
		
		System.out.println("Expected results:");
		System.out.println("Armenian page is presented");
		
		
	}

	@Test(priority = 21)
	public void tashirpizzaRuTest() throws InterruptedException {
		
		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");

		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);
		
		System.out.println("Steps");
		
		TashirPizzaLanguagePage ru = home.navigateToHome();
		Thread.sleep(4000);
		
		System.out.println("In TashirPizza HOME page click on language RU icon");
		ru.clickOnRuBtn();
		Thread.sleep(4000);
		
		System.out.println("Expected results:");
		System.out.println("Russian page is presented");
		
		
	}
	
	@Test(priority = 22)
	public void tashirpizzaEngTest() throws InterruptedException {
		
		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");

		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);
		
		System.out.println("Steps");
		
		TashirPizzaLanguagePage eng = home.navigateToHome();
		Thread.sleep(4000);
		
		System.out.println("In TashirPizza HOME page click on language ENG icon");
		eng.clickOnEngBtn();
		Thread.sleep(4000);
		
		System.out.println("Expected results:");
		System.out.println("English page is presented");
		
		
	}
	
}
