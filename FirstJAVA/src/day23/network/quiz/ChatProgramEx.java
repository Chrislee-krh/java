package day23.network.quiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Map;
import java.util.Scanner;

public class ChatProgramEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("서버 모드(1) 또는 클라이언트 모드(2)를 선택하세요:");
        int mode = scanner.nextInt();

        if (mode == 1) {
            Thread serverThread = new Thread(ChatProgramEx::runServer);
            serverThread.start();
        } else if (mode == 2) {
            scanner.nextLine(); // Consume the newline character
            System.out.println("사용하길 원하는 닉네임을 입력하세요: ");
            String ID = scanner.nextLine();
            Thread clientThread = new Thread(() -> runClient(ID));
            clientThread.start();
        } else {
            System.out.println("올바른 모드를 선택하세요 (1 또는 2).");
        }
    }

    public static void runServer() {
        // UDP Server DatagramSocket, DatagramPacket
        InetAddress multicastGroup = null;
        String multicastAddr = "230.0.0.1";

        try {
            multicastGroup = InetAddress.getByName(multicastAddr);
            MulticastSocket socket = new MulticastSocket(9000); // 수신
            socket.joinGroup(multicastGroup);

            DatagramPacket inPacket;
            byte[] inMsg = null;

            while (true) { // 언제 데이터가 들어올지 모르니 while
                // 데이터를 받기 위한 바이트 배열 생성
                inMsg = new byte[1024];

                // DatagramPacket 객체 생성
                inPacket = new DatagramPacket(inMsg, inMsg.length); // 1024 크기 데이터 처리

                // 패킷 데이터 수신
                socket.receive(inPacket);
                InetAddress address = inPacket.getAddress();
                // 클라이언트 포트
                int port = inPacket.getPort();

                // 문자열로 저장
                String msg = new String(inMsg, 0, inPacket.getLength());
                if (msg.startsWith("id: ")) {
                    String idContents = msg.substring("id: ".length());
                    System.out.print(idContents.stripTrailing() + ": ");
                } else if (msg.startsWith("msg: ")) {
                    String msgContents = msg.substring("msg: ".length());
                    System.out.println(msgContents.stripTrailing());
                }
                // 다른 분들 구현 방식을 받을 수 있게 여기 if로 작성하자.

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void runClient(String ID) {
        try {
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("해당 컴퓨터의 로컬 ip입니다. " + local);

            BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));
            InetAddress serverIP = InetAddress.getByName("230.0.0.1");

            while (true) {
                System.out.print("메세지를 입력하세요: ");
                String data = sysin.readLine();
                if (data.equals("q") || data.equals("Q") || data.equals("ㅂ")) {
                    System.exit(0);
                }

                DatagramSocket dataSocket = new DatagramSocket();

                for (Map.Entry<String, String> chatterInfo : Users.cl.entrySet()) {
                    String iD = chatterInfo.getKey();
                    String local1 = chatterInfo.getValue();

                    String idMessage = "id: " + iD;
                    String msgMessage = "msg: " + data;
                    String local2Message = "local2: " + local1;

                    DatagramPacket outPacket = new DatagramPacket(idMessage.getBytes(),
                            idMessage.getBytes().length, serverIP, 9000);
                    dataSocket.send(outPacket);
                    DatagramPacket outPacket2 = new DatagramPacket(msgMessage.getBytes(),
                            msgMessage.getBytes().length, serverIP, 9000);
                    dataSocket.send(outPacket2);
                    DatagramPacket outPacket3 = new DatagramPacket(local2Message.getBytes(),
                            local2Message.getBytes().length, serverIP, 9000);
                    dataSocket.send(outPacket3);
                }
                dataSocket.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
