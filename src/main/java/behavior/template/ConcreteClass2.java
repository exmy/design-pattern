package behavior.template;

public class ConcreteClass2 extends AbstractClass {

    @Override
    protected void operate1() {
        System.out.println("ConcreteClass2::operate1");
    }

    @Override
    protected void operate2() {
        System.out.println("ConcreteClass2::operate2");
    }
}
