package problem1;

import java.util.Scanner;

public class Encrypter 
{

	public static void main(String[] args) 
	{
		Scanner num = new Scanner(System.in);
		
		int FDS = num.nextInt();
		
		encrypt(FDS); 
		num.close();
	}
	
	public static String encrypt(int FDS)
	{
		if(FDS>9999 || FDS<1000)
			System.out.printf("invalid encrypting option");
		
		else 
		{
			int a = 0,b = 0,c = 0,d = 0; 
			
			d = FDS%10;
			FDS = FDS/10;
			c = FDS%10;
			FDS = FDS/10;
			b = FDS%10;
			FDS = FDS/10;
			a = FDS%10; 
			FDS = FDS/10;
			
			a = (a+7)%10;
			b = (b+7)%10; 
			c = (c+7)%10;
			d = (d+7)%10; 
			
			//System.out.printf("The four numbers are %d, %d, %d and %d%n",a, b, c,d);
			
			//System.out.printf("%d%d%d%d",c,d,a,b);
			
			c = c * 1000;
			d = d * 100;
			a = a * 10; 
			
			FDS = c+d+b+a;
			
			//System.out.printf("%d,%d,%d,%d%n",c,d,a,b);
			
			//System.out.printf("%d%n",FDS); 
			
			if(FDS<1000)
			{
				String STR = String.format("%04d", FDS);
				System.out.printf("" +STR); 
				return STR;
			}
			else 
			{
			String str1 = Integer.toString(FDS);  
		    System.out.println("" + str1);  
		    return str1; 
			}
			
		}
		return null;
			
	}
	
}
