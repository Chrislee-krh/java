//package day23.network.quiz;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.DatagramPacket;
//import java.net.DatagramSocket;
//import java.net.InetAddress;
//import java.net.MulticastSocket;
//import java.util.Map;
//import java.util.Scanner;
//
//public class ChatApplication {
//    
//
//
//package day23.network.quiz;
//
//import java.net.DatagramPacket;
//import java.net.InetAddress;
//import java.net.MulticastSocket;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.DatagramPacket;
//import java.net.DatagramSocket;
//import java.net.InetAddress;
//import java.util.Map;
//import java.util.Scanner;
//
//public class CServer {
//	
//
//public class CClient {
//	
//	public static void main(String[] args) throws Exception {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("사용하길 원하는 닉네임을 적으세요: ");
//		System.out.print(">");
//		String ID = scan.nextLine();
//		InetAddress local = InetAddress.getLocalHost();
//		
//		System.out.println("해당 컴퓨터의 로컬 ip입니다. " + local);
////		saveMember(ID + " " + local.toString().substring(local.toString().indexOf("/")+1, local.toString().length())); // 이 내용이 소켓으로 서버에 전달되고 서로 받도록
//		Users.cl.put(ID, local.toString());
////		System.out.println(cl.values());
////		System.out.println(cl.toString());
//		BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));
//		InetAddress serverIP = InetAddress.getByName("230.0.0.1");
//		InetAddress ipAddress = InetAddress.getByName("192.168.100.58");
//
//		while(true) {
//			System.out.print("메세지를 입력하세요: ");
//			String data = sysin.readLine();
//			DatagramSocket dataSocket = new DatagramSocket();
//			for(Map.Entry<String, String> chatterInfo : Users.cl.entrySet()) {
//				String iD = chatterInfo.getKey();
//				String local1 = chatterInfo.getValue();
//			
//			String idMessage = "id: " + iD;
//			String msgMessage = "msg: " + data;
//			String local2Message = "local2: " + local1;
////			byte[] msg = data.getBytes();
////			byte[] id = iD.getBytes();
////			byte[] local2 = local1.getBytes();
//			
//			DatagramPacket outPacket = new DatagramPacket(idMessage.getBytes(), idMessage.getBytes().length, serverIP, 9000);
//			dataSocket.send(outPacket);
//			DatagramPacket outPacket2 = new DatagramPacket(msgMessage.getBytes(), msgMessage.getBytes().length, serverIP, 9000);
//			dataSocket.send(outPacket2);
//			DatagramPacket outPacket3 = new DatagramPacket(local2Message.getBytes(), local2Message.getBytes().length, serverIP, 9000);
//			dataSocket.send(outPacket3);
//			dataSocket.close();
//			}
//		}
//	}
//}