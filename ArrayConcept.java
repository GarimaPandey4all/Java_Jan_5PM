import java.util.Scanner;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[] = {1, 2, 3, 4, 5}; // arr - size - 5
		
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[2][2]; // 2 - rows, 2 - columns
		
		System.out.println("Enter values in 2D-Array");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Values in 2D-Array");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
//		int arr[] = new int[5];
//		
//		System.out.println("Enter values in Array:");
//		for(int i = 0; i < arr.length; i++)
//		{
//			arr[i] = sc.nextInt();
//		}
//		
//		System.out.println("Values in Array are:");
//		for(int i = 0; i < arr.length; i++)
//		{
//			System.out.print(arr[i]+" ");
//		}

	}

}
