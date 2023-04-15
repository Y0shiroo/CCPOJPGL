import java.util.Scanner;
public class User {
	    private String name;
	    private int age;
	    private String address;
	    private String email;
	    private String contactNumber;

	    public User(String name, int age, String address, String email, String contactNumber) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	        this.email = email;
	        this.contactNumber = contactNumber;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public String getContactNumber() {
	        return contactNumber;
	    }
	}
