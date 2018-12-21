package structure.proxy.static_proxy;

/**
 * Created by yiyuan on 2018/12/21 14:59.
 */
public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject){
        this.subject = subject;
    }

    @Override
    public void request() {
        before();
        this.subject.request();
        after();
    }

    private void before(){
        System.out.println("do something before request");
    }

    private void after(){
        System.out.println("do something after request");
    }
}
