import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContact() {
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("browser"));
		System.out.println("Contact create.");
	}
	
	@Test
	public void modifyContact() {
		System.out.println("Modify Contact.");
	}
}
