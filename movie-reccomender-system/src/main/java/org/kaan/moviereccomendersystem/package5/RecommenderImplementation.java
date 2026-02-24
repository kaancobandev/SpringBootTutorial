package org.kaan.moviereccomendersystem.package5;

import org.kaan.moviereccomendersystem.package4.ContentBasedFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    //use filter interface to select filter
    @Autowired
    private Filter contentBasedFilter;



    //use a filter tp find recommendations
    public String[] recommendMovies(String movie){
        //print the name of interface implementation being used
        System.out.println("\nName of the filter in use: " + contentBasedFilter + "\n");
        String[] results = contentBasedFilter.getRecommendations("Finding Dory");
        return results;
    }
}