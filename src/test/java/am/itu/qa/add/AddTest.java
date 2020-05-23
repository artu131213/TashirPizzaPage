package am.itu.qa.add;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.tashirpizza.home.TashirpizzaHomePage;
import am.itu.qa.tashirpizza.menu.TashirPizzaAddPage;

import am.itu.qu.tashirpizza.base.MenuBaseTest;

public class AddTest  extends MenuBaseTest {
	
	
	
	@Test
	public void tashirpizzaAddToCart() throws InterruptedException {
		
		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");
		
		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);
		
		System.out.println("Steps");
		
		System.out.println("1.In TashirPizza HOME page click on Menu Link");
		TashirPizzaAddPage menu = home.navigateToMenu3();
		
		System.out.println("2.In TashirPizza Menu page click on Pizza button");
		menu.clickOnPizzaBtn();
		Thread.sleep(4000);
		
	    System.out.println("3.Then in the opend americano (270amd) and click on the button plus");
	    menu.clickOnTwoBtn();
	    Thread.sleep(4000);
	    
	    System.out.println("4.Then click on Add To Cart button");
	    menu.clickOnAddToCartBtn();
	    Thread.sleep(4000);
	    
	    System.out.println("Expected results:");
		System.out.println("After step 4.Pizza page is presented");
		
		Assert.assertTrue(menu.isPizzaDisplayed());
	}
	
	
	
	@Test
	public void tashirpizzaCLickCheckout() throws InterruptedException {
		
		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");
		
		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);
		Thread.sleep(4000);
		
		System.out.println("Steps");
		
		System.out.println("1.In TashirPizza HOME page click on Menu Link");
		TashirPizzaAddPage menu = home.navigateToMenu3();
		Thread.sleep(4000);
		
		System.out.println("2.In TashirPizza Menu page click on Pizza button");
		menu.clickOnPizzaBtn();
		Thread.sleep(4000);
		
	    System.out.println("3.Then in the opend americano (270amd) and click on the button plus");
	    menu.clickOnTwoBtn();
	    Thread.sleep(4000);
	    
	    System.out.println("4.Then click on Add To Cart button");
	    menu.clickOnAddToCartBtn();
	    Thread.sleep(4000);
	    
	    System.out.println("5.Click on the right side My Cart button and then opend My Cart Window");
	    menu.clickOnMyCartBtn();
	    Thread.sleep(4000);
	    
	    System.out.println("6.In My Cart window click on Remove This Item button");
	    menu.clickOnRemoveBtn();
	    Thread.sleep(4000);
	    
	    System.out.println("Expected results:");
		System.out.println("After step 6.My Cart page is presented");
		
		Assert.assertTrue(menu.isPizzaDisplayed());
	}

}
