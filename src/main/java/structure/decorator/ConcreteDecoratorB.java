package structure.decorator;

/**
 * Created by yiyuan on 2018/12/30 21:12.
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    private void method2(){
        System.out.println("decorate by ConcreteDecoratorB:method2");
    }

    public void operate(){
        super.operate();
        this.method2();
    }

}
