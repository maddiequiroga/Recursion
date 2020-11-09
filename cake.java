public class cake {
	private int bites = 10;
	
	public cake() {
		// FIXE ME ??
	}
	
	public void takeABite() {
		--bites;
		System.out.println("Hmm...");
	}
	
	public boolean isEmpty() {
		return bites == 0;
		// looks like an empty cake;
	}
}
