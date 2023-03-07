package override;

public class AExtended extends ABase {

    public void method2()
    {
        System.out.println("Clasa copil mai este numita si clasa  extinsa.");
    }
    @Override
    public void method1() {
        super.method1();
        System.out.println("Clasa copil.");
    }
}
