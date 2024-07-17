package com.contact;
import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups = "Smoke")
	public void createContact() {
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("browser"));
		System.out.println("Contact create.");
	}
	
	@Test(groups = "regression")
	public void modifyContact() {
		System.out.println("Modify Contact.");
	}
}
