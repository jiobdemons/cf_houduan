package com.cf_houduan.cf_houduan;



import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



@SpringBootApplication
public class CfApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CfApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(CfApplication.class);
        springApplication.setBannerMode(Banner.Mode.CONSOLE);
        springApplication.run(CfApplication.class, args);
    }

}
