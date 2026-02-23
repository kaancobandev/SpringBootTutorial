package org.kaan.moviereccomendersystem.lesson1;

public class CollaborativeFilter implements Filter {
    RecommenderImplementation recommender = new RecommenderImplementation(new CollaborativeFilter());
    public String[] getRecommendations(String movie){
        //logic of collaborative filter
        return new String[]{"Finding Nemo","Ice Age","Toy Story"};
    }
}
