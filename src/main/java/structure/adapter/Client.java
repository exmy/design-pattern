package structure.adapter;

/**
 * Created by yiyuan on 2018/12/20 10:44.
 */
public class Client {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();

        Target target1 = new Adapter2(new Adaptee());
        target.request();
    }
}
