package creation.prototype;

/**
 * Created by yiyuan on 2018/12/21 14:36.
 */
// 抽象原型类
public abstract class Prototype implements Cloneable{

    @Override
    public Prototype clone(){
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }

}
