package MyPlaylist;

public class Cancion {

private String titulo;
private String artista;
private String genero;
private int duracionsegundos;

public Cancion(){
this.artista = artista;
this.titulo = titulo;
this.genero = genero;
this.duracionsegundos = duracionsegundos;

}

public String reproducir(){
    System.out.println("reproduciendo: "+titulo + " - " + artista);
}

 
    private String titulo;
    private String artista;
    private String genero;
    private int duracionSegundos;
 
    public Cancion(String titulo, String artista, String genero, int duracionSegundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.duracionSegundos = duracionSegundos;
    }
 
    public String getTitulo() {
        return titulo;
    }
 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
 
    public String getArtista() {
        return artista;
    }
