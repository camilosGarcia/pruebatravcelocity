package com.travelocity.automation.utils;

import java.io.*;
import java.util.Properties;

public class ConfigurationProperties {
    String result = "";
    InputStream inputStream;

    public String getProp(String propertie) throws IOException {

        try {
            Properties prop = new Properties();
            String propFileName = "configuration.properties";
                inputStream = new FileInputStream(new File("src/main/resources/properties/configuration.properties"));
            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            result=prop.getProperty(propertie);

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
        return result;
    }
}
