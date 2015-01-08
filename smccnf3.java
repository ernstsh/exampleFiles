import java.util.Scanner;
class Adding{
	public static void main(String[] args){
		double a, b, add;
		Scanner in = new Scanner(System.in);
		System.out.println("Time to add!");
		System.out.println("What is your first number?");
		a = in.nextDouble();
		System.out.println("What is your second number?");
		b = in.nextDouble();
		add = a+b;
		System.out.println("The sum is: " + add);
	}
}
