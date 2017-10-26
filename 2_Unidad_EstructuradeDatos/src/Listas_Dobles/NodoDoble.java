package Listas_Dobles;

public class NodoDoble 
{
	private musica valor;
	private NodoDoble siguiente;
	private NodoDoble anterior;
	
	public NodoDoble(musica val,NodoDoble ante, NodoDoble sig)
	{
		siguiente=sig;
		anterior=ante;
		valor=val;
	}

	public musica getValor() {
		return valor;
	}

	public void setValor(musica valor) {
		this.valor = valor;
	}

	public NodoDoble getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoDoble siguiente) {
		this.siguiente = siguiente;
	}

	public NodoDoble getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoDoble anterior) {
		this.anterior = anterior;
	}
	
	
	
}
