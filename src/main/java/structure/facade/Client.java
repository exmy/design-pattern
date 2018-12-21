package structure.facade;

/**
 * Created by yiyuan on 2018/12/21 16:00.
 */
public class Client {
    public static void main(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacade();

        shapeFacade.drawCircle();
        shapeFacade.drawRectangle();
        shapeFacade.drawSquare();
    }
}
