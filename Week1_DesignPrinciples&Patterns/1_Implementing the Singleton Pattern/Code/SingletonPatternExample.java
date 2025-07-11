class Logger {

    private static Logger instance;

    private Logger() {
        System.out.println("Logger instance created.");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}


class TestLogger {
    public void runTest() {
        
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

    
        logger1.log("First message.");
        logger2.log("Second message.");

        
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("Different instances detected!");
        }
    }
}

public class SingletonPatternExample {
    public static void main(String args[]) {
        TestLogger tl = new TestLogger();
        tl.runTest();
    }
}