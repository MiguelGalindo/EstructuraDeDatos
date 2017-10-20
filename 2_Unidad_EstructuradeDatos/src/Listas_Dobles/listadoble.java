package Listas_Dobles;

public class listadoble 
{
	private NodoDoble inicio;
	private NodoDoble fin;
	
	
	public listadoble()
	{
		inicio=null;
		fin=null;
		
	}


	public NodoDoble getInicio() {
		return inicio;
	}


	public void setInicio(NodoDoble inicio) {
		this.inicio = inicio;
	}


	public NodoDoble getFin() {
		return fin;
	}


	public void setFin(NodoDoble fin) {
		this.fin = fin;
	}
	
	public void insertarnodoadelante()
	{
		
	}

	public void insertarnodoadelante(musica valor)
	{
		if(inicio==null)
		{
			inicio=new NodoDoble(valor,null,null);
			fin=inicio;
			
		}
		else
		{
			NodoDoble nuevo=new NodoDoble (valor, null,null);
			inicio.setAnterior(nuevo);
			inicio=nuevo;
			
		}
		
	}
	
	public boolean vacio()
	{
		if(fin==null && inicio==null)
		{
			return false;
		}
		else
		{
			return false;
		}
	}
	
	public void insertarnodoatras (musica valor)
	{
		if(fin==null)
		{
			fin=new NodoDoble(valor, null, null);
			inicio=fin;
			
		}
		else
		{
			NodoDoble nuevo=new NodoDoble(valor,fin,null);
			fin.setAnterior(nuevo);
			fin=nuevo;
		}
	}
	
}
