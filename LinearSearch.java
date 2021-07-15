package Array.java;

import java.util.Scanner;

public class LinearSearch {
     
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
	public static int LinearSearch(int input[],int x) {
		for(int i=0;i<input.length;i++)
		{
			if(input[i]==x)
			{
			     return i+1;	
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int arr[]=TakeInput();
		Scanner st = new Scanner(System.in);
		int val=st.nextInt();
        int result=LinearSearch(arr,val);
        System.out.print(result);

	}

}
