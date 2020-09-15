package problem1;

import java.util.*;  

public class Decrypter 
{

	public static void main(String[] args)
	{
		Scanner EFDS = new Scanner(System.in);
		String str= EFDS.nextLine();  
		//System.out.print("You have entered: "+str);   
		decrypt(str); 
		
		EFDS.close();
		

	}
	public static String decrypt(String EFDS)//EFDS= Encrpyted Four digit string
	{
		int EFDS2 = Integer.parseInt(EFDS);
		//System.out.print("You have entered: "+EFDS);
		//System.out.printf("%d ",EFDS2);
		int a = 0,b = 0,c = 0,d = 0; 
		
		d = EFDS2%10;
		EFDS2 = EFDS2/10;
		c = EFDS2%10;
		EFDS2 = EFDS2/10;
		b = EFDS2%10;
		EFDS2 = EFDS2/10;
		a = EFDS2%10; 
		EFDS2 = EFDS2/10;
		
		a = (a-7);
		b = (b-7); 
		c = (c-7);
		d = (d-7); 
		
		if(a<0)
		{
			a = a+10; 
		}
		if(b<0)
		{
			b = b+10;
		}
		if(c<0)
		{
			c = c+10; 
		}
		if(a<0)
		{
			d = d+10; 
		}
		
		
		//System.out.printf("The four numbers are %d, %d, %d and %d%n",a, b, c,d);
		
		//System.out.printf("%d%d%d%d",c,d,a,b);
		c = c * 1000;
		d = d * 100;
		a = a * 10; 
		
		EFDS2 = c+d+b+a;
		
		if(EFDS2<1000)
		{
			String STR = String.format("%04d", EFDS2);
			System.out.printf("" +STR); 
			return STR;
		}
		else 
		{
		String str1 = Integer.toString(EFDS2);  
	    System.out.println("" + str1);  
	    return str1; 
		} 
	}

}
