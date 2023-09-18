package day23.network;

import java.net.URL;
import java.net.URLConnection;

public class URLConnectionEx {

	public static void main(String[] args) {
		// URLConnection 예제    
		
		URL url = null;
		String address = "https://www.egovframe.go.kr/EgovIntro.jsp?menu=1&submenu=1";
		
		try {
			url = new URL(address);
			URLConnection conn = url.openConnection();
			System.out.println("conn.toString(): "+conn.toString());
			System.out.println("getAllowUserInteraction(): "+ conn.getAllowUserInteraction());
			System.out.println("getConnectTimeout(): "+ conn.getConnectTimeout());
			System.out.println("getContent(): "+ conn.getContent());
			System.out.println("getContentEncoding(): "+ conn.getContentEncoding()); // encoding설정하지 않으면 null -> ascii코드라고 생각하면 됨.
			System.out.println("getContentLength(): "+ conn.getContentLength()); // header정보를 읽어옴. content가 없으면 -1
			System.out.println("getContentType(): "+ conn.getContentType());
			System.out.println("getDate(): " + conn.getDate()); // millisec(영국 그리니치 천문대 1970/1/1기준 지나간 초)
			System.out.println("getDefaultUseCaches(): "+ conn.getDefaultUseCaches()); // 캐쉬처리한다는 말은 계속 불러오는게 아니라 처리된거 불러오는 식
			System.out.println("getDoInput(): "+conn.getDoInput());
			System.out.println("getDoOutput(): "+conn.getDoOutput());
			
			System.out.println("getExpiration(): "+ conn.getExpiration());
			System.out.println("getHeaderFields(): "+ conn.getHeaderFields());
			
			System.out.println("getIfModifiedSince(): "+ conn.getIfModifiedSince());
			System.out.println("getLastModified(): "+ conn.getLastModified());
			
			System.out.println("getReadTimeout(): "+ conn.getReadTimeout());
			System.out.println("getURL(): "+ conn.getURL());
			System.out.println("getUseCaches(): "+ conn.getUseCaches());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
