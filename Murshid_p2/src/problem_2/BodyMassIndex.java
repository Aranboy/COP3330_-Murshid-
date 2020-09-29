package problem_2;

public class BodyMassIndex 
{
	//System.out.println(this.bmi); 
	
	//private double bmi;
	public double height;
	public double weight;
	public double bmi; 
	
	public BodyMassIndex(double h, double w) 
	{
		height = h;
		weight = w; 
		
	}
	
	public BodyMassIndex(double BMI)
	{
		bmi = BMI; 
	}
	
	public double bmi()
	{
		bmi = (703*weight)/(height*height);
		return bmi;	
	}

	public String category(double bmi)
	{
		if(bmi <18.5)
		{
			return "Underweight"; 
		}
		
		else if(bmi>18.49 && bmi<25)
		{
			return "Normal weight"; 
		}
		
		else if(bmi>24.9 && bmi < 30)
		{
			return "Overweight"; 
		}
		
		else
		{
			return "Obesity"; 
		}
			
	}
}
