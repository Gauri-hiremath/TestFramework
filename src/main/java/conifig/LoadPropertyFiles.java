package conifig;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadPropertyFiles {
    static public Properties property;

    public static Properties readProperty(){
        String propertyPath = System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"webproperty.properties";
        File propertyFile = new File(propertyPath);
        property = new Properties();
        try {
            property.load(new FileInputStream(propertyFile));
        }catch (FileNotFoundException e){
            e.fillInStackTrace();
        }catch (IOException eo){
            eo.fillInStackTrace();
        }
        return property;
    }
}
