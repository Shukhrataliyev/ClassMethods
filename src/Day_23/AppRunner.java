package Day_23;

public class AppRunner {

	public static void main(String[] args) {
		
		PhoneNumberManagement p1 = new PhoneNumberManagement(1234567890, "Adam");
		System.out.println("This phone number "+p1.transformPhoneNumber()+" belongs to "+p1.getName());

	}

}
