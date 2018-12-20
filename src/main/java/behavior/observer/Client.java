package behavior.observer;

/**
 * Created by yiyuan on 2018/12/20 22:52.
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);

        subject.setState(10);
        subject.setState(15);
    }
}
