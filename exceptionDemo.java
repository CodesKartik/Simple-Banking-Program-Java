public class exceptionDemo {
    public static void checkFileAccess() throws java.io.FileNotFoundException{
        java.io.File configFile = new java.io.File("Config.properties");
        java.util.Scanner fileScanner = new java.util.Scanner(configFile);
    }
}
