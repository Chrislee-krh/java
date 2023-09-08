package day16.file;

import java.io.File;

public class FileExample {

	static String env_path = "C:\\Program Files\\Common Files\\Oracle\\Java\\javapath;"
			+ "C:\\Windows\\system32;C:\\Windows;C:\\Windows\\System32\\Wbem;C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\;"
			+ "C:\\Windows\\System32\\OpenSSH\\;C:\\Program Files\\Bandizip\\;C:\\Users\\tjoeun\\AppData\\Local\\Microsoft\\WindowsApps";
	
	public static void main(String[] args) {
		File f = new File("E:/filetest/a.txt");
		File dir = new File("./"); // 현재 디렉터리 ..은 이전, /는 디렉터리라는 뜻
		
		// 1. exists: 파일 혹은 디렉터리의 존재 여부 확인
		System.out.println("exist? " + f.exists());
		System.out.println("exist? " + dir.exists());
		
		// 2. isDirectory: 디렉터리인지 여부를 확인(파일이라면 false)
		System.out.println("isDirectory? "+f.isDirectory());
		System.out.println("isDirectory? "+dir.exists());
		
		// 3. isAbsolute: 해당 경로가 절대 경로인지 확인
		// 절대 경로: 파일이나 디렉터리를 지정할 때, root(최상 위)경로부터 모든 경로 정보를 다 기술
		//			어디서든 같은 값을 가짐. 하지만 경로 길이가 길다.
		// 상대 경로: 지정할 때, 현재 작업 위치를 기준으로 경로 정보 기술(e.g. ./)
		//			작업 위치에 따라 변경됨. 간단한 작성 가능
		System.out.println("isAbsolute? " + f.isAbsolute());
		System.out.println("isAbsolute? " + dir.isAbsolute());
		
		// 4 . canExecute, canRead, canWrite: 권한 확인
		System.out.println("canExecute? " + f.canExecute());
		System.out.println("canRead? " + f.canRead());
		System.out.println("canWrite? " + f.canWrite());
		System.out.println("canExecute? " + dir.canExecute());
		System.out.println("canRead? " + dir.canRead());
		System.out.println("canWrite? " + dir.canWrite());
		
		// 5. getAbsolutePath: 절대 경로 반환(상대 경로의 절대경로를 찾아줌)
		System.out.println("./의 실제 위치(절대 경로): " + dir.getAbsolutePath());
		
		// 6. 부모 폴더를 문자열로 반환
		System.out.println(f.getParent());
		
		// 7. 부모 폴더를 file객체로 반환
		File f_parent = f.getParentFile();
		System.out.println(f_parent);
		
		// 8. static한 것들(File 객체의 상수)
		System.out.println(File.separator);			// "\"	경로를 구분
		System.out.println(File.separatorChar);		// "\"
		System.out.println(File.pathSeparator);		// ";"  경로가 달라질때
		System.out.println(File.pathSeparatorChar); // ";"
		
		// 환경 변수
		String[] path = env_path.split(File.pathSeparator);
		for(String p:path) {
			System.out.println(p);
		}
		
		// 파일 생성/수정/삭제 메서드
		File test = new File("E:\\filetest3\\temp\\abc");
		// mkdir(): 해당 경로에 폴더 생성(디렉터리 생성)
		// mkdirs(): 존재하지 않은 부모 폴더까지 모두 포함하여 폴더를 생성
		if(!test.exists()) {
//			test.mkdir(); E:\\filetest3\\temp 디렉터리에 \\abc를 생성하겠다는 메서드
			test.mkdirs(); // 경로 상 없던 모든 폴더를 다 생성
		}
		
		// createNewFile: 파일이 없으면 새로 생성
		test = new File("E:\\filetest3\\a.txt");
		try {
			test.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일 생성 중 에러 발생시 출력됨!");
		}
		
		// delete: 파일이나 폴더를 삭제. 폴더는 비어있지 않으면 삭제할 수 없다.
		test = new File("E:\\filetest3\\temp\\abc");
		test.delete();
		
		// renameTo: 파일이나 폴더의 이름 및 경로를 변경
		test = new File("E:\\filetest3\\temp\\");
		File dst = new File("E:\\filetest3\\temp2\\");
		test.renameTo(dst);
		
		
		
		
		
		
	}

}
