package org.test.testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PersonalLoan {
	
	
	@Test (dependsOnMethods = {"two","seven"})
	private void one() {
		// TODO Auto-generated method stub
System.out.println("Test");
		
	}

	@Test
	private void two() {
		// TODO Auto-generated method stub
System.out.println("Before Test");
	}
	@Test
	public void seven() {
		System.out.println("Print Seven");
	}
}
