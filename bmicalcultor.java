package Library1;

import java.util.Scanner;

public class bmicalcultor {
	  public static void main(String[] args){

	        Scanner sc = new Scanner(System.in);

	        double weight = 0.0;
	        double height = 0.0;
	        double bmicalc = 0.0;

	        System.out.print("Enter your weight \n ");
	        weight = sc.nextInt();

	        System.out.print("Enter your height  \n");
	        height = sc.nextInt();

	        bmicalc = ((weight * 703)/(height * height));

	        System.out.printf("Your BMI value is", bmicalc);
	        System.out.println("\n================================ \n ");
	        System.out.println("Underweight: Under 18.5");
	        System.out.println("Normal: 18.5-24.9 ");
	        System.out.println("Overweight: 25-29.9");
	        System.out.println("Obese: 30 or over");
	     }

}
