package behavior.iterator;

/**
 * Created by yiyuan on 2018/12/22 14:27.
 */
public interface Iterator {
    void first();
    void next();
    boolean hasNext();
    Object currentItem();
}
