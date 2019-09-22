import java.util.*;
public class Santiago_p2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int option;
		int option2 = 2;
		double weightPounds;
		double weightKilograms;
		double heightMeters;
		double heightInches;
		double BMI;
		
		System.out.println("Underweight   |(BMI <18)       | ");
		System.out.println("Normal weight |(BMI 18 - 24.9) |");
		System.out.println("Over-weight   |(BMI 25 - 29.9) |");
		System.out.println("Obese         |(BMI >= 30)     |");
		System.out.println("");
		System.out.println("How would you like to calculate you BMI?");
		System.out.println("");
		System.out.println("BMI \n option 1: Pounds    (lb) \n option 2: Kilograms (kg)");
		
		option = scnr.nextInt();
		
		
		if (option == 1) {
			System.out.println("Enter weight: ");
			weightPounds = scnr.nextInt();
			System.out.println("Enter height: ");
			heightInches = scnr.nextInt();
			BMI = ( 708 * weightPounds)/( Math.pow(heightInches, 2));
			System.out.println("Your BMI is: " + BMI );
			
			if (BMI < 18)
				System.out.print("According to the health website you are underweight (BMI <18)" );
			if (BMI >= 18 && BMI <= 24.9 )
				System.out.print("According to the health website you are normal weight (BMI >= 18 BMI <=24.9)" );
			if (BMI >= 25 & BMI <= 29.9)
				System.out.print("According to the health website you are over-weight (BMI >= 25 BMI <= 29.9)");
			if (BMI >= 30)
				System.out.print("According to the health website you are obese (BMI >= 30)");
		}
		else if (option == 2) {
		
		System.out.println("Enter weight (kg): ");
		weightKilograms = scnr.nextDouble();
		System.out.println("Enter height (meters): ");
		heightMeters = scnr.nextDouble();
		
		BMI = ( weightKilograms)/ (Math.pow(heightMeters, 2));
		
		 
			
			System.out.printf("Your BMI is: %.2f ", BMI);
			if(BMI < 18)
				System.out.print("According to the health website you are underweight (BMI <18)" );
			if (BMI >= 18 && BMI <= 24.9 )
				System.out.print("According to the health website you are normal weight (BMI >= 18 BMI <=24.9)" );
			if (BMI >= 25 & BMI <= 29.9)
				System.out.print("According to the health website you are over-weight (BMI >= 25 BMI <= 29.9)");
			if (BMI >= 30)
				System.out.print("According to the health website you are obese (BMI >= 30)");
				
	}
		}
		}


	
		

