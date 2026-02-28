package org.kaan.moviereccomendersystem.package9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
    //for keeping track of instances created
    private static int instances = 0;

    @Autowired
    private Movie movie;

    public ContentBasedFilter() {
        instances++;
        System.out.println("ContentBasedFilter constructor called");
    }

    public Movie getMovie(){
        return movie;
    }

    public static int getInstances(){
        return ContentBasedFilter.instances;
    }

    //getRecommendations takes a movie as input and returns a list of similar movies
    public String[] getRecommendations(String movie) {
        //implement logic of content based filter

        //return movie recommendations
        return new String[]{"Finding Nemo", "Ice Age", "Toy Story"};
    }
}