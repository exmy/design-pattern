package behavior.command;

public class ConcreteReceiver extends Receiver {
    @Override
    public void doSomething() {
        System.out.println("ConcreteReceiver::doSomething");
    }
}
