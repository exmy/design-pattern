package structure.decorator;

/**
 * Created by yiyuan on 2018/12/30 21:10.
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    public void operate(){
        this.method1();
        super.operate();
    }

    private void method1(){
        System.out.println("decorator by ConcreteDecoratorA::method1");
    }
}
