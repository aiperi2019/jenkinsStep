package utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

    private static Properties p = new Properties();

    //no one will have access
    //utility always static

    static{
        String path ="configuration.properties";

        try {
            FileInputStream file = new FileInputStream(path);
            //any stream open, should be close
            p.load(file);
            //we having the copy
            file.close();
            //after getting copy we close
        }catch(IOException e) {
            System.out.println("Properties file not found");
        }
    }
    public static String getProperty(String keyword){

        return p.getProperty(keyword);
    }


}
