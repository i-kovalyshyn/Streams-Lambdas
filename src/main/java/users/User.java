package main.java.users;

import java.time.LocalDate;

class User {
    private final String email;
    private final LocalDate loginTime;
    private final String team;

    public User(String email, LocalDate loginTime, String team) {
        this.email = email;
        this.loginTime = loginTime;
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getLoginTime() {
        return loginTime;
    }

    public String getTeam() {
        return team;
    }
}

