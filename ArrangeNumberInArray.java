package Array.java;
import java.util.Scanner;
public class ArrangeNumberInArray {
	
	public static void Print(int input[]) {
		int size=input.length;
		for(int i=0;i<size;i++)
		{
			System.out.print(input[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int size=s.nextInt();
		
		int input[]=new int[size];
		int start=1;
		int k=0;
		if(size%2!=0)
		{
		for(int i=0;i<(size/2)+1;i++)
		{
			input[i]=start;
			start=start+2;
			k=k+1;
		}
		start=start-3;
		for(int i=k;i<size;i++)
		{
			input[i]=start;
			start=start-2;
		}
		}
		else
		{
			for(int i=0;i<(size/2);i++)
			{
				input[i]=start;
				start=start+2;
				k=k+1;
			}
			start=start-1;
			for(int i=k;i<size;i++)
			{
				input[i]=start;
				start=start-2;
			}
		}
		
		Print(input);
		
		
	}

}
