import java.util.Scanner;
class Name{
	public static void main(String[] args){
		String firstName;
		String lastName;
		Scanner in = new Scanner(System.in);
		System.out.println("What is your first name? ");
		firstName = in.nextLine();
		System.out.println("What is your last name? ");
		lastName = in.nextLine();
		System.out.println("Your name is: " + firstName + " " + lastName);
	}
}
