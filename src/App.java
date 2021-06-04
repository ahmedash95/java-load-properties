public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Host is: " + PropertiesLoader.instance().get("host"));
        System.out.println("Username is: " + PropertiesLoader.instance().get("username"));
        System.out.println("Password is: " + PropertiesLoader.instance().get("password"));
    }
}
