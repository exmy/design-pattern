package behavior.chain;

/**
 * Created by yiyuan on 2018/12/31 14:53.
 */
public class Client {

    private static Logger getLogger(){
        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        Logger debugLogger = new DebugLogger(Logger.DEBUG);
        Logger infoLogger = new InfoLogger(Logger.INFO);

        errorLogger.setSuccessor(infoLogger);
        infoLogger.setSuccessor(debugLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        Logger loggerChain = getLogger();

        loggerChain.log(Logger.INFO, "This is a info msg");
        System.out.println("--------");
        loggerChain.log(Logger.DEBUG, "This is a debug msg");
        System.out.println("--------");
        loggerChain.log(Logger.ERROR, "This is a error msg");
    }

}
