package structure.bridge;

/**
 * Created by yiyuan on 2019/1/12 23:02.
 */
public class Client {
    public static void main(String[] args) {
        // 将抽象和实现解耦
        Implementor implementor = new ConcreteImplementor();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.request();
    }
}
