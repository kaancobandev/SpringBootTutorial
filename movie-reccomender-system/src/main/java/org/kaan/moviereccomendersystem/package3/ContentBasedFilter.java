package org.kaan.moviereccomendersystem.package3;

import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter3 {
    public String[] getRecommendations(String movie){
        //logic of content based filter
        return new String[] {"Happy Feet","Ice Age","Shark Tale"};
    }
}
