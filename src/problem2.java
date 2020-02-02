/*get user weight and height 
 * provide user option for user to use different scale
 * display BMI categories and their values */
import java.util.Scanner;
public class problem2 {
 public static void main(String[] args) {
	 double pounds, height,inches, kilograms,meters, feet;
	 double BMI=0;
	 Scanner input = new Scanner(System.in);
	 System.out.println("Choose 1 for SI scale or 2 for metric system: ");
	 int options = input.nextInt();
	 switch(options){
	 default :
		 while(options !=1 || options !=2 )
		 System.out.println("Please Enter a valid input either 1 or 2:");
		 options = input.nextInt();
		 
	 case 1:
		 System.out.println("Please enter height in inches: ");
		 pounds = input.nextDouble();
		 System.out.println("Enter weight in pounds");
		 inches = input.nextDouble();
		 BMI= 703*pounds/ (inches*inches);
		 break;
	 case 2: 
		 System.out.println("Please enter height in meters:");
		 meters = input.nextDouble();
		 System.out.println("Please enter weight in kilograms: ");
		 kilograms= input.nextDouble();
		 BMI= kilograms / (meters*meters);
		 break;
		 		
	 }
	 if (BMI < 18.5) {
         System.out.println("Your underweight");
     } else if (BMI < 25) {
         System.out.println("Your normal");
     } else if (BMI < 30) {
         System.out.println("Your overweight");
     } else {
         System.out.println("Your obese");
     }
	 System.out.println("\n"
	 		+ "To evaluate your results here is the categories : \nUnderweight = <18.5\r\n" + 
	 		"Normal weight = 18.5–24.9\r\n" + 
	 		"Overweight = 25–29.9\r\n" + 
	 		"Obesity = BMI of 30 or greater");
 }
}
