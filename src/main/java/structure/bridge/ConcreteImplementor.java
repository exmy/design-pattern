package structure.bridge;

/**
 * Created by yiyuan on 2019/1/12 22:58.
 */
public class ConcreteImplementor implements Implementor{

    @Override
    public void doSomething() {
        System.out.println("ConcreteImplementor::doSomething");
    }

    @Override
    public void doAnything() {
        System.out.println("ConcreteImplementor::doAnything");
    }
}
