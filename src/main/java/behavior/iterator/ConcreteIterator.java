package behavior.iterator;

/**
 * Created by yiyuan on 2018/12/22 14:29.
 */
public class ConcreteIterator implements Iterator {

    private ConcreteAggregate objects;

    private int cursor;

    public ConcreteIterator(ConcreteAggregate objects){
        this.objects = objects;
    }

    @Override
    public void first() {

    }

    @Override
    public void next() {

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object currentItem() {
        return null;
    }
}
