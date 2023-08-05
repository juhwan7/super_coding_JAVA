package exercise.chapter_59;

import java.io.*;
import java.net.Socket;
import java.util.List;

public class RequestHandler implements Runnable {

    private Socket clientSocket;

    private List<Customer> customersList;

    public RequestHandler(Socket clientSocket, List<Customer> customerList) {
        this.clientSocket = clientSocket;
        this.customersList = customerList;
    }

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + ": 클라이언트가 접속하였습니다.");

        InputStream clInputStream = null;
        try {
            clInputStream = clientSocket.getInputStream();

            // 한국어로 잘 받기 위해서 InputStream으로 잘 받아준다
            // 빠른 속도로 받기 위해서 BufferedReader 보조스트림으로 넣어줌
            ObjectInputStream objectInputStream = new ObjectInputStream(clInputStream);

            // 클라이언트로 데이터를 보내기 위한 OutputStream 생성
            OutputStream serverOutputStream = clientSocket.getOutputStream();
            // PrintWriter으로 감까줘 추가 기능을 사용할 수 있게 한다  true를 설정해 플러쉬 설정해줌
            PrintWriter printWriter = new PrintWriter(serverOutputStream, true);


            Customer customer = (Customer) objectInputStream.readObject();

            ListUtils.addList(customersList, customer);
            System.out.println("Thread " + Thread.currentThread().getName() + ": " + customer + "가 대기명단에 추가되었습니다.");

            System.out.println(customer + " 가 대기면단에 추가되었습니다.");
            printWriter.println("현재 고객대기면단은: " + customersList);

            clientSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
