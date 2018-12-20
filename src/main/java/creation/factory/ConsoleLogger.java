package creation.factory;

/**
 * Created by yiyuan on 2018/12/20 19:58.
 */
public class ConsoleLogger implements Logger {
    public void writeLog() {
        System.out.println("write log in file");
    }
}
