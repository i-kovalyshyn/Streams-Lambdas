package main.java;

import main.java.cinema.MovieCollection;
import main.java.funcInterface.ImplementInterface;
import main.java.goods.Box;
import main.java.users.UsersInfo;


public class Main {
    public static void main(String[] args) {
        System.out.println("=========*Implementation of functional interface*========");
        ImplementInterface.runInterface();

        System.out.println("===============*Users who logged week ago*==============");
        UsersInfo.userLoginWeekAgo()
                .forEach((team, mail) -> System.out
                        .println("from team " + team + " was the user with @-mail-" + mail));


        System.out.println("===============*Average price of genre*=================");
        MovieCollection.averagePrice().forEach((g, p) ->
                System.out.println("Genre: " + g + " - average price is " + p));

        System.out.println("===============*Quantity of movies genre*================");
        MovieCollection.quantityOfGenre().forEach((g, q) ->
                System.out.println("Genre: " + g + " - movies = " + q));

        System.out.println("===============*List of protected goods*================");
        Box box = new Box();
        box.coverThingsToProtect().forEach(System.out::println);
    }

}
