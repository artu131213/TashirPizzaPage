package am.itu.qa.sushi;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.tashirpizza.home.TashirpizzaHomePage;
import am.itu.qa.tashirpizza.menu.TashirPizzaSushiPage;
import am.itu.qu.tashirpizza.base.MenuBaseTest;

public class MenuSushiTest extends MenuBaseTest {
	
	@Test(priority = 30)
	public void sushiPageTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");

		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);

		System.out.println("Steps");

		System.out.println("1.In TashirPizza HOME page click on Menu Link");
		TashirPizzaSushiPage menu = home.navigateToMenu5();
		
		System.out.println("2.In TashirPizza Menu page click Sushi Suteki Bar button");
		menu.clickOnSushiBtn();
		Thread.sleep(2000);

		System.out.println("Expected results:");
		System.out.println("After step 2.Sushi Suteki Bar page is presented");

		Assert.assertTrue(menu.menuDisplayed());
		
	}
	
	@Test(priority = 31)
	public void sushiiPageTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");

		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);

		System.out.println("Steps");

		System.out.println("1.In TashirPizza HOME page click on Menu Link");
		TashirPizzaSushiPage menu = home.navigateToMenu5();
		
		System.out.println("2.In TashirPizza Menu page click Sushi Suteki Bar button");
		menu.clickOnSushiBtn();
		Thread.sleep(2000);
		
		System.out.println("2.In TashirPizza Menu page click Sushi Suteki Bar button");
		menu.clickOnSushiiBtn();
		Thread.sleep(2000);

		System.out.println("Expected results:");
		System.out.println("After step 2.Sushi Suteki Bar page is presented");

		Assert.assertTrue(menu.menuDisplayed());
		
	}

	@Test(priority = 32)
	public void sushiPageRollsTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");

		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);

		System.out.println("Steps");

		System.out.println("1.In TashirPizza HOME page click on Menu Link");
		TashirPizzaSushiPage menu = home.navigateToMenu5();
		
        System.out.println("2.In TashirPizza Menu page click Sushi Suteki Bar button");
		menu.clickOnSushiBtn();
		Thread.sleep(2000);
		
		System.out.println("3.In Menu Sushi page Rolls button");
		menu.clickOnRollsBtn();
		Thread.sleep(2000);

		System.out.println("Expected results:");
		System.out.println("After step 3.Rolls page is presented");

		Assert.assertTrue(menu.menuDisplayed());
	}
	
	@Test(priority = 33)
	public void sushiPageBigRollsTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");

		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);

		System.out.println("Steps");

		System.out.println("1.In TashirPizza HOME page click on Menu Link");
		TashirPizzaSushiPage menu = home.navigateToMenu5();
		
        System.out.println("2.In TashirPizza Menu page click Sushi Suteki Bar button");
		menu.clickOnSushiBtn();
		Thread.sleep(2000);
		
		System.out.println("3.In Menu Sushi page Big Rolls button");
		menu.clickOnBigRollsBtn();
		Thread.sleep(2000);

		System.out.println("Expected results:");
		System.out.println("After step 3.Big Rolls page is presented");

		Assert.assertTrue(menu.menuDisplayed());
	}
	
	@Test(priority = 34)
	public void sushiPageAssortiTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");

		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);

		System.out.println("Steps");

		System.out.println("1.In TashirPizza HOME page click on Menu Link");
		TashirPizzaSushiPage menu = home.navigateToMenu5();
		
        System.out.println("2.In TashirPizza Menu page click Sushi Suteki Bar button");
		menu.clickOnSushiBtn();
		Thread.sleep(2000);
		
		System.out.println("3.In Menu Sushi page Assorti button");
		menu.clickOnAssortiBtn();
		Thread.sleep(2000);

		System.out.println("Expected results:");
		System.out.println("After step 3.Assorti page is presented");

		Assert.assertTrue(menu.menuDisplayed());
	}
	
	@Test(priority = 35)
	public void sushiPageSlaldsTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");

		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);

		System.out.println("Steps");

		System.out.println("1.In TashirPizza HOME page click on Menu Link");
		TashirPizzaSushiPage menu = home.navigateToMenu5();
		
        System.out.println("2.In TashirPizza Menu page click Sushi Suteki Bar button");
		menu.clickOnSushiBtn();
		Thread.sleep(2000);
		
		System.out.println("3.In Menu Sushi page Salads button");
		menu.clickOnSaladsBtn();
		Thread.sleep(2000);

		System.out.println("Expected results:");
		System.out.println("After step 3.Salads page is presented");

		Assert.assertTrue(menu.menuDisplayed());
	}
	
	@Test(priority = 36)
	public void dessertPageSlaldsTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");

		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);

		System.out.println("Steps");

		System.out.println("1.In TashirPizza HOME page click on Menu Link");
		TashirPizzaSushiPage menu = home.navigateToMenu5();
		
        System.out.println("2.In TashirPizza Menu page click Sushi Suteki Bar button");
		menu.clickOnDessertBtn();
		Thread.sleep(2000);

		System.out.println("Expected results:");
		System.out.println("After step 3.Salads page is presented");

		Assert.assertTrue(menu.menuDisplayed());
	}
	
}
