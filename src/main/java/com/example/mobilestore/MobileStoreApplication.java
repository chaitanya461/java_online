import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MobileStoreApplication extends SpringBootServletInitializer {

    // IMPORTANT: Add this method to allow deployment to external Tomcat
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MobileStoreApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(MobileStoreApplication.class, args);
    }
}
