package testNG;

import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactinApp4 {

	@AfterMethod
	public void   tearDown()
	{
		System.out.println("Browser Closed");
	}
	
	@BeforeMethod
	
	public void setUp()
	{
		System.out.println("Browser Started..");
		System.out.println("App lunched...");
	}
	
	
	@Test(priority = 2)
	public void loginTest()
	{
		
		Assert.assertTrue(true);
		System.out.println("Login Successfull...");
		
	}
	
	@Test(priority=1)
	public void regsitrationTest() 
	{
		
		System.out.println("Registration Successfull..");
		
	}
	
	@Test(priority=3)
	public void forgotPassword()
	{
	
		System.out.println("Forgot password Successfull..");
	}
	
	@Test(priority=4,dependsOnMethods ="loginTest")
	public void changePassword()
	{
		System.out.println("Password Changed Successfull..");
	}
	
}
