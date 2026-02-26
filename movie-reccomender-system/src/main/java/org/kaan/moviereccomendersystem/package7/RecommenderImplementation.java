package org.kaan.moviereccomendersystem.package7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    //use filter interface to select filter
    @Autowired
    @Qualifier("CF")
    private Filter filter;

    //constructor injection
    public RecommenderImplementation(@Qualifier("collaborativeFilter") Filter filter){
        this.filter = filter;
        System.out.println("Constructor invoked...");
    }

    //use a filter tp find recommendations
    public String[] recommendMovies(String movie){
        //print the name of interface implementation being used
        System.out.println("\nName of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }
}