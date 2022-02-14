import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedConcept {
	
	public static void main(String[] args) throws IOException {
		
		//Scanner sc = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter any integer:");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("Enter any string:");
		String b = br.readLine();
		
		System.out.println(a +" "+b);
		
		
	}

}
