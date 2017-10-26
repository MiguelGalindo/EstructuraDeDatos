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
	


	public void insertarnodoadelante(musica valor)
	{
		if(inicio==null)
		{
			inicio=new NodoDoble(valor,null,null);
			fin=inicio;
			
		}
		else
		{
			NodoDoble nuevo=new NodoDoble (valor, null, inicio);
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
	
	public void insertaratras (musica valor)
	{
		if(fin==null)
		{
			fin=new NodoDoble(valor, null, null);
			inicio=fin;
			
		}
		else
		{
			NodoDoble nuevo=new NodoDoble(valor,fin,null);
			fin.setSiguiente(nuevo);
			fin=nuevo;
		}
	}
	
	public musica eliminarprimer ()
	{
		musica nuevo=inicio.getValor();
		inicio=inicio.getSiguiente();
		
		if(inicio!=null)
		{
			inicio.setAnterior(null);
		
		}
		else
		{
			fin=null;
		}
		
		return nuevo;
	}
	
	public musica eliminarultimo ()
	{
		musica nuevo=fin.getValor();
		fin=fin.getAnterior();
		
		if(fin!=null)
		{
			fin.setAnterior(null);
		
		}
		else
		{
			inicio=null;
		}
		
		return nuevo;
	}

		public StringBuilder recorrerhaciaatras()
		{
			StringBuilder cadena = new StringBuilder();
			NodoDoble temporal=fin;
			cadena.append("NULL <-----");
			while(temporal !=null)
			{
				cadena.append(temporal.getValor());
				cadena.append("<------->");
				temporal=temporal.getAnterior();
				
			}
			
			cadena.append("NULL");
			return cadena;
		}
			
			public StringBuilder recorrerhaciaadelante()
			{
				StringBuilder cadena = new StringBuilder();
				NodoDoble temporal=inicio;
				cadena.append("NULL ----->");
				while(temporal!=null)
				{
					cadena.append(temporal.getValor());
					cadena.append("<-------->");
					temporal=temporal.getSiguiente();
					
				}
				
				cadena.append("NULL");
				return cadena;
				
			}
			
				
	
	
}
