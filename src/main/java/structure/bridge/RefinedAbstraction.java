package structure.bridge;

/**
 * Created by yiyuan on 2019/1/12 23:01.
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    // 修正父类行为
    @Override
    public void request() {
        super.request();
        super.getImplementor().doAnything();
    }
}
