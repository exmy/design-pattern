package behavior.mediator;

import java.util.ArrayList;

/**
 * Created by yiyuan on 2018/12/22 13:32.
 */
// 具体中介者
public class ConcreteMediator extends AbstractMediator {

    public ConcreteMediator() {
        this.colleagues = new ArrayList<>();
    }

    // 实现业务方法，封装同事之间的调用
    @Override
    public void operation() {
        // ...
        colleagues.get(0).selfMethod(); // 通过中介者调用同事方法
        // ...
    }
}
