package tema1_1;
import java.util.Scanner;

class C extends B{

	private float y;
	
	public C(int x) {
		super(x);
	}
	
	public void readY(){
		try(Scanner scanner = new Scanner(System.in))
		{this.y=scanner.nextFloat();}
	}
	
	public void readX(){
		try(Scanner scanner = new Scanner(System.in))
		{this.x=scanner.nextInt();}
	}
	
	public void displayXYS() {
		System.out.println("X:"+x+" "+"Y:"+y+" "+"S:"+s);
	}

}

