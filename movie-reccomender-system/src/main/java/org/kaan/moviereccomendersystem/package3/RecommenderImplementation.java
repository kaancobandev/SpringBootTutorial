package org.kaan.moviereccomendersystem.package3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    //use filter interface to select filter
    @Autowired
    private Filter3 filter3;

    public RecommenderImplementation(Filter3 filter3){
        super();
        this.filter3 = filter3;
    }

    //use a filter tp find recommendations
    public String[] recommendMovies(String movie){
        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + filter3 + "\n");
        String[] results = filter3.getRecommendations("Finding Dory");
        return results;
    }
}