package creation.prototype;

/**
 * Created by yiyuan on 2018/12/21 14:41.
 */
public class Client {

    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAttr("prototype");
        ConcretePrototype newPrototype = prototype.clone();
        newPrototype.setAttr("newPrototype");

        System.out.println(prototype == newPrototype);
        System.out.println(prototype.getAttr());
        System.out.println(newPrototype.getAttr());
    }
}
