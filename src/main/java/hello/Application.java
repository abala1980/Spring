package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    private Application() {
        throw new IllegalAccessError("Utility class");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}