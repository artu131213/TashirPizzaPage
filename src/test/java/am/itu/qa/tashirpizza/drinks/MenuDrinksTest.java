package am.itu.qa.tashirpizza.drinks;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.tashirpizza.home.TashirpizzaHomePage;
import am.itu.qa.tashirpizza.menu.TashirpizzaMenuPage;
import am.itu.qu.tashirpizza.base.MenuBaseTest;

public class MenuDrinksTest extends MenuBaseTest {

	@Test(priority = 5)
	public void drinksPageStructureTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");

		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);

		System.out.println("Steps");

		System.out.println("1.In TashirPizza HOME page click on Menu Link");
		TashirpizzaMenuPage menu = home.navigateToMenu();

		System.out.println("2.In TashirPizza Menu page click Drinks button");
		menu.clickOnDrinksBtn();
		Thread.sleep(2000);

		System.out.println("Expected results:");
		System.out.println("After step 2.Drinks page is presented");

		Assert.assertTrue(menu.menuDisplayed());
	}
	
	@Test(priority = 6)
	public void otherPageStructureTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");

		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);

		System.out.println("Steps");

		System.out.println("1.In TashirPizza HOME page click on Menu Link");
		TashirpizzaMenuPage menu = home.navigateToMenu();

		System.out.println("2.In TashirPizza Menu page click Drinks button");
		menu.clickOnDrinksBtn();
		Thread.sleep(2000);
		
		System.out.println("2.In TashirPizza Menu Drinks page click Other button");
		menu.clickOnOtherBtn();
		Thread.sleep(2000);


		System.out.println("Expected results:");
		System.out.println("After step 2.Other page is presented");

		Assert.assertTrue(menu.menuDisplayed());
	}


	@Test(priority = 7)
	public void teaPageStructureTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");

		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);

		System.out.println("Steps");

		System.out.println("1.In TashirPizza HOME page click on Menu Link");
		TashirpizzaMenuPage menu = home.navigateToMenu();

		System.out.println("2.In TashirPizza Menu page click Drinks button");
		menu.clickOnDrinksBtn();
		Thread.sleep(2000);

		System.out.println("3.In Drinks page click on Tea button");
		menu.clickOnTeaBtn();
		Thread.sleep(2000);

		System.out.println("Expected results:");
		System.out.println("After step 3.Tea page is presented");

		Assert.assertTrue(menu.menuDisplayed());
	}

	@Test(priority = 8)
	public void coffeePageStructureTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");

		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);

		System.out.println("Steps");

		System.out.println("1.In TashirPizza HOME page click on Menu Link");
		TashirpizzaMenuPage menu = home.navigateToMenu();

		System.out.println("2.In TashirPizza Menu page click Drinks button");
		menu.clickOnDrinksBtn();
		Thread.sleep(2000);

		System.out.println("3.In Drinks page click on Coffee button");
		menu.clickOnCoffeeBtn();
		Thread.sleep(2000);

		System.out.println("Expected results:");
		System.out.println("After step 3.Coffee page is presented");

		Assert.assertTrue(menu.menuDisplayed());
	}
	
	@Test(priority = 9)
	public void waterPageStructureTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");

		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);

		System.out.println("Steps");

		System.out.println("1.In TashirPizza HOME page click on Menu Link");
		TashirpizzaMenuPage menu = home.navigateToMenu();

		System.out.println("2.In TashirPizza Menu page click Drinks button");
		menu.clickOnDrinksBtn();
		Thread.sleep(2000);

		System.out.println("3.In Drinks page click on Water button");
		menu.clickOnWaterBtn();
		Thread.sleep(2000);

		System.out.println("Expected results:");
		System.out.println("After step 3.Water page is presented");

		Assert.assertTrue(menu.menuDisplayed());
	}
	
	@Test(priority = 10)
	public void mineralPageStructureTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");

		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);

		System.out.println("Steps");

		System.out.println("1.In TashirPizza HOME page click on Menu Link");
		TashirpizzaMenuPage menu = home.navigateToMenu();

		System.out.println("2.In TashirPizza Menu page click Drinks button");
		menu.clickOnDrinksBtn();
		Thread.sleep(2000);

		System.out.println("3.In Drinks page click on Mineral button");
		menu.clickOnMineralBtn();
		Thread.sleep(2000);

		System.out.println("Expected results:");
		System.out.println("After step 3.Mineral page is presented");

		Assert.assertTrue(menu.menuDisplayed());
	}
	
	@Test(priority = 11)
	public void minerallPageStructureTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");

		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);

		System.out.println("Steps");

		System.out.println("1.In TashirPizza HOME page click on Menu Link");
		TashirpizzaMenuPage menu = home.navigateToMenu();

		System.out.println("2.In TashirPizza Menu page click Drinks button");
		menu.clickOnDrinksBtn();
		Thread.sleep(2000);

		System.out.println("3.In Drinks page click on Mineral button");
		menu.clickOnMineralBtn();
		Thread.sleep(2000);
		
		System.out.println("4.In Mineral page click on Mineral Water button");
		menu.clickOnMinerallBtn();
		Thread.sleep(2000);

		System.out.println("Expected results:");
		System.out.println("After step 4.Mineral Water page is presented");

		Assert.assertTrue(menu.menuDisplayed());
	}
	
}

