// 1. Extend SpringBootServletInitializer
public class MobileStoreApplication extends SpringBootServletInitializer {

    // 2. Override this specific method
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MobileStoreApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(MobileStoreApplication.class, args);
    }
}
