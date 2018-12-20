package structure.adapter;

/**
 * Created by yiyuan on 2018/12/20 10:46.
 */
// 对象适配器
public class Adapter2 implements Target {

    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specificRequest();
    }
}
