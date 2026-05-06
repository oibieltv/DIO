package Utils;

public class Cleaner {
    
    public static void clear() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                // Running 'cls' command specifically via cmd /c
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Running 'clear' for Linux/macOS
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
