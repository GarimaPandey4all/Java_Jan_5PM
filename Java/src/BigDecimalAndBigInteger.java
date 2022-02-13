import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalAndBigInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		double a = 0.03;
//		double b = 0.04;
//		double c = b - a;
		
//		BigDecimal a = new BigDecimal("0.03"); // new: to allocate dynamic memory
//		BigDecimal b = new BigDecimal("0.04");
//		BigDecimal c = b.subtract(a);
		
		BigInteger a = new BigInteger("8273468739876"); // new: to allocate dynamic memory
		BigInteger b = new BigInteger("2348729472639");
		BigInteger c = b.add(a);
		
		System.out.println(c);

	}

}
