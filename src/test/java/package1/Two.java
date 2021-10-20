package package1;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Two {
	
	@Test(description = "method m21",groups = {"smoke"})
	public void m1() {
		System.out.println("M21");
		assertTrue(true);
		
	}
	@Test(description = "method m22",groups = {"smoke"})
	public void m2() {
		
		System.out.println("M22");
		assertTrue(false);
	}
	@Test(description = "method m23",groups = {"smoke"})
	public void m3() {
		
		System.out.println("M23");
		assertTrue(true);
	}
	
	@Test(description = "method m22",enabled = false)
	public void m4() {
		
		System.out.println("M22");
		assertTrue(false);
	}

}
