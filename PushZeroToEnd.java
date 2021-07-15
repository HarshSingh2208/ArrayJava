package Array.java;

import java.util.Scanner;

public class PushZeroToEnd {

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
	public static void Print(int input[]) {
		int size=input.length;
		for(int i=0;i<size;i++)
		{
			System.out.print(input[i]+" ");
		}
		
	}
	public static void PushZeroToEnd(int input[]) {
		int nextIndex=0;
		int current=0;
		for(int i=0;i<input.length;i++)
		{
			if(input[current]==1)
			{
				input[current]=0;
				input[nextIndex]=1;
				nextIndex++;
			}
			current++;
		}
		
	}
	public static void main(String[] args) {
		
		int arr[]=TakeInput();
        PushZeroToEnd(arr);
        Print(arr);
        
	}

}
