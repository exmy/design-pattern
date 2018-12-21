package structure.proxy.static_proxy;

/**
 * Created by yiyuan on 2018/12/21 15:03.
 */
public class Client {

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
