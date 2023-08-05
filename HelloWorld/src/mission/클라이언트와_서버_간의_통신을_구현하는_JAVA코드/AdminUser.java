package mission.클라이언트와_서버_간의_통신을_구현하는_JAVA코드;

// AdminUser 클래스 정의
class AdminUser extends User {
    public AdminUser(String username) {
        super(username);
    }

    @Override
    public String toString() {
        return "AdminUser: " + getUsername();
    }
}