package taller3.televisores;

public class TV {
	private Marca marca;
	public int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	private static int numTV;
	
	public TV(Marca marca, boolean  estado) {
		this.marca = marca;
		this.canal = 1;
		this.precio = 500;
		this.estado = estado;
		this.volumen = 1;
	}
	        
	public Marca getMarca(){
		return this.marca;
	}
	
	public int getCanal(){
		return this.canal;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public int getVolumen() {
		return this.volumen;
	}
	
	public Control getControl() {
		return this.control;
	}
	
	public void setMarca(Marca nMarca) {
		this.marca = nMarca;
	}
	
	public void setCanal(int ncanal) {
		this.canal = ncanal;
	}
	
	public void setPrecio(int nPrecio) {
		this.precio = nPrecio;
	}

	public void setVolumen(int nVolumen) {
		this.volumen = nVolumen;
	}
	
	public void setControl(Control nControl) {
		this.control = nControl;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public void canalUp() {
		if (this.estado && this.canal < 121) this.canal++;
	}
	
	public void canalDown() {
		if (this.estado && this.canal > 1) this.canal--;
	}
	
	public void volumenUp() {
		if (this.estado && this.volumen < 7) this.volumen++;
	}
	
	public void volumenDown() {
		if (this.estado && this.volumen > 0) this.volumen--;
	}
}
