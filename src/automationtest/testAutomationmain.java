package automationtest;


public class testAutomationmain {

	public static void main(String[] args) {
		testAutmoation script = new testAutmoation();
		script.invokeBrowser();
		script.isHomePageVisible();
		script.addToCart();
		script.viewCartAndCheckout();
		script.createAccountAndVerification();
		script.viewCartToCheckoutAgain();
		script.updateBillingInfoAndPlaceOrder();
	}
	
}
