package Array.java;
import java.util.Scanner;
public class SumOfArray {
	
	
	public static int[] TakeInput() {
		Scanner s = new Scanner(System.in);
		int size=s.nextInt();
		int input[]=new int[size];
		for(int i=0;i<size;i++)
		{
			input[i]=s.nextInt();
		}
		
		return input;
	}
	public static int SumOfArray(int input[]) {
		int sum=0;
		for(int i=0;i<input.length;i++)
		{
			sum=sum+input[i];
		}
		return sum;
	}

	public static void main(String[] args) {

          int arr[]=TakeInput();
          int result=SumOfArray(arr);
          System.out.print(result);
          
		
	}

}
