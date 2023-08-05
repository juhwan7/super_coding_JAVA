package exercise.chapter_56;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamTest {
    public static void main(String[] args) {
        String content = "This is content of File";

        try (FileOutputStream fos = new FileOutputStream("src/exercise/chapter_56/output.txt", true)) {

            byte[] bytes = content.getBytes();
            fos.write(bytes);

            System.out.println("txt파일이 생성되었습니다.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
