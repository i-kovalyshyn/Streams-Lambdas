package main.java.cinema;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class MovieCollection {
    private static final List<Movie> listOfMovie_1 = Arrays.asList(
            new Movie("Once Upon a Time ... in Hollywood ", "Comedy", 75),
            new Movie("Mike Wallace Is Here", "Documentary", 60),
            new Movie("Honeyland", "Documentary", 60),
            new Movie("Tel Aviv on Fire", "Comedy", 80),
            new Movie("Skin", "Biography", 60),
            new Movie("Der Boden unter den Füßen", "Drama", 75),
            new Movie("The Lion King", "Animation", 80));
    private static final List<Movie> listOfMovie_2 = Arrays.asList(
            new Movie("Spider-Man: Far from Home", "Action", 120),
            new Movie("Toy Story 4", "Animation", 100),
            new Movie("Crawl", "Action", 100),
            new Movie("Yesterday", "Comedy", 85),
            new Movie("Stuber", "Action", 80),
            new Movie("Aladdin ", "Adventure", 120),
            new Movie("Annabelle", "Horror", 100));


    public static Map<String, Double> averagePrice (){
        return Stream.concat(listOfMovie_1.stream(),listOfMovie_2.stream())
                .collect(groupingBy(Movie::getGenre, averagingDouble(Movie::getPrice)));
    }
    public static Map<String, Long> quantityOfGenre (){
        return Stream.concat(listOfMovie_1.stream(),listOfMovie_2.stream())
                .collect(groupingBy(Movie::getGenre, counting()));
    }
}

