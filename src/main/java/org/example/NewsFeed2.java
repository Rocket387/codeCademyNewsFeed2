package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class NewsFeed2
{

    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};
    String[] favoriteArticles;

    public NewsFeed2() {

        favoriteArticles = new String[10]; //setting new array to hold 10 Strings
    }

    public void setFavoriteArticle(int favoriteIndex, String newArticle) {
        favoriteArticles[favoriteIndex] = newArticle; // sets the value of favoriteArticles arryay at
        // index favorite index to be the value of newArticle, this infomration is then entered in the Main method
    }

    public String[] getTopics(){
        return topics;
    }

    public int getNumTopics(){
        return topics.length;
    }

    public static void main( String[] args )
    {
        NewsFeed2 sampleFeed = new NewsFeed2();
        NewsFeed2 sampleFeed2 = new NewsFeed2();

        System.out.println("The number of topics is "+ sampleFeed2.getNumTopics());

        sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
        sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
        sampleFeed.setFavoriteArticle(0, "Oil News");

        System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
    }
}
