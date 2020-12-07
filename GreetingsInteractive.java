import java.util.Scanner;

public class GreetingsInteractive {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);

		String name;
		int age;
		
		System.out.println("Ievadiet savu vārdu!");
		name = input.next();
		
		System.out.println("Ievadiet savu vecumu!");
		age = input.nextInt();
		
		System.out.println("Sveiki, mani sauc " + name + " esmu " + age + " gadus jauns/a!");

		
	}

}
