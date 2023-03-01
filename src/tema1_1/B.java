package tema1_1;
import java.util.Scanner;

class B extends A{

	protected String s;
	
	public B(int x) {
			super(x);
		}
	
	public void readS() {
		Scanner scanner = new Scanner(System.in);
		this.s=scanner.nextLine();
		scanner.close();
	}
		
	public void displayX() {
		System.out.println(x);
	}
	
}

