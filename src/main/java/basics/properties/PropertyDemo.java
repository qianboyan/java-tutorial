package basics.properties;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo {

  public static void main(String[] args) {
    Properties properties = new Properties();
    properties.put("commit", "1.0");
    properties.setProperty("lang", "EN");
    properties.put("author", "boyan");
    System.out.println(properties);
    String newPropertiesFile = "/Users/boyanqian/playground/java-tutor/src/main/java/basics/properties/newapp.properties";
    try {
      properties.store(new FileWriter(newPropertiesFile), "store to properties file");
    } catch (IOException e) {
      e.printStackTrace();
    }

    Properties appProps = new Properties();
    String appConfigPath = "/Users/boyanqian/playground/java-tutor/src/main/java/basics/properties/app.properties";
    try {
      appProps.load(new FileInputStream(appConfigPath));
      System.out.println(appProps.getProperty("name"));
      System.out.println(appProps);
    } catch (IOException e) {
      e.printStackTrace();
    }

    Properties xmlProps = new Properties();
    String iconConfigPath = "/Users/boyanqian/playground/java-tutor/src/main/java/basics/properties/props.xml";
    try {
      xmlProps.loadFromXML(new FileInputStream(iconConfigPath));
      System.out.println(xmlProps);
    } catch (IOException e) {
      e.printStackTrace();
    }

    Properties systemProperties = System.getProperties();
    System.out.println(systemProperties);
    System.out.println(System.getProperty("java.specification.version"));

  }

}
