package core;

import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

    private static Properties properties = null;
    private static String  filename = "config.properties";

    static {
        properties = new Properties();
        try {
             properties.load(ReadProperties.class.getClassLoader().getResourceAsStream(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String getUrl () { return properties.getProperty("url");}

    public static String getUserName () { return properties.getProperty("username");}

    public static String getEmail () { return properties.getProperty("email");}

    public static String getPassword () { return properties.getProperty("password");}



}
