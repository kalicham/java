/*(Conversions between feet and meters) Write a class that contains the following
 two methods: 

  Convert from feet to meters 
 public static double footToMeter(double foot)

convert from meters to feet 
 public static double meterToFoot(double meter)

 The formula for the conversion is:
 meter = 0.305 * foot
 foot = 3.279 * meter

 Write a test program that invokes these methods to display the following tables: 
     Feet     Meters     |    Meters    Feet
     -------------------------------------------
     1.0      0.305      |    20.0      65.574
     2.0      0.610      |    25.0      81.967
     ...       
     9.0      2.745      |    60.0      196.721
     10.0     3.050      |    65.0      213.115
*/
public class Main{
	public static void main(String[] args){
	System.out.println("\n Feet       Meter    |      Meter      Feet");
	System.out.println("______________________________________________");
	for (double feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters += 5){
	System.out.printf("%4.1f     ", feet);
	System.out.printf("%6.3f", footToMeter(feet));
	System.out.printf("%-11.1f", meters);
	System.out.printf("     |     ");
	System.out.printf("%7.3f\n", metersToFoot(meters));

	}
	
	}
	public static double footToMeter(double feet){
	return 0.305 * feet;
	}
	public static double metersToFoot(double meters){
	return 3.279 * meters;
	}
}