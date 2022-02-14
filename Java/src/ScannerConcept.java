import java.util.Scanner;

public class ScannerConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = scanner.nextLine();
		
		System.out.println("Enter your age:");
		int age = scanner.nextInt();
		
		System.out.println("Enter Contact Number:");
		long number = scanner.nextLong();
		
		System.out.println("Enter CGPA:");
		double cgpa = scanner.nextDouble();
		
		System.out.println("Enter your gender");
		char gender = scanner.next().charAt(0);
		
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		System.out.println("Phone is: "+number);
		System.out.println("CGPA is: "+cgpa);
		System.out.println("Gender is: "+gender);

	}

}
