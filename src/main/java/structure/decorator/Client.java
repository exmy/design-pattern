package structure.decorator;

/**
 * Created by yiyuan on 2018/12/30 21:13.
 */
public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        component = new ConcreteDecoratorA(component);

        component = new ConcreteDecoratorB(component);

        component.operate();
    }
}
