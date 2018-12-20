package behavior.strategy;

/**
 * Created by yiyuan on 2018/12/20 0:33.
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int doOperation(int a, int b){
        return strategy.doOperation(a, b);
    }

}
