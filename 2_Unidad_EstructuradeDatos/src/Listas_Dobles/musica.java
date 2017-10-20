package Listas_Dobles;

public class musica 
{
	private String id;
	private String album;
	private String artista;
	private String genero;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public String toString()
	{
		return "Identificador: "+this.id+" "+" Artista: "+this.artista+" "+" Genero: "+this.genero+" Tipo: "+"Album: "+this.album;
	}
	
	public int compareTo(Object o)
	{
		NodoDoble temporal=(NodoDoble ) o;
		return this.id.compareTo(temporal.getid());
	}
	
	
}
