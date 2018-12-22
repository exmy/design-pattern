package behavior.mediator;

/**
 * Created by yiyuan on 2018/12/22 13:30.
 */
public class ConcreteColleague1 extends AbstractColleague{

    public ConcreteColleague1(AbstractMediator mediator) {
        super(mediator);
    }

    // 实现自身方法
    @Override
    public void selfMethod() {
        System.out.println("selfMethod in ConcreteColleague1");
    }
}
