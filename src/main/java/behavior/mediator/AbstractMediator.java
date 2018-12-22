package behavior.mediator;

import java.util.List;

/**
 * Created by yiyuan on 2018/12/22 13:26.
 */
// 抽象中介者
public abstract class AbstractMediator {

    protected List<AbstractColleague> colleagues;

    public void register(AbstractColleague colleague){
        colleagues.add(colleague);
    }

    public abstract void operation();
}
