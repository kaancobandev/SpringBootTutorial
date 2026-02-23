package org.kaan.moviereccomendersystem.package3;



public class CollaborativeFilter implements Filter3 {
    RecommenderImplementation recommender = new RecommenderImplementation(new CollaborativeFilter());
    public String[] getRecommendations(String movie){
        //logic of collaborative filter
        return new String[]{"Finding Nemo","Ice Age","Toy Story"};
    }
}