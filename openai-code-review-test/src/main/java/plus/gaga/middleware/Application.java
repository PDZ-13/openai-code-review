package plus.gaga.middleware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.testng.annotations.Test;

@SpringBootApplication

public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Test
    public void test() {
        System.out.println(Integer.parseInt("aaaa1"));
        System.out.println(Integer.parseInt("aaaa2"));
        System.out.println(Integer.parseInt("aaaa3"));
    }
}
