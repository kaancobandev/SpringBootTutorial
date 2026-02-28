package org.kaan.moviereccomendersystem.package10;

import org.springframework.stereotype.Component;

@Component("collaborativeFilter")
public class CollaborativeFilter implements Filter {
    public CollaborativeFilter(){
        super();
    }

    //getRecommendations takes a movie as input and returns a list of similar movies
    public String[] getRecommendations(String movie){
        //implement logic of collaborative filter
        //return movie recommendations
        return new String[]{"Finding Nemo","Ice Age","Toy Story"};
    }
}