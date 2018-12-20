package creation.factory;

/**
 * Created by yiyuan on 2018/12/20 19:57.
 */
public class DatabaseLogger implements Logger {

    public void writeLog() {
        System.out.println("write log in database");
    }
}
