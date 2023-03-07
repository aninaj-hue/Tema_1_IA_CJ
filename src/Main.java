import override.ABase;
import override.AExtended;

public class Main {
    public static void main(String[] args) {
        ABase obj=new AExtended();
        AExtended ex=new AExtended();
        obj.method1();
        ex.method2();
    }
}