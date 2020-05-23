package am.itu.qa.contacts;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.tashirpizza.home.TashirpizzaHomePage;
import am.itu.qa.tashirpizza.menu.TashirPizzaContactsPage;
import am.itu.qu.tashirpizza.base.MenuBaseTest;


public class ContactsFirstTest extends MenuBaseTest {
	
	@Test(priority = 8)
	public void negativeTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");

		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);

		System.out.println("Steps");

		System.out.println("1.In TashirPizza HOME page click on Contacts Link");
		TashirPizzaContactsPage contacts = home.navigateToContacts();
		Thread.sleep(4000);

		System.out.println("2.In TashirPizza CONTACTS page type Artur in NAME field");
		contacts.typeName("Artur");
		Thread.sleep(2000);

		System.out.println("3.In TashirPizza CONTACTS page type artur13@gmail.com in EMAIL field");
		contacts.typeEmail("artur13@gmail.com");
		Thread.sleep(2000);

		System.out.println("4.In TashirPizza CONTACTS page type 088255212 in TELEPHONE field");
		contacts.typeTelephone("088255212");
		Thread.sleep(2000);

		System.out.println("5.We missed COMMENT field");

		System.out.println("6.Click on SUBMIT button");
		contacts.clickOnSubmitBtn();
		Thread.sleep(2000);

		System.out.println("Expected results:");
		System.out.println("After step 5. User stays in Contacts page");
		System.out.println("Error message is diplayed with text 'This is a required field' ");
		Assert.assertTrue(contacts.contactsDisplayed());
	}

	@Test(priority = 9)
	public void positiveTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TashirPizza.am home page is opened in chrome driver -- TashirPizzaBaseTest");

		TashirpizzaHomePage home = new TashirpizzaHomePage(this.driver);

		System.out.println("Steps");

		System.out.println("1.In TashirPizza HOME page click on Contacts Link");
		TashirPizzaContactsPage contacts = home.navigateToContacts();
		Thread.sleep(4000);

		System.out.println("2.In TashirPizza CONTACTS page type Artur in NAME field");
		contacts.typeName("Artur");
		Thread.sleep(2000);

		System.out.println("3.In TashirPizza CONTACTS page type artur13@gmail.com in EMAIL field");
		contacts.typeEmail("artur13@gmail.com");
		Thread.sleep(2000);

		System.out.println("4.In TashirPizza CONTACTS page type 088255212 in TELEPHONE field");
		contacts.typeTelephone("088255212");
		Thread.sleep(2000);
		
		System.out.println("5.In TashirPizza CONTACTS page type Barev dzez in COMMENT field");
		contacts.typeComment("Barev dzez");
		Thread.sleep(2000);

		System.out.println("7.Click on SUBMIT button");
		contacts.clickOnSubmitBtn();

		System.out.println("Expected results:");
		System.out.println("After step 7.Contacts page is submitted with the text 'Your inquiry was submitted and will be responded to as soon as possible. Thank you for contacting us'");
	
	}

}
