
public class LabelledLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		11111
//		22222
//		33333
//		44444
//		55555
		
		loop1: for(int i = 1; i <= 5; i++)
		{
			loop2: for(int j = 1; j <= 5; j++)
			{
				System.out.print(i);
				
				if(j == 5)
				{
					break loop1;
				}
			}
			System.out.println();
		}

	}

}
