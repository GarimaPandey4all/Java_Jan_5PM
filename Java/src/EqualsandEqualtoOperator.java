
public class EqualsandEqualtoOperator {
	public static void main(String[] args) {
		
//		== vs equals()
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(s1 == s2); // false: reference comparison
		System.out.println(s1.equals(s2)); // true: content comparison
		
	}
}
