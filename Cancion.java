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

