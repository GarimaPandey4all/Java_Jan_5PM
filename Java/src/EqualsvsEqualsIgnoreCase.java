
public class EqualsvsEqualsIgnoreCase {

	public static void main(String[] args) {
		
		String str1 = "hello";
		String str2 = "Hello";
		
		if(str1.equals(str2))
		{
			System.out.println("Both Strings are same");
		}
		else {
			System.out.println("Strings are not same");
		}
		
		if(str1.equalsIgnoreCase(str2)) {
			
			System.out.println("Both Strings are same");
		}
		else {
			System.out.println("Strings are not same");
		}

	}

}
