package org.kaan.moviereccomendersystem;



import org.kaan.moviereccomendersystem.package3.ContentBasedFilter;


import org.kaan.moviereccomendersystem.package3.RecommenderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieReccomenderSystemApplication {

    public static void main(String[] args) {
        //SpringApplication.run(MovieReccomenderSystemApplication.class, args);

        /*
        //passing name of the filter as constructor argument
        RecommenderImplementation recommender = new  RecommenderImplementation(new ContentBasedFilter());
        //call method to get recommendations
        String[] result = recommender.recommendMovies("Finding Dory");
        //display results
        System.out.println(Arrays.toString(result));
        */

        //ApplicationContext manages the beans and dependencies
        ApplicationContext appContext = SpringApplication.run(MovieReccomenderSystemApplication.class, args);

        //use ApplicationContext to find which filter is being used
        RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

        //call method to get recommendations
        String[] result = recommender.recommendMovies("Finding Dory");

        //display results
        System.out.println(Arrays.toString(result));
    }

}
