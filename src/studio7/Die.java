package studio7;

public class Die {
	private int sides;
	public Die(int initSides) {
		sides = initSides;
		
	}
	public int rollDie() {
		int result = (int)(Math.random() * sides) + 1;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die newDie = new Die(3);
		System.out.println(newDie.rollDie());
	}

}
