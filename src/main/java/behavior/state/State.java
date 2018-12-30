package behavior.state;

/**
 * Created by yiyuan on 2018/12/30 20:17.
 */
public abstract class State {

    protected Context context;

    public void setContext(Context context){
        this.context = context;
    }

    public abstract void handle1();

    public abstract void handle2();
}
