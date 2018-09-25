public class Animal {
	// instance variables
	private int numberofLegs;
	private String species;
	static String color = "yellow";

	// setter
	public void setNumberOfLegs(int value) {
		this.numberofLegs = value;
	}

	// getter
	public int getNumberOfLegs() {
		return this.numberofLegs;
	}

	// setter
	public void setSpecies(String value) {
		this.species = value;
	}

	// getter
	public String getSpecies() {
		return this.species;
	}

	public Animal(String species, int num) {
		this.species = species;
		this.numberofLegs = num;
	}

	public void run() {
		System.out.println("Animal is running");
	}

}
