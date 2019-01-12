package structure.bridge;

/**
 * Created by yiyuan on 2019/1/12 22:59.
 */
public abstract class Abstraction {

    private Implementor implementor;

    public Abstraction(Implementor implementor){
        this.implementor = implementor;
    }

    public void request(){
        this.implementor.doSomething();
    }

    public Implementor getImplementor(){
        return implementor;
    }
}
