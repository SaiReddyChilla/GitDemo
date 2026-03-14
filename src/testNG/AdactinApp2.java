package testNG;

import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdactinApp2 {

	@Test(priority = 2)
	public void loginTest()
	{
		System.out.println("Browser Started..");
		System.out.println("App lunched...");
		Assert.assertTrue(false);
		System.out.println("Login Successfull...");
		System.out.println("Browser Closed..");
		
	}
	
	@Test(priority=1)
	public void regsitrationTest() 
	{
		System.out.println("Browser Started..");
		System.out.println("App Lunched..");
		System.out.println("Registration Successfull..");
		System.out.println("Browser Closed...");
		
	}
	
	@Test(priority=3)
	public void forgotPassword()
	{
		System.out.println("Browser Started..");
		System.out.println("App Lunched..");
		System.out.println("Forgot password Successfull..");
		System.out.println("Browser Closed..");
	}
	
	@Test(priority=4,dependsOnMethods ="loginTest")
	public void changePassword()
	{
		System.out.println("Browser Started");
		System.out.println("App Lunched..");
		System.out.println("Password Changed Successfull..");
		System.out.println("Browser Closed..");
	}
	
}
