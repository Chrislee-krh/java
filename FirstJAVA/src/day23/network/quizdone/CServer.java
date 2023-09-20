package day23.network.quizdone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import util.Closure;

public class CServer {
	
	public static void main(String[] args) {
//		loadMember();
		// UDP Server DatagramSocket, DatagramPacket
		InetAddress multicastGroup = null;
		String multicastAddr = "230.0.0.1";
				
		try {
			multicastGroup = InetAddress.getByName(multicastAddr);
			MulticastSocket socket = new MulticastSocket(9000); //수신
			socket.joinGroup(multicastGroup);
			
			DatagramPacket inPacket;
			byte[] inMsg = null;
			
			while(true)	{// 언제 데이터가 들어올지 모르니 while
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
				String msg = new String(inMsg,0,inPacket.getLength());
			    if (msg.startsWith("id: ")) {
			        String idContents = msg.substring("id: ".length());
			        System.out.print(idContents.stripTrailing()+": ");
			    } else if (msg.startsWith("msg: ")) {
			        String msgContents = msg.substring("msg: ".length());
			        System.out.println(msgContents.stripTrailing());
			    }
//				System.out.println(msg.stripTrailing());
//				String[] msgArray = msg.toString().split(" ");
//				System.out.println(msgArray.toString());
//				System.out.println("cl값 : "+Users.cl.toString());
//				for(Map.Entry<String, String> chatterInfo : Users.cl.entrySet()) {
//					String iD = chatterInfo.getKey();
//					String local = chatterInfo.getValue();
//					System.out.println(local);
//					if(local.equals(address.toString().replace("/", ""))){
//						System.out.println(iD + ": " + msg);
//					}
//					System.out.println("ID: " + iD + "ip주소: " + local);
//				}
//				System.out.println(cl);
//				System.out.println(cl.toString()."클라이언트 메시지: "+ msg);
				
//				System.out.print("클라이언트 메시지: "+ msg);
				// 클라이언트 ip
//				InetAddress address = inPacket.getAddress();
//				// 클라이언트 포트
//				int port = inPacket.getPort();
				
//				System.out.println("");
//				System.out.println("클라이언트 주소: "+ address);
//				System.out.println("클라이언트 포트: "+ port);
			}
				
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
//	public static void loadMember() {
//		File f = new File("E:\\develop\\Java\\FirstJAVA\\file\\chatMemberlist.txt");
//		FileReader fr = null;
//		BufferedReader br = null;
//		String code = null;
//		
//		try {
//			code = new String();
//			fr = new FileReader(f);
//			br = new BufferedReader(fr);
//			
//			String line = null;
//			
//			while((line = br.readLine()) != null) {
//				
//				String[] lineArray = line.split(" ");
//				String ID = lineArray[0];
//				String local = lineArray[1];
//				
//				cl.put(ID, local);
//				System.out.println(cl.toString());
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			if(fr!=null)
//				try {Closure.close(fr);} catch (Exception e2) {}
//			if(br!=null)
//				try {Closure.close(br);} catch (Exception e2) {}
//		}
//		System.out.println(code);
//
//	}
}
