package mission.클라이언트와_서버_간의_통신을_구현하는_JAVA코드;

import java.io.Serializable;

// UserDTO 클래스 정의
class UserDTO implements Serializable {
    private String username;
    private String role;

    public UserDTO(String username, String role) {
        this.username = username;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }
}