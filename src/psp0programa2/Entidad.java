package psp0programa2;

public abstract class Entidad {

	protected String nombre;
	protected int tamanio;

	public Entidad(String nombre) {
		this.nombre = nombre;
		this.tamanio = 0;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public int getTamanio(){
		if (this.tamanio == 0){
			setTamanio();
		}
		return this.tamanio;
	}

	protected abstract void setTamanio();

}
