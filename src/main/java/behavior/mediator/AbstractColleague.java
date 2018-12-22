package behavior.mediator;

/**
 * Created by yiyuan on 2018/12/22 13:33.
 */
public abstract class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator){
        this.mediator = mediator;
    }

    // 声明自身方法，处理自己的行为
    public abstract void selfMethod();

    // 定义依赖方法，与中介者通信
    public void depMethod(){
        mediator.operation();
    }

}
