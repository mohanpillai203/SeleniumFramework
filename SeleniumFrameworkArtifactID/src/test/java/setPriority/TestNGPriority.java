package setPriority;

import org.testng.annotations.Test;

//if prioirty is same for all methods, then it will check method name with alphanumeric order
public class TestNGPriority {
	
	@Test(priority = -2)
	public void test1() {
		System.out.println("I am Inside Test1");
	}
	
	@Test(priority = 1)
	public void test2() {
		System.out.println("I am Inside Test2");
	}
	
	@Test(priority = 0)
	public void test3() {
		System.out.println("I am Inside Test3");
	}

}
