package com.testNGexample.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    static Properties properties;
    static {
        String path = "configuration.properties";
        FileInputStream file = null;
        try {
        file = new FileInputStream(path);
        properties = new Properties();
        properties.load(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //bilgiyi getir. methot ismini istediğimizi verebiliriz
    public static String getProperty(String key){
        //buradaki getProperty javanın methodu.
        return properties.getProperty(key);
    }

}
