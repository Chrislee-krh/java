package day07.quiz;

public class Monitor {

	//필드
	int resol;
	int size;
	int bright;
	boolean state;
	
	//생성자
	Monitor() {
		this.resol = 100;
		this.size = 100;
		this.bright = 100;
		this.state = false;
	}
	
	//메서드
	public void pressPowerButton() {
		state = !state;
		if(state != true && state !=false) {
			System.out.println("파워 버튼을 눌러주세요!");
		}
	}

	public int getResol() {
		return resol;
	}

	public void setResol(int resol) {
		this.resol = resol;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getBright() {
		return bright;
	}

	public void setBright(int bright) {
		this.bright = bright;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
	
	
}
