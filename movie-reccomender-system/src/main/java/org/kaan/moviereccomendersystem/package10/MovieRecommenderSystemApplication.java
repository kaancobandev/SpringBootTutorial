package org.kaan.moviereccomendersystem.package10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@ComponentScan( basePackages = "org.kaan.moviereccomendersystem.package10",
                includeFilters = @ComponentScan.Filter(
                                    type = FilterType.REGEX,
                                    pattern = "org.kaan.moviereccomendersystem.package9.*"),
                useDefaultFilters = true)

@SpringBootApplication
public class MovieRecommenderSystemApplication {
    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        System.out.println("ContentBasedFilter bean found = " + appContext.containsBean("contentBasedFilter"));
        System.out.println("CollaborativeFilter bean found = " + appContext.containsBean("collaborativeFilter"));
    }
}
