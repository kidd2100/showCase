package showCase;
import java.lang.reflect.Array;
import java.util.Scanner;

/*
 * @auth Eric Cauley
 * This class is to show case basic java understanding in the form of the following:
 * Declaring Variables, Inheritance, If/else statements, comments, loops etc
 */

public class refreshMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instantiate a new dog variable name Eric
		dog Eric = new dog();
		
		/*
		 * Set dog legs variable in dog class to two. 
		 * Since variable is private, must use setter method to set
		*/
		Eric.setDogLegs(2);
		
		//Print out line using getter method to show variable has been updated
		System.out.println("Eric has " + Eric.getDogLegs() + " legs.");
		//Print out line using getter method to retrieve dogSound variable from dog class
		System.out.println(Eric.getDogSound() + " ");
		talkToDog();
		/*
		 * The following Code shows inheritance with labDog class. If you look
		 * into the labdog class you will notice only one variable is declared.
		 * This is because it extends(inherits) from the dog class the remainder 
		 * of the variables
		 */
		//Instantiate a new lab dog named Abby.
		labDog Abby = new labDog();
		
		//Notice Abby , even tho is a labdog is able to access dog class. This is due to
		//inheritance. 
		Abby.setDogLegs(3);
		
		//Print out line using getter method to show variable has been updated
		System.out.println("Abby has " + Abby.getDogLegs() + " legs.");
		
		//Print out line using getter method to retrieve dogSound variable from dog class
		System.out.println(Abby.getDogSound() + " ");
		
		//The following line show cases a variable that is actually part of their class
		System.out.println("Abby is a " + Abby.getType() + " dog!");
		
		talkToDog();
		
		// Can not assign Eric to Abby as they are two different types Abby = Eric;
	}
	
	public static void talkToDog() {
		String dogConvo[] = loadDogArray();
		
		System.out.println("Would you like to talk to the dog?");
		
		//Create a scanner object to take in user input
		Scanner userInput = new Scanner(System.in);
		
		//initialize answer variable and turn to lower case
		String answer = userInput.nextLine().toLowerCase();

		//Create if/else statement and determine if user wants to talk to dog
			if(answer.equals("yes")) {
				System.out.println("The dog would love the socialization!");
				
				//Demonstration of a for loop
				for(int i = 0; i < dogConvo.length; i++) {
					System.out.println(dogConvo[i]);
					userInput.nextLine();
				}
			}else {
				System.out.println("The dog is sad!");
			}
	}
	
	public static String[] loadDogArray() {
		//Creation of string array
		String dogConvo[] = {"Hi", "How are you", "Good Bye for now!"};
		
		//return of String array from method
		return dogConvo;
	
		
	}

 

}
