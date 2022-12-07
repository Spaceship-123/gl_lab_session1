
import java.util.Random;
import java.util.Scanner;
import java.util.function.Function;

public class ITSupportAdministrator {
	
	Scanner scanner = new Scanner(System.in);
	CredentialService credentialService = new CredentialService();
	private int input;
	
	
	public void generateCredentials() {
		System.out.println("Please enter Department number");
		System.out.println("1) Technical");
		System.out.println("2) Admin");
		System.out.println("3) Human Resource");
		System.out.println("4) Legal");
		int option = scanner.nextInt();
		
	if(option == 1) {
			System.out.println("Enter First Name");
			String firstName = scanner.next();
			System.out.println("Enter Last Name");
			String lastName = scanner.next();
			
			Employee employee = new Employee(firstName, lastName);
			String email = credentialService.generateEmailAddress(employee,"tech");
			String password = credentialService.generatePassword();
			
			credentialService.showCredentials(employee, email, password);
		
	} else if (option == 2) { 
		System.out.println("Enter First Name");
		String firstName = scanner.next();
		System.out.println("Enter Last Name");
		String lastName = scanner.next();
		
		Employee employee = new Employee(firstName, lastName);
		String email = credentialService.generateEmailAddress(employee,"adm");
		String password = credentialService.generatePassword();
		
		credentialService.showCredentials(employee, email, password);
	} else if (option == 3) { 
		System.out.println("Enter First Name");
		String firstName = scanner.next();
		System.out.println("Enter Last Name");
		String lastName = scanner.next();
		
		Employee employee = new Employee(firstName, lastName);
		String email = credentialService.generateEmailAddress(employee,"hr");
		String password = credentialService.generatePassword();
		
		credentialService.showCredentials(employee, email, password);
	} else if (option == 4) { 
		System.out.println("Enter First Name");
		String firstName = scanner.next();
		System.out.println("Enter Last Name");
		String lastName = scanner.next();
		
		Employee employee = new Employee(firstName, lastName);
		String email = credentialService.generateEmailAddress(employee,"lg");
		String password = credentialService.generatePassword();
		
		credentialService.showCredentials(employee, email, password);
		
	} if (input == 1 || input == 2 || input == 3 || input == 4) 
	{

	} else {

		System.out.println("Thank You ");
		
	}
	
}
	 

	
	public static void main(String[] args) {
		ITSupportAdministrator itSupportAdministrator = new ITSupportAdministrator();
		itSupportAdministrator.generateCredentials();
	}

}

class CredentialService {
	
	public String generatePassword() {
		String password = "";
		String charString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*";
		Random random = new Random();
		for(int i=0;i<8;i++) {
			int index = random.nextInt(charString.length());
			password+=charString.charAt(index);
		}
		return password;
	}
	
	public String generateEmailAddress(Employee employee, String department) {
		String email = employee.getFirstName() + employee.getLastName() + "@" + department + ".greatlearning.com";
		email = email.toLowerCase();
		return email;
	}
	
	public void showCredentials(Employee employee, String email, String password) {
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email ----> " + email);
		System.out.println("Password ----> " + password);
	}
	
}

class Employee {
	
	private String firstName;
	private String lastName;
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

    @Override 
	   public String toString()
	{  
        return "First Name: "+firstName+" Last Name: "+lastName;  
    } 
	
}


/*	
1. I was going to apply a loop for Invalid user Input but due to the limited time constraints I was not able to do so
2. I tried to keep the keep the code compact 
3. I am would appreciate feedback, thank you
*/