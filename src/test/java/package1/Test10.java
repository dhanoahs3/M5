package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test10 {

	@Test
	 public void test3()
	 
	    {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		 WebDriver driver =  new ChromeDriver();
				
	    	System.out.println("**********This is test10***************");

	    }
	
	
	
}
