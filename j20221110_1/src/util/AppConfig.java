package util;

import com.sun.tools.javac.Main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class AppConfig {
    private static final String PROPERTY_FILE = "config.property";
    private  static final Properties appPROPERTY= new Properties();

    static {
       read();
    }


    public static void read(){
        try(InputStream in = Main.class.getClassLoader().getResourceAsStream(PROPERTY_FILE)) {
            appPROPERTY.load(new InputStreamReader(in));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String get(String property){
        return appPROPERTY.getProperty(property);
    }

    public static String get(String property, String defaultValue){
        return appPROPERTY.getProperty(property, defaultValue);
    }

}
