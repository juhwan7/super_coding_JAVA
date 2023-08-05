package exercise.chapter_60.singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    private String filename;

    public FileWriterExample(String filename) {
        this.filename = filename;
    }

    public void writeToFile(String message) {

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filename, true);
            fileWriter.write(message + "\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
