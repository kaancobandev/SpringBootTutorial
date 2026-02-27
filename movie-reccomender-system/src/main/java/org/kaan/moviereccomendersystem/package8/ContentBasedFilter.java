package org.kaan.moviereccomendersystem.package8;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
    public ContentBasedFilter() {
        super();
    }

    //getRecommendations takes a movie as input and returns a list of similar movies
    public String[] getRecommendations(String movie) {
        //implement logic of content based filter

        //return movie recommendations
        return new String[]{"Finding Nemo", "Ice Age", "Toy Story"};
    }
}