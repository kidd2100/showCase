package showCase;
/*
 * This is dog class. Important note, to avoid any accidental change to variables
 * set variables to private, and utilize get and set methods to update change.
 * May find that some variables you do not want to be updated, so do not create a set method.
 * For this class, I will not be creating a set method for dog bark.
 */
public class dog {
	private int dogLegs = 4;
	private String dogSound = "Bark!!!";
	
	public void setDogLegs(int dogLegs) {
		this.dogLegs = dogLegs;
	}
	public int getDogLegs() {
		return dogLegs;
	}
	public String getDogSound() {
		for(int i = 0; i < 5; i++) {
			System.out.print(dogSound);}
		return dogSound;
	}
}
