package day23.network.quiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class chatProgram {
   static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

        	Thread serverThread = new Thread(chatProgram::runServer);
            serverThread.start();
            Thread clientThread = new Thread(() -> runClient());
            clientThread.start();
            
    }
	
    public static void runServer() {
		InetAddress multicastGroup = null;
		String multicastAddr = "230.0.0.1";
				
		try {
			multicastGroup = InetAddress.getByName(multicastAddr);
			MulticastSocket socket = new MulticastSocket(9000); 
			
			socket.joinGroup(multicastGroup);
			DatagramPacket inPacket;
			byte[] inMsg = null;
			
			while(true)	{
				inMsg = new byte[1024];
				
				inPacket = new DatagramPacket(inMsg, inMsg.length); 
				
				socket.receive(inPacket);
				InetAddress address = inPacket.getAddress();
				// 클라이언트 포트
				int port = inPacket.getPort();
				
				// 문자열로 저장
				String msg = new String(inMsg,0,inPacket.getLength());
			    if (msg.startsWith("id: ")) {
			        String idContents = msg.substring("id: ".length());
			        System.out.print(idContents.stripTrailing()+": ");
			    } else if (msg.startsWith("msg: ")) {
			        String msgContents = msg.substring("msg: ".length());
			        System.out.println(msgContents.stripTrailing());
			    }   
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }

    public static void runClient() {
        try {
            BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));
            InetAddress serverIP = InetAddress.getByName("230.0.0.1");
    		Scanner scan = new Scanner(System.in);
    		System.out.println("사용하실 닉네임을 적으세요: ");
    		System.out.print(">");
    		String ID = scan.nextLine();
    		InetAddress local = InetAddress.getLocalHost();
    		Users.cl.put(ID, local.toString());
    		System.out.println("메세지를 입력하세요. 종료하시려면 'q'를 입력하세요.");
    		System.out.print(">");
            while (true) {
            	
                String data = sysin.readLine();
                if (data.equals("q") || data.equals("Q") || data.equals("ㅂ")) {
                	System.out.println("채팅프로그램을 종료합니다.");
                	System.exit(0);
                }

                DatagramSocket dataSocket = new DatagramSocket();
                
                for (Map.Entry<String, String> chatterInfo : Users.cl.entrySet()) {
                    String iD = chatterInfo.getKey();
                    String local1 = chatterInfo.getValue();
                    
                    String idMessage = "id: " + iD;
                    String msgMessage = "msg: " + data;
                    String local2Message = "local2: " + local1;
                    
                    DatagramPacket outPacket = new DatagramPacket(idMessage.getBytes(), idMessage.getBytes().length, serverIP, 9000);
                    dataSocket.send(outPacket);
                    DatagramPacket outPacket2 = new DatagramPacket(msgMessage.getBytes(), msgMessage.getBytes().length, serverIP, 9000);
                    dataSocket.send(outPacket2);
                    DatagramPacket outPacket3 = new DatagramPacket(local2Message.getBytes(), local2Message.getBytes().length, serverIP, 9000);
                    dataSocket.send(outPacket3);
                }
                dataSocket.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}
}
