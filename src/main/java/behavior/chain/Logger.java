package behavior.chain;

/**
 * Created by yiyuan on 2018/12/31 14:45.
 */
public abstract class Logger {

    public static final int DEBUG = 1;
    public static final int INFO = 2;
    public static final int WARN = 3;
    public static final int ERROR = 4;

    protected int level;

    protected Logger successor;

    public void setSuccessor(Logger successor){
        this.successor = successor;
    }

    public void log(int level, String msg){
        if(this.level <= level){
            write(msg);
        }
        if(successor != null){
            successor.log(level, msg);
        }
    }

    abstract protected void write(String msg);


}
