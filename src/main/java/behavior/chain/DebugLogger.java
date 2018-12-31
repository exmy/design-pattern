package behavior.chain;

/**
 * Created by yiyuan on 2018/12/31 14:50.
 */
public class DebugLogger extends Logger {

    public DebugLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("DebugLogger::logger:" + msg);
    }
}
