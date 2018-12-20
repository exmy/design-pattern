package behavior.strategy;

/**
 * Created by yiyuan on 2018/12/20 0:32.
 */
public class SubOperation implements Strategy {

    public int doOperation(int a, int b) {
        return a - b;
    }
}
