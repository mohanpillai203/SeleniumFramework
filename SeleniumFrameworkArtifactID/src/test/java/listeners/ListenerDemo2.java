package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class ListenerDemo2 {
	
	@Test
	public void test5() {
		System.out.println("I am inside Test5");
	}
	@Test
	public void test6() {
		System.out.println("I am inside Test6");
		Assert.assertTrue(false);
	}
	@Test
	public void test7() {
		System.out.println("I am inside Test7");
		throw new SkipException("This Test is skipped");
	}
	@Test(enabled = true)
	public void test8() {
		System.out.println("I am inside Test8");
	}
	

}
