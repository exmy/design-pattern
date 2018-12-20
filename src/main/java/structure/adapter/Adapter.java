package structure.adapter;

/**
 * Created by yiyuan on 2018/12/20 10:42.
 */
// 类适配器
public class Adapter extends Adaptee implements Target {

    public void request() {
        this.specificRequest();
    }
}
