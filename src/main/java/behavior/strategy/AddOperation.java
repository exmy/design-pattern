package behavior.strategy;

/**
 * Created by yiyuan on 2018/12/20 0:30.
 */
public class AddOperation implements Strategy {

    public int doOperation(int a, int b) {
        return a + b;
    }
}
