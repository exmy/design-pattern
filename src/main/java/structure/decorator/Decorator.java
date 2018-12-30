package structure.decorator;

/**
 * Created by yiyuan on 2018/12/30 21:07.
 */
public abstract class Decorator extends Component {

    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}
