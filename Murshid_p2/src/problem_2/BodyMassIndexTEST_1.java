package problem_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BodyMassIndexTEST_1 {

	@Test
	void testUnderweightCatergory() 
	{
		BodyMassIndex tester = new BodyMassIndex(18);  
		assertEquals(tester.category(tester.bmi), "Underweight");    
	}
	
	@Test
	void testNormalweightCatergory() 
	{
		BodyMassIndex tester = new BodyMassIndex(22);  
		assertEquals(tester.category(tester.bmi), "Normal weight");    
	}
	
	@Test
	void testOverweightCatergory() 
	{
		BodyMassIndex tester = new BodyMassIndex(28);  
		assertEquals(tester.category(tester.bmi), "Overweight");    
	}
	
	@Test
	void testObesityweightCatergory() 
	{
		BodyMassIndex tester = new BodyMassIndex(38);  
		assertEquals(tester.category(tester.bmi), "Obesity");    
	}
	
	@Test
	void testRealBmi()
	{
		BodyMassIndex tester = new BodyMassIndex(78,122);
		double bmi = (double) (703*122)/(78*78);
		assertEquals(tester.bmi(), bmi);
	}

}
