package main.java.cinema;

public class Movie {
    private final String name;
    private  final String genre;
    private final int price;

    public Movie(String name, String genre, int price) {
        this.name = name;
        this.genre = genre;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }
}
