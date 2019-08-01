package main.java.users;

import java.time.LocalDate;

class User {
    private String email;
    private LocalDate loginTime;
    private String team;

    User(String email, LocalDate loginTime, String team) {
        this.email = email;
        this.loginTime = loginTime;
        this.team = team;
    }

    String getEmail() {
        return email;
    }

    LocalDate getLoginTime() {
        return loginTime;
    }

    String getTeam() {
        return team;
    }
}

