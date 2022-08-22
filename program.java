	import java.util.Scanner;
	import java.util.*;
	public class program
	{
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			String text = scanner.nextLine();
			char[] arr = text.toCharArray();
			String res = "";
			for(int i=arr.length-1;i>=0;i--)
			{
				res=res+text.charAt(i);
			}	
			System.out.print(res);
		}
	}