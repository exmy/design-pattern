package behavior.strategy;

/**
 * Created by yiyuan on 2018/12/20 0:34.
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        System.out.println(context.doOperation(10, 5));

        context = new Context(new SubOperation());
        System.out.println(context.doOperation(10, 5));

        context = new Context(new MultiplyOperation());
        System.out.println(context.doOperation(10, 5));

    }
}
