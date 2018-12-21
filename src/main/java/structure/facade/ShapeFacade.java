package structure.facade;

/**
 * Created by yiyuan on 2018/12/21 15:58.
 */
public class ShapeFacade {

    private Circle circle;
    private Square square;
    private Rectangle rectangle;

    public ShapeFacade(){
        circle = new Circle();
        square = new Square();
        rectangle = new Rectangle();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }

}
