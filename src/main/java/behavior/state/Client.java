package behavior.state;

/**
 * Created by yiyuan on 2018/12/30 20:26.
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setCurrentState(new ConcreteState1());
        context.handle1();
        context.handle2();
    }
}
