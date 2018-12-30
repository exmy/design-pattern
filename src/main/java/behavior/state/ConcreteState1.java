package behavior.state;

/**
 * Created by yiyuan on 2018/12/30 20:21.
 */
public class ConcreteState1 extends State {

    @Override
    public void handle1() {
        System.out.println("ConcreteState1::handle1");
    }

    @Override
    public void handle2() {
        super.context.setCurrentState(Context.STATE2);
        super.context.handle2();
    }
}
