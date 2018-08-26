package testScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.LinksPO;

public class TestAllLinks extends BaseTest {
	@Test(priority=1)
	public void testGoogleLink() {
		try {
			LinksPO linksPO=new LinksPO(driver);
			linksPO.myGoogleLink().click();
			String aTitle = driver.getTitle();
			System.out.println(aTitle);
			String eTitle = "Google";
			Assert.assertEquals(aTitle, eTitle);
		} catch (Exception e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
	}
	@Test(priority=2)
	public void testFacebookLink() {
			try {
				LinksPO linksPO=new LinksPO(driver);
				linksPO.myFacebookLink().click();
				String aTitle = driver.getTitle();
				System.out.println(aTitle);
				String eTitle = "Facebook – log in or sign up";
				Assert.assertEquals(aTitle, eTitle);
			} catch (Exception e) {
				Reporter.log("Exception generated", true);
				Assert.fail();
			}	
	}
	@Test(priority=3)
	public void testTwitterLink() {
			try {
				LinksPO linksPO=new LinksPO(driver);
				linksPO.myTwitterLink().click();
				String aTitle = driver.getTitle();
				System.out.println(aTitle);
				String eTitle = "Login on Twitter";
				Assert.assertEquals(aTitle, eTitle);
			} catch (Exception e) {
				Reporter.log("Exception generated", true);
				Assert.fail();
			}	
	}
	@Test(priority=4)
	public void testInstaLink() {
			try {
				LinksPO linksPO=new LinksPO(driver);
				linksPO.myInstaLink().click();
				String aTitle = driver.getTitle();
				System.out.println(aTitle);
				String eTitle = "Login • Instagram";
				Assert.assertEquals(aTitle, eTitle);
			} catch (Exception e) {
				Reporter.log("Exception generated", true);
				Assert.fail();
			}	
	}
}
