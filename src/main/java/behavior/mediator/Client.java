package behavior.mediator;

/**
 * Created by yiyuan on 2018/12/22 13:39.
 */
public class Client {

    public static void main(String[] args) {
        AbstractMediator mediator = new ConcreteMediator();

        ConcreteColleague1 c1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 c2 = new ConcreteColleague2(mediator);

        mediator.register(c1);
        mediator.register(c2);

        mediator.operation();
    }
}
