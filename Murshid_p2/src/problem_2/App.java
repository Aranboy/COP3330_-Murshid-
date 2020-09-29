package problem_2;

import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
	public static void main(String[] args)
	{
	    ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

	    while (moreInput())
	    {
	        double height = getUserHeight();
	        double weight = getUserWeight();

	        BodyMassIndex bmi = new BodyMassIndex(height, weight);
	        bmiData.add(bmi);

	        displayBmiInfo(bmi);
	    }

	    displayBmiStatistics(bmiData);
	}

	private static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData) 
	{
		double bmisum = 0; 
		int length = bmiData.size();
		for(BodyMassIndex bmi : bmiData)
		{
			bmisum += bmi.bmi; 
		}
		System.out.printf("%.2f%n", bmisum/length); 
	}

	public static boolean moreInput()
	{
		System.out.println("Would you like to add iput? Select Y or N.");
		Scanner scan = new Scanner(System.in);
		char YN = scan.next().charAt(0);
		//scan.close(); 
		
		if(YN == 'Y')
			return true;
		
		else
			return false;
	}

	public static void displayBmiInfo(BodyMassIndex bmi) 
	{
 
		double REALBMI = bmi.bmi();  
		System.out.printf("%.2f%n",REALBMI); 
		System.out.println(bmi.category(REALBMI));
	}

	
	public static double getUserHeight() 
	{
		double height; 
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter height in inches"); 
		
		height = scan.nextDouble();
		
		//System.out.println("NO WORK"); 
		if(height<0)
		{
			System.out.println("System does not accept negative values!"); 
		scan.close(); 
		return (Double) null;
		}
		 
		else
		{
		//scan.close();
		return height;
		}
	}
	
	public static double getUserWeight() 
	{	
		double weight; 
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter weight in pounds"); 
		weight = scan.nextDouble();
		if(weight<0)
		{
			System.out.println("System does not accept negative values!"); 	
			return (Double) null; 
			//scan.close(); 
		}
		return weight;
	}
	
	
}

