package structure.facade;

/**
 * Created by yiyuan on 2018/12/21 15:57.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw");
    }
}
