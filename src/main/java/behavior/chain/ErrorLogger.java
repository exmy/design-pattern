package behavior.chain;

/**
 * Created by yiyuan on 2018/12/31 14:52.
 */
public class ErrorLogger extends Logger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("ErrorLogger::Logger: " + msg);
    }
}
