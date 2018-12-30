package behavior.state;

/**
 * Created by yiyuan on 2018/12/30 20:17.
 */
public class Context {

    public final static State STATE1 = new ConcreteState1();
    public final static State STATE2 = new ConcreteState2();

    private State currentState;

    public State getCurrentState(){
        return currentState;
    }

    public void setCurrentState(State newState){
        this.currentState = newState;
        // switch state
        this.currentState.setContext(this);
    }

    public void handle1(){
        this.currentState.handle1();
    }

    public void handle2(){
        this.currentState.handle2();
    }

}
