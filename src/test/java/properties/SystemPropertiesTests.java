package properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class SystemPropertiesTests {

    @Test
    @Tag("property")
    void SystemPropertiesTests(){
//        System.setProperty("browser", "chrome");
        String browser = System.getProperty("browser", "chrome");

        System.out.println(browser);
    }
}
