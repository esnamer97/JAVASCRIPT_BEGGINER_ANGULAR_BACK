package javascript_begin.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class JavascriptBeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavascriptBeginApplication.class, args);
    }

}
