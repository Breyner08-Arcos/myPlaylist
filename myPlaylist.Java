public class myPlaylist {
    public static void main(String[] args) {

        Cancion c1 = new Cancion("Choking on Flowers", "Fox Academy", "Indie", 210);
        Cancion c2 = new Cancion("Billie Jean", "Michael Jackson", "Pop", 294);
        Cancion c3 = new Cancion("Heaven Knows I'm Miserable Now", "The Smiths", "Rock", 220);

        c1.reproducir();
        c2.reproducir();
        c3.reproducir();

        System.out.println();

        System.out.println(c1.obtenerDetalles());
        System.out.println(c2.obtenerDetalles());
        System.out.println(c3.obtenerDetalles());
    }
}
