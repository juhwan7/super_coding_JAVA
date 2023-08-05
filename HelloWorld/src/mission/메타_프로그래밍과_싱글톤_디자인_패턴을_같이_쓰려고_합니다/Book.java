package mission.메타_프로그래밍과_싱글톤_디자인_패턴을_같이_쓰려고_합니다;

public class Book {
    private String title;
    private String author;

    public Book() {
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("책 제목: " + title + "이고, 작가는 " + author + "입니다.");
    }

// 추가적인 메서드들을 정의할 수 있습니다.

}

