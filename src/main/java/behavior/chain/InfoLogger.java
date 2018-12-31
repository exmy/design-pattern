package behavior.chain;

/**
 * Created by yiyuan on 2018/12/31 14:51.
 */
public class InfoLogger extends Logger {

    public InfoLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("InfoLogger::logger:" + msg);
    }
}
