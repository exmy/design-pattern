package behavior.state;

/**
 * Created by yiyuan on 2018/12/30 20:24.
 */
public class ConcreteState2 extends State {
    @Override
    public void handle1() {
        super.context.setCurrentState(Context.STATE1);
        super.context.handle1();
    }

    @Override
    public void handle2() {
        System.out.println("ConcreteState2::handle2");
    }
}
