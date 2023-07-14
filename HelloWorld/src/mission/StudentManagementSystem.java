package mission;

public class StudentManagementSystem {

    private Student[] studentArray;//배열선언
    private int size;// 사이즈 변수 선언

    public StudentManagementSystem(int capacity) {
        //초기 공감 2를 매개변수로 받음
        this.studentArray = new Student[capacity];
        //받은 매개변수를 토대로 Student[]배열에 2공간넣고 this배열에 넣기
        this.size = 0;
        // 배열 사이즈 0으로 선언
    }

    public void addStudent(Student student) {//학생 추가 메소드
        // 학생객체를 매개변수로 받음
        if (size < studentArray.length) {
            // 초기선언한 사이즈0과 배열의 길이를 비교함 0<3
            studentArray[size] = student;
            // if가 true studentArray[0~2] 번째 배열에 가져온 스튜던트 객체를 넣는다
            size++;
            //size+1 시켜줌으로 중복으로 값이 들어가지 못하게 한다
            System.out.println("학생 추가: " + student.getName());
            //student객체에 Name 출력
        } else {
            System.out.println("학생 데이터베이스가 가득 찼습니다.");
            //if true false 일시 else출력
        }
    }

    public void removeStudent(Student student) {// 학생 삭제메소드
        // 학생객체를 매개변수로 받음
        for (int i = 0; i < size; i++) {
            //size를 for문으로 돌며 마지막 배열공간 찾기
            if (studentArray[i] == student) {
                // 받아온 객체 홍길동객체와 배열에 있는 홍길동객체 비교
                // 왼쪽으로 요소들을 이동
                for (int j = i; j < size - 1; j++) {
                    studentArray[j] = studentArray[j + 1];
                }
                studentArray[size - 1] = null;
                size--;
                System.out.println("학생 삭제: " + student.getName());
                return;
            }
        }
        System.out.println("학생을 찾을 수 없습니다.");
    }

    public void searchStudent(int studentId) {
        for (int i = 0; i < size; i++) {
            if (studentArray[i].getStudentId() == studentId) {
                System.out.println("학생을 찾았습니다:");
                System.out.println("이름: " + studentArray[i].getName());
                System.out.println("학번: " + studentArray[i].getStudentId());
                System.out.println("전공: " + studentArray[i].getMajor());
                System.out.println("학년: " + studentArray[i].getGrade());
                return;
            }
        }
        System.out.println("학생을 찾을 수 없습니다.");
    }
}
