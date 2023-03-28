package Entidades;

public class Contador {
	private int maximo;
	private int valorContador;
	
	public Contador(int maximo, int valorContador) {
		super();
		this.maximo = maximo;
		this.valorContador = valorContador;
	}
	
	public int getMaximo() {
		return maximo;
	}
	public int getValorContador() {
		return valorContador;
	}
	
	public void Resetear() {
		this.valorContador=0;
	}
	public void Incrementar() {
		this.valorContador+=1;
			if(this.valorContador>=this.maximo)
				Resetear();
	}
	
}
