import java.util.Scanner;

public class ConditionalMath {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String name;
		int a;
		int b;
		int sum;
		
		
		System.out.println("Ievadiet savu Vārdu!");
		name = input.next();
		
		System.out.println("Ievadiet veselu skaitli A!");
		a = input.nextInt();
		
		System.out.println("Ievadiet veselu skaitli B!");
		b = input.nextInt();
		
		if(a > b) {
			System.out.println("Skaitlis A ir lielāks par skaitli B");
		}
		
		if(a < b) {
			System.out.println("Skaitlis B ir lielāks par skaitli A");
		}
		
		if(a == b) {
			System.out.println("Skaitlis A un B ir vienādi");
		}
		
		System.out.println();
		
		sum = a + b;
		
		if(name.length() < (a + b)) {
			System.out.println("Skatiļu A un B summa ir " + sum +", kas ir vairāk nekā cik burtu Tavā vārdā!");
		}
		
		if(name.length() > (a + b)) {
			System.out.println("Skatiļu A un B summa ir " + sum +", kas ir mazāk nekā cik burtu Tavā vārdā!");
		}
		
		if(name.length() == (a + b)) {
			System.out.println("Skatiļu A un B summa ir " + sum +", kas ir tikpat cik burtu Tavā vārdā!");
		}

	}

}
