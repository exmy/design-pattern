package creation.prototype;

/**
 * Created by yiyuan on 2018/12/21 14:39.
 */
public class ConcretePrototype extends Prototype {

    private String attr;

    public void setAttr(String attr) { this.attr = attr; }
    public String getAttr() { return attr; }

    @Override
    public ConcretePrototype clone(){
        ConcretePrototype n = null;
        n = (ConcretePrototype)super.clone();
        return n;
    }

}
