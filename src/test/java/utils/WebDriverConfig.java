package utils;

import conifig.LoadPropertyFiles;

import java.util.Properties;

public class WebDriverConfig {
    static {
        Properties properties =  new LoadPropertyFiles().readProperty();
    }
}
