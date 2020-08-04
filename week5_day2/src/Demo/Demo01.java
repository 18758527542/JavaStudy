package Demo;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Demo01 {
    @Test
    public void test01() throws IOException {
        Properties properties = new Properties();
        InputStream is = Demo01.class.getClassLoader().getResourceAsStream("config.properties");
        properties.load(is);
        String name = properties.getProperty("name");
        String password = properties.getProperty("password");
        String username = properties.getProperty("username");
        System.out.println(name + "," + password + "," + username);

        properties.setProperty("wrl", "www.baidu.com");
        String url = properties.getProperty("url");
        System.out.println(url);
    }
}
