package creation.factory;

/**
 * Created by yiyuan on 2018/12/20 19:59.
 */
// 具体工厂
public class DatabaseLoggerFactory implements LoggerFactory {

    public Logger createLogger() {
        // ...
        Logger logger = new DatabaseLogger();
        // ...
        return logger;
    }
}
