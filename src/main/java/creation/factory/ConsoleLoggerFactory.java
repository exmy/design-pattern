package creation.factory;

/**
 * Created by yiyuan on 2018/12/20 20:00.
 */
public class ConsoleLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        // ...
        Logger logger = new ConsoleLogger();
        // ...
        return logger;
    }
}
