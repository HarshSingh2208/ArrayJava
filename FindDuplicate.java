package Array.java;

import java.util.Scanner;

public class FindDuplicate {
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
	public static int FindDuplicate(int input[]) {
		for(int i=0;i<input.length;i++)
		{
			boolean flag = true;
			for(int j=0;j<input.length;j++)
			{
				if(i!=j && input[i]==input[j])
					return input[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		int arr[]=TakeInput();
        int result=FindDuplicate(arr);
        System.out.print(result);
	}

}
