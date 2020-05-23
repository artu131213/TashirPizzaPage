package am.itu.qa.tashirpizza.dishes;


import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.tashirpizza.home.TashirpizzaHomePage;
import am.itu.qa.tashirpizza.menu.TashirpizzaMenuPage;
import am.itu.qu.tashirpizza.base.MenuBaseTest;

public class MenuDishesTest extends MenuBaseTest {

	@Test (priority = 1)
	public void dishesPageStructureTest() throws InterruptedException {
		
		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");

		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);
		
		System.out.println("Steps");
		
		System.out.println("1.In TashirPizza HOME page click on Menu Link");
		TashirpizzaMenuPage menu = home.navigateToMenu();
		
		System.out.println("2.In TashirPizza Menu page click Dishes button");
		menu.clickOnDishesBtn();
		Thread.sleep(2000);
		
        System.out.println("Expected results:");
		System.out.println("After step 2.Dishes page is presented");
		
		Assert.assertTrue(menu.menuDisplayed());
	}

	@Test (priority = 2)
	public void rissotoPageStructureTest() throws InterruptedException {
		
		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");
		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);
		
        System.out.println("Steps");
		
		System.out.println("1.In TashirPizza HOME page click on Menu Link");
		TashirpizzaMenuPage menu = home.navigateToMenu();
		Thread.sleep(2000);
		
		System.out.println("2.In TashirPizza Menu page click on Dishes button");
		menu.clickOnDishesBtn();
		Thread.sleep(2000);
		
		System.out.println("3.In Dishes page click on Rissota button");
		menu.clickOnRissotoBtn();
		Thread.sleep(2000);
		
		System.out.println("Expected results:");
		System.out.println("After step 3.Rissoto page is presented");
		
		Assert.assertTrue(menu.menuDisplayed());
	}
	
	@Test (priority = 3)
	public void pastaPageStructureTest() throws InterruptedException {
		
		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");
		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);
		
        System.out.println("Steps");
		
		System.out.println("1.In TashirPizza HOME page click on Menu Link");
		TashirpizzaMenuPage menu = home.navigateToMenu();
		Thread.sleep(2000);
		
		System.out.println("2.In TashirPizza Menu page click on Dishes button");
		menu.clickOnDishesBtn();
		Thread.sleep(2000);
		
		System.out.println("3.In Dishes page click on Pasta button");
		menu.clickOnPastaBtn();
		Thread.sleep(2000);
		
		System.out.println("Expected results:");
		System.out.println("After step 3.Pasta page is presented");
		
		Assert.assertTrue(menu.menuDisplayed());
	}
	
	@Test (priority = 4)
	public void breadPageStructureTest() throws InterruptedException {
		
		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");
		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);
		
        System.out.println("Steps");
		
		System.out.println("1.In TashirPizza HOME page click on Menu Link");
		TashirpizzaMenuPage menu = home.navigateToMenu();
		Thread.sleep(2000);
		
		System.out.println("2.In TashirPizza Menu page click on Dishes button");
		menu.clickOnDishesBtn();
		Thread.sleep(2000);
		
		System.out.println("3.In Dishes page click on Bread button");
		menu.clickOnBreadBtn();
		Thread.sleep(2000);
		
		System.out.println("Expected results:");
		System.out.println("After step 3.Bread page is presented");
		
		Assert.assertTrue(menu.menuDisplayed());
	}
}
