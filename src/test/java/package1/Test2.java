package package1;

import org.testng.annotations.Test;

public class Test2 {
	@Test
	 public void test2()
	 
	    {
	    	System.out.println("**********This is test2***************");

	    }
	
	@Test(priority=2)
	 public void test3()
	 
	    {
	    	System.out.println("**********This is test23***************");

	    }
	@Test(priority=3)
	 public void test4()
	 
	    {
	    	System.out.println("**********This is test44***************");

	    }
}
