package structure.proxy.static_proxy;

/**
 * Created by yiyuan on 2018/12/21 14:59.
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("request");
    }
}
