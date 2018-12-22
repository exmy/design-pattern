package behavior.iterator;

/**
 * Created by yiyuan on 2018/12/22 14:30.
 */
public class ConcreteAggregate implements Aggregate {
    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }
}
