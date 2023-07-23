package mission.클라이언트와_서버_간의_통신을_구현하는_JAVA코드;

import java.io.Serializable;

// User 클래스 정의
class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "User: " + username;
    }
}

