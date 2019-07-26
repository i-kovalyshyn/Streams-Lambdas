package main.java.users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;


public class UsersInfo {
    private static List<User> usersInfo() {
        List<User> usersList = new ArrayList<>();
        usersList.add(new User("pablo@ukr.net", LocalDate.parse("2019-07-25"), "team-1"));
        usersList.add(new User("picaso@ukr.net", LocalDate.parse("2019-07-03"), "team-2"));
        usersList.add(new User("michelangelo@ukr.net", LocalDate.parse("2019-07-05"), "team-3"));
        usersList.add(new User("raphael@ukr.net", LocalDate.parse("2019-07-26"), "team-3"));
        usersList.add(new User("donatelo@ukr.net", LocalDate.parse("2019-07-10"), "team-2"));
        usersList.add(new User("leonardo@ukr.net", LocalDate.parse("2019-07-15"), "team-1"));
        usersList.add(new User("kevin@ukr.net", LocalDate.parse("2019-07-20"), "team-2"));
        usersList.add(new User("erik@ukr.net", LocalDate.parse("2019-07-23"), "team-1"));
        return usersList;
    }

    public static Map<String, List<String>> userLoginWeekAgo() {
        return usersInfo().stream()
                .filter(user -> user.getLoginTime()
                        .isAfter(LocalDate.now().minusDays(7)))
                .collect(groupingBy(User::getTeam, mapping(User::getEmail, toList())));
    }
}
