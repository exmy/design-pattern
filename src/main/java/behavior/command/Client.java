package behavior.command;

public class Client {
    public static void main(String[] args) {
        // 把调用者和接收者解耦
        Invoker invoker = new Invoker();
        Receiver receiver = new ConcreteReceiver();
        Command command = new ConcreteCommand(receiver);
        invoker.setCommand(command);
        invoker.action();
    }
}
