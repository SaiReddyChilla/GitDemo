package testNG;

import org.testng.annotations.Test;

public class AdactinApp {

	@Test
	public void loginTest()
	{
		System.out.println("Browser Started..");
		System.out.println("App Lunched..");
		System.out.println("Login Successfull..");
		System.out.println("Browser Closed..");
	}
	@Test
	public void registrationTest()
	{
		System.out.println("Browser Started");
		System.out.println("App Lunched");
		System.out.println("Registration Successfull...");
		System.out.println("Browser Closed...");
	}
	
	@Test
	public void forgotTest()
	{
		System.out.println("Browser Started...");
		System.out.println("App Lunched..");
		System.out.println("Forgot Password Successfull..");
		System.out.println("Browser Closed..");
	}
	
}
