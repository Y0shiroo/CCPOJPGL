import java.util.Scanner;
public class LoginSystem {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();
	        scanner.nextLine(); // consume the remaining newline character

	        System.out.print("Enter your address: ");
	        String address = scanner.nextLine();

	        System.out.print("Enter your email: ");
	        String email = scanner.nextLine();

	        System.out.print("Enter your contact number: ");
	        String contactNumber = scanner.nextLine();

	        User user = new User(name, age, address, email, contactNumber);

	        System.out.println("Welcome, " + user.getName() + "!");
	        System.out.println("Your age is: " + user.getAge());
	        System.out.println("Your address is: " + user.getAddress());
	        System.out.println("Your email is: " + user.getEmail());
	        System.out.println("Your contact number is: " + user.getContactNumber());
	        }
	    }
