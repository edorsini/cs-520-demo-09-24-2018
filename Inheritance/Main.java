
public class Main {

	public static void main(String[] args) {

		System.out.println("This is the start of my program");

		Animal Ed = new Bear("Tiger", 4);
		Animal Amanda = new Bear("Leopard", 7);
		Ed.run(); // running an instance method

		// get instance variable value
		System.out.println("number of legs: " + Ed.getNumberOfLegs());
		System.out.println("species: " + Ed.getSpecies());

		System.out.println("Amanda details");
		System.out.println("number of legs: " + Amanda.getNumberOfLegs());
		System.out.println("species: " + Amanda.getSpecies());

		System.out.println("color: " + Ed.color);
		System.out.println("species: " + Amanda.color);
		Ed.color = "blue";
		System.out.println("color: " + Ed.color);
		System.out.println("color: " + Amanda.color);
	}

}
