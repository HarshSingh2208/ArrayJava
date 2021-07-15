package Array.java;

import java.util.Scanner;

public class FindUnique {
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
	/*public static int FindUnique(int input[]) {
		int res=0;
		for(int i=0;i<input.length;i++)
		{
			res=res^input[i];
		}
		return res;
	}*/
	
	public static int FindUnique(int input[]) {
		for(int i=0;i<input.length;i++)
		{
			boolean flag = true;
			for(int j=0;j<input.length;j++)
			{
				if(i!=j && input[i]==input[j])
					flag=false;
			}
			if(flag==true)
			{
				return input[i];
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[]=TakeInput();
        int result=FindUnique(arr);
        System.out.print(result);
	}

}
