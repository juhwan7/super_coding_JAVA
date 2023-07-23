package exercise.chapter_57;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        // 서버 소켓 생성
        // 클라이언트 접속 대기

        try (ServerSocket serverSocket = new ServerSocket(1234);// 서버 소켓 생성
             Socket clientSocket = serverSocket.accept();// 클라이언트 접속 대기
        ) {
            System.out.println("서버 시작되었습니다.");
            System.out.println("클라이언트가 접속하였습니다.");

            InputStream clInputStream = clientSocket.getInputStream();
            // 한국어로 잘 받기 위해서 InputStream으로 잘 받아준다
            // 빠른 속도로 받기 위해서 BufferedReader 보조스트림으로 넣어줌
            BufferedReader clientBufferedReader = new BufferedReader(new InputStreamReader(clInputStream));

            // 클라이언트로 데이터를 보내기 위한 OutputStream 생성
            OutputStream serverOutputStream = clientSocket.getOutputStream();
            // PrintWriter으로 감까줘 추가 기능을 사용할 수 있게 한다  true를 설정해 플러쉬 설정해줌
            PrintWriter printWriter = new PrintWriter(serverOutputStream ,true);

        // inputLine;
            String inputLine;

            // 클라이언트로부터 데이터를 읽고 화면에 출력
            // readLine()으로 매 줄마다 읽고 readLine()이 끝나면 null을 뱉어냄
            while ((inputLine = clientBufferedReader.readLine()) != null) {
                System.out.println("클라이언트로 부터 온 요청은 "+inputLine);

                printWriter.println("서버로부터 응답이 왔습니다.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }





        // 클라이언트로부터 데이터를 받기 위한 InputStream 생성


        // 클라이언트로 데이터를 보내기 위함 OutputStream 생성


        // 클라이언트로부터
    }
}
