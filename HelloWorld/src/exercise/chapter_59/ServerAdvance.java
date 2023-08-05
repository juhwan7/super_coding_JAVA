package exercise.chapter_59;

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
                Socket clientSocket = serverSocket.accept();// 클라이언트 접속 대기

                Thread request = new Thread(new RequestHandler(serverSocket.accept(), customersList));
                request.start();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        // 클라이언트로부터 데이터를 받기 위한 InputStream 생성


        // 클라이언트로 데이터를 보내기 위함 OutputStream 생성


        // 클라이언트로부터
    }
}
