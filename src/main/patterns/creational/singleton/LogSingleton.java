package main.patterns.creational.singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LogSingleton {

    private static LogSingleton _instance;
    private LogLevel logLevel;
    private List<String> logs;
    private PrintWriter printWriter;

    // constructor only instance for class for single instance
    // restricting to one instance
    // initialize the instance varaibles
    private LogSingleton() {
        logLevel = LogLevel.INFO;
        logs = new ArrayList<>();
        try {
            printWriter = new PrintWriter(new FileWriter("server.log"));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static synchronized LogSingleton getInstance() {
        // thread safety method for singleton
        // for code smell purposes in sonar we removed the double check locking
        if(_instance == null) {
            _instance = new LogSingleton();
        }
        return _instance;
    }


    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public void log(LogLevel level, String message) {
        if(level.ordinal() >= logLevel.ordinal()) {
            String log = String.format("[%s] : [%s] : %s", level, LocalDateTime.now(), message);
            System.out.println(log);
            printWriter.println(log);
            printWriter.flush();
        }
    }

    public void displayLogs() {
        for(String log : logs) {
            System.out.println(log);
        }
    }

    public static void main(String[] args) {
        LogSingleton logSingleton1 = LogSingleton.getInstance();
        LogSingleton logSingleton2 = LogSingleton.getInstance();
        System.out.println("Are we using the same object reference: Singleton Design Pattern: " + (logSingleton1 == logSingleton2));

        logSingleton1.setLogLevel(LogLevel.TRACE);
        logSingleton1.log(LogLevel.INFO, "INFO Message");
        logSingleton1.log(LogLevel.DEBUG, "DEBUG Message");
        logSingleton1.log(LogLevel.WARN, "WARN Message");
        logSingleton1.log(LogLevel.ERROR, "ERROR Message");

        logSingleton1.displayLogs();

    }
}
