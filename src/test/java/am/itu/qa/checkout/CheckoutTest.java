package am.itu.qa.checkout;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.tashirpizza.home.TashirpizzaHomePage;
import am.itu.qa.tashirpizza.menu.TashirPizzaCheckoutPage;

import am.itu.qu.tashirpizza.base.MenuBaseTest;

public class CheckoutTest extends MenuBaseTest{
	
	
	

	@Test
	public void tashirpizzaCheckout() throws InterruptedException {
		
		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");
		
		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);
		Thread.sleep(4000);
		
		System.out.println("Steps");
		
		System.out.println("1.In TashirPizza HOME page click on Menu Link");
		TashirPizzaCheckoutPage menu = home.navigateToMenu2();
		
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
	    
	    Assert.assertTrue(menu.isCheckoutDisplayed());
	    System.out.println("6.In My Cart window click on Checkout button");
	    menu.clickCheckoutCartBtn();
	    Thread.sleep(4000);
	    
	    System.out.println("Expected results:");
		System.out.println("After step 8.Checkout page is presented");
		
		}
	
	@Test
	public void tashirpizzaCheckoutNegative() throws InterruptedException {
		
		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");
		
		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);
		Thread.sleep(4000);
		
		System.out.println("Steps");
		
		System.out.println("1.In TashirPizza HOME page click on Menu Link");
		TashirPizzaCheckoutPage menu = home.navigateToMenu2();
		
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
	    
	    Assert.assertTrue(menu.isCheckoutDisplayed());
	    System.out.println("6.In My Cart window click on Checkout button");
	    menu.clickCheckoutCartBtn();
	    Thread.sleep(2000);
	    
	    System.out.println("7.In Checkout page type Artur in First Name field");
		menu.typeName("Artur");
		Thread.sleep(2000);
	    
		System.out.println("8.In Checkout page type Avetisyan in Last Name field");
		menu.typeLastName("Avetisyan");
		Thread.sleep(2000);
		
		System.out.println("9.In Checkout page type artur131213@gmail.com in Last Name field");
		menu.typeEmail("artur131213@gmail.com");
		Thread.sleep(2000);
		
		System.out.println("10.In Checkout page type Komitas 48 in Address field");
		menu.typeAddress("Komitas 48");
		Thread.sleep(2000);
		
		System.out.println("11.In Checkout page click on Order Now button");
	    menu.clickOnOrderBtn();
	    Thread.sleep(2000);
	    
	    System.out.println("Expected results:");
		System.out.println("After step 11. Click on Order now button and after that showed that the telephone field must be typed");
		
		}
	
	@Test
	public void tashirpizzaCheckoutPositive() throws InterruptedException {
		
		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");
		
		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);
		Thread.sleep(4000);
		
		System.out.println("Steps");
		
		System.out.println("1.In TashirPizza HOME page click on Menu Link");
		TashirPizzaCheckoutPage menu = home.navigateToMenu2();
		
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
	    
	    Assert.assertTrue(menu.isCheckoutDisplayed());
	    System.out.println("6.In My Cart window click on Checkout button");
	    menu.clickCheckoutCartBtn();
	    Thread.sleep(2000);
	    
	    System.out.println("7.In Checkout page type Artur in First Name field");
		menu.typeName("Artur");
		Thread.sleep(2000);
	    
		System.out.println("8.In Checkout page type Avetisyan in Last Name field");
		menu.typeLastName("Avetisyan");
		Thread.sleep(2000);
		
		System.out.println("9.In Checkout page type artur131213@gmail.com in Last Name field");
		menu.typeEmail("artur131213@gmail.com");
		Thread.sleep(2000);
		
		System.out.println("10.In Checkout page type Komitas 48 in Address field");
		menu.typeAddress("Komitas 48");
		Thread.sleep(2000);
		
		System.out.println("11.In Checkout page click on State button");
		menu.clickOnStateBtn();
	    Thread.sleep(2000);
	    
	    System.out.println("12.In Checkout page Sate menu click on Gyumri");
	    menu.clickOnProvinceBtn();
	    Thread.sleep(2000);
		
		System.out.println("11.In Checkout page type 0980000001 in Address field");
		menu.typeTelephone("0980000001");
		Thread.sleep(2000);
		
		System.out.println("12.In Checkout page click on Order Now button");
	    menu.clickOnOrderBtn();
	    Thread.sleep(2000);
	    
	    System.out.println("Expected results:");
		System.out.println("After step 11. The order is confirmed");
		
		}
	
}
