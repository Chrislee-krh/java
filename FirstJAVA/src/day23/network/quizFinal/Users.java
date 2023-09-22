package day23.network.quizFinal;

import java.util.HashMap;
import java.util.Map;

public class Users {
	private String iD;
	private String local;
	public static Map<String, String> cl = new HashMap<>();
	
	public static String getValue(String key) {
        return cl.get(key);
    }

    public static void setValue(String key, String value) {
        cl.put(key, value);
    }
	
	public Users() {}
	
	public Users(String iD, String iPAddress) {
		iD = this.iD;
		local = this.local;
	}

	public String getiD() {
		return iD;
	}

	public void setiD(String iD) {
		this.iD = iD;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	@Override
	public String toString() {
		return "Users [iD=" + iD + ", local=" + local + "]";
	}

	
}
