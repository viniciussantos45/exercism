public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.split(":")[1].trim();
    }

    public static String logLevel(String logLine) {
        return logLine.split(":")[0].trim().replaceAll("[\\[\\]]", "").toLowerCase();
    }

    public static String reformat(String logLine) {
        String message = LogLevels.message(logLine);
        String logLevel = LogLevels.logLevel(logLine);
        
        return String.format("%s (%s)", message, logLevel);
    }
}
