package behavior.command;

// 发送方，调用者角色
public class Invoker {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void action(){
        command.execute();
    }

}
