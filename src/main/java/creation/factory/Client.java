package creation.factory;

/**
 * Created by yiyuan on 2018/12/20 20:01.
 */
public class Client {
    public static void main(String[] args) {
        LoggerFactory factory = new DatabaseLoggerFactory();
        Logger logger = factory.createLogger();
        logger.writeLog();

        factory = new ConsoleLoggerFactory();
        logger = factory.createLogger();
        logger.writeLog();

    }
}
