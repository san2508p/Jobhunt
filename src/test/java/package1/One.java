package package1;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.testng.annotations.Test;

public class One {
	
	@Test(description = "method m1",groups = {"smoke"})
	public void m1() {
		System.out.println("M1");
		assertTrue(true);
		
	}
	@Test(description = "method m2",groups = {"smoke"})
	public void m2() {
		
		System.out.println("M2");
		assertTrue(false);
	}
	@Test(description = "method m3",groups = {"smoke"})
	public void m3() {
		
		System.out.println("M3");
		assertTrue(false);
	}
	
	@Test(description = "method m2",enabled = false)
	public void m4() {
		
		System.out.println("M4");
		assertTrue(false);
	}

}
