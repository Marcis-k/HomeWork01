import java.util.Scanner;

public class BasicMath {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a;
		float b;
		float sum;
		float sub;
		float div;
		float mul;
		float squ;
		
		
		System.out.println("Ievadiet vienu veselu skaitli!");
		a = input.nextInt();
		
		System.out.println("ievadiet decimāl skaitli!");
		b = input.nextFloat();
		
		// Skaitļu summa
		sum = a + b;
		
		System.out.println("Skaitļu " + a + " un " + b + " summa ir: " + sum);
		
		
		// Skaitļu starpība
		sub = a - b;
		
		System.out.println("Skaitļu " + a + " un " + b + " starpība ir: " + sub);
		
		
		// Skaitļu dalījums
		div = a / b;
		
		System.out.println("Skaitļu " + a + " un " + b + " dalījums ir: " + div);
		
		// Skaitļu reizinājums
		mul = a * b;
		
		System.out.println("Skaitļu " + a + " un " + b + " reizinājums ir: " + mul);
		
		// Skaitļu summa kvadrātā
		squ = (a + b) * (a + b);
		
		System.out.println("Skaitļu " + a + " un " + b + " summa kvadrātā ir: " + squ);


		
	}

}
