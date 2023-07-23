package exercise.chapter_57;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerAdvance {

    public static void main(String[] args) {

        List<Customer> customersList = new ArrayList<>();

        // 서버 소켓 생성
        // 클라이언트 접속 대기

        try (ServerSocket serverSocket = new ServerSocket(1234);// 서버 소켓 생성
        ) {
            System.out.println("서버 시작되었습니다.");
            while (true) {
                try (Socket clientSocket = serverSocket.accept();// 클라이언트 접속 대기
                ) {
                    System.out.println("클라이언트가 접속하였습니다.");

                    InputStream clInputStream = clientSocket.getInputStream();
                    // 한국어로 잘 받기 위해서 InputStream으로 잘 받아준다
                    // 빠른 속도로 받기 위해서 BufferedReader 보조스트림으로 넣어줌
                    ObjectInputStream objectInputStream = new ObjectInputStream(clInputStream);

                    // 클라이언트로 데이터를 보내기 위한 OutputStream 생성
                    OutputStream serverOutputStream = clientSocket.getOutputStream();
                    // PrintWriter으로 감까줘 추가 기능을 사용할 수 있게 한다  true를 설정해 플러쉬 설정해줌
                    PrintWriter printWriter = new PrintWriter(serverOutputStream, true);


                    Customer customer = (Customer) objectInputStream.readObject();
                    customersList.add(customer);

                    System.out.println(customer+" 가 대기면단에 추가되었습니다.");
                    printWriter.println("현재 고객대기면단은: " + customersList);

                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        // 클라이언트로부터 데이터를 받기 위한 InputStream 생성


        // 클라이언트로 데이터를 보내기 위함 OutputStream 생성


        // 클라이언트로부터
    }
}
