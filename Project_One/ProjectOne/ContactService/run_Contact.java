package ContactService;

public class run_Contact {

	public static void main(String[] args) {
		
		// Construct ContactService to store and manage contacts.
		ContactService service = new ContactService();
		
		// Create contact instance
		// Contact contact0 = new Contact();
		Contact contact1 = new Contact("ID1", "Danny", "Gorelkin", "0123456789", "SNHU, NH");
		
		// Add contact to the list
		service.addContact(contact1);
		
		Contact contact2 = new Contact("ID2", "Danny", "Gorelkin", "0123456789", "SNHU, NH");
		// contact2.printContact();
		service.addContact(contact2);
		
		System.out.println("Initial contacts:");
		service.printContacts();
		
		service.updateContact("ID2", "Updated", "Contact", "9876543210", "NH, SNHU");
		
		System.out.println("Updated contacts:");
		service.printContacts();

		System.out.println("Delete contact ID2!\n");
		service.deleteContact("ID2");
		
		System.out.println("Existing contacts:");
		service.printContacts();
	}
}
