package behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yiyuan on 2018/12/20 22:35.
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState(){ return state; }
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public boolean attach(Observer observer){
        return observers.add(observer);
    }

    public boolean deattach(Observer observer){
        return observers.remove(observer);
    }

    public void notifyAllObservers(){
        for(Observer observer: observers){
            observer.update();
        }
    }
}
