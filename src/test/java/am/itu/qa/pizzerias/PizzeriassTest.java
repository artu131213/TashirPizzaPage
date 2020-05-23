package am.itu.qa.pizzerias;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.tashirpizza.home.TashirpizzaHomePage;
import am.itu.qa.tashirpizza.menu.TashirPizzaPizzeriasPage;
import am.itu.qu.tashirpizza.base.MenuBaseTest;

public class PizzeriassTest extends MenuBaseTest {
	
	@Test
	public void yerevanPageTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");

		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);

		System.out.println("Steps");

		System.out.println("1.In TashirPizza HOME page click on Pizzerias Link");
		TashirPizzaPizzeriasPage menu = home.navigateToMenu7();
		
		System.out.println("2.In TashirPizza Pizzerias page click Gai button");
		menu.clickOnGaiBtn();
		Thread.sleep(2000);

		System.out.println("Expected results:");
		System.out.println("After step 3.Gai picture is presented");

		Assert.assertTrue(menu.menuDisplayed());
		
	}
	

}
