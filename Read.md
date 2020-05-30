iSpringBootApplication
otApplication
public class BookingDemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
            SpringApplication.run(BookingDemoApplication.class, args);
	        }

		    @Override
		        protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
			        return builder.sources(BookingDemoApplication.class);
				    }
				    }
public class BookingDemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BookingDemoApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BookingDemoApplication.class);
    }
}
