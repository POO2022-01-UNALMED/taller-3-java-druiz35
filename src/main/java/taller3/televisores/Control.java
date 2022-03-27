package taller3.televisores;

public class Control {
	private TV tv;
	
	public TV getTv(){
		return this.tv;
	}
	
	public void setTv(TV nTv) {
		this.tv = nTv;
	}
	
	public void turnOn() {
		this.tv.turnOn();
	}
	
	public void turnOff() {
		this.tv.turnOff();
	}
	
	public void canalUp() {
		this.tv.canalUp();
	}
	
	public void canalDown() {
		this.tv.canalDown();
	}
	
	public void volumenUp() {
		this.tv.volumenUp();
	}
	
	public void volumenDown() {
		this.tv.volumenDown();
	}
	
	public void setCanal(int nCanal) {
		if (nCanal >= 1 && nCanal <= 120) {
			this.tv.canal = nCanal;
		}
	}
	
	public void enlazar(TV eTv) {
		this.tv = eTv;
		eTv.setControl(this);
	}
}
