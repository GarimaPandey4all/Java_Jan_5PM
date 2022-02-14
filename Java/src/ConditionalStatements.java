import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//switch with string
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice:");
		String choice = sc.nextLine();
		
		switch(choice)
		{
		case "one":
			System.out.println("One");
			break;
		case "two":
			System.out.println("Two");
			break;
		case "three":
			System.out.println("Three");
			break;
		default:
			System.out.println("Invalid Choice");
		}	
		
//		a, b largest
		
//		int a = 1000, b = 2000, c = 50000;
//		
//		String result = (a > b && a > c) ? "A is Greater" : ((b > c) ? "B is Greater" : "C is Greater");
//		
//		System.out.println(result);
		
//		Ternary: shorthand of if-else, ?:
		
		//String result = (a > b) ? "A is Greater" : "B is Greater";
		
//		int result = (a > b) ? a : b;
//		
//		System.out.println("Largest number is: "+result);
		
//		if(a > b && a > c)
//		{
//			System.out.println("A is Greater");
//		}
//		else if(b > c)
//		{
//			System.out.println("B is Greater");
//		}
//		else {
//			System.out.println("C is Greater");
//		}
		
//		if(a > b)
//		{
//			System.out.println("A is Greater");
//		}
//		else {
//			System.out.println("B is Greater");
//		}

		
	}

}
