package com.org;
import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups = "Smoke")
	public void createOrg() {
		System.out.println("Org Create.");
	}
	
	@Test(groups = "Regression")
	public void modifyOrg() {
		System.out.println("Modify Org.");
	}
	
	@Test(groups = "Regression")
	public void deleteOrg() {
		System.out.println("Delete org.");
	}
}
