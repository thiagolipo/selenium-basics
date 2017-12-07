package br.com.lojasrenner.config;

import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DriverConfig {
    private static final String CONFIG_FILE_NAME = "config.properties";
    private static final String PROJECT_DIRECTORY = System.getProperty("user.dir");


    private InputStream inputStream;
    private Properties properties;
    private String driverDirectory;

    public void setChromeDriverConfig(){
        loadProperties();
        driverDirectory = PROJECT_DIRECTORY + properties.getProperty("chromeDriverFile");
        System.setProperty(properties.getProperty("chromeDriverKey"), driverDirectory);
    }

    private void loadProperties() {
        properties = new Properties();
        inputStream = getClass().getClassLoader().getResourceAsStream(CONFIG_FILE_NAME);

        try {
            properties.load(inputStream);
        }
        catch (FileNotFoundException e) {
            System.out.print(e.getMessage());
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }

    public Properties getProperties() {
        loadProperties();

        return properties;
    }
}
