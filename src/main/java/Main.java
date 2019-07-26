package main.java;

import main.java.users.UsersInfo;

public class Main {
    public static void main(String[] args) {
        System.out.println("===============*Users who logged week ago*===============");
        UsersInfo.userLoginWeekAgo()
                .forEach((team, mail) -> System.out.println("from team "+team+" was the user with @-mail-" + mail));
    }
}
