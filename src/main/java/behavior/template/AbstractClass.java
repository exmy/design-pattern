package behavior.template;

public abstract class AbstractClass {

    protected abstract void operate1();

    protected abstract void operate2();

    public void templateMethod(){
        operate1();
        operate2();
    }


}
