
public class Bear extends Animal implements Jumper {

	public Bear(String species, int num) {
		super(species, num);
	}

	public int bark() {
		int result = 100;
		return result;
	}

	public void JumpHi() {
		System.out.println("jumped hi!");
	}

}
