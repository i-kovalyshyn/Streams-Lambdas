package main.java.cinema;

public class Movie {
    private String name;
    private String genre;
    private int price;

    Movie(String name, String genre, int price) {
        this.name = name;
        this.genre = genre;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    String getGenre() {
        return genre;
    }

    int getPrice() {
        return price;
    }
}
