package behavior.mediator;

/**
 * Created by yiyuan on 2018/12/22 13:30.
 */
public class ConcreteColleague2 extends AbstractColleague{

    public ConcreteColleague2(AbstractMediator mediator) {
        super(mediator);
    }

    // 实现自身方法
    @Override
    public void selfMethod() {
        System.out.println("selfMethod in ConcreteColleague2");
    }
}
