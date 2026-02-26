package org.kaan.moviereccomendersystem.package7;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation2 {

    private Filter filter;

    @Autowired
    @Qualifier("contentBasedFilter")
    public void setFilter(Filter filter) {
        this.filter = filter;
        System.out.println("Setter mothod invoked...");
    }

    //use a filter tp find recommendations
    public String[] recommendMovies(String movie){
        //print the name of interface implementation being used
        System.out.println("\nName of the filter in use: " + filter + "\n");
        String[] result2 = filter.getRecommendations("Finding Dory");
        return result2;
    }
}
