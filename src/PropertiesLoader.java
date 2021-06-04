import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {
    private Properties properties;

    private static PropertiesLoader instance;

    private PropertiesLoader() throws IOException {
        String rootPath = System.getProperty("user.dir");
        String appConfigPath = rootPath + "/resources/application.properties";

        properties = new Properties();
        properties.load(new FileInputStream(appConfigPath));
    }

    public static PropertiesLoader instance() throws IOException {
        if(instance == null) {
            instance = new PropertiesLoader();
        }

        return instance;
    }

    public String get(String key) {
        return properties.getProperty(key);
    }
}
