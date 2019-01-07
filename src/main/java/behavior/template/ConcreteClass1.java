package behavior.template;

public class ConcreteClass1 extends AbstractClass {

    @Override
    protected void operate1() {
        System.out.println("ConcreteClass1::operate1");
    }

    @Override
    protected void operate2() {
        System.out.println("ConcreteClass1::operate2");
    }
}
