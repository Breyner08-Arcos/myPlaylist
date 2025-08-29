# myPlaylist

# POO - My playlist
 
## Objetivo
 
- El objetivo de este programa es crear una representación simple de una playlist musical utilizando Programación Orientada a Objetos en Java. Para ello se implementa una clase Cancion, que modela los datos básicos de una canción, y una clase principal MiPlaylist, donde se crean y manipulan varios objetos de tipo Cancion.
 
  - Este ejercicio permite aplicar conceptos como atributos, constructores, métodos e instanciación de objetos en Java.
 
## Clases
 
### Clase Cancion
 
- **Atributos**
 
  - titulo (String): nombre de la canción.
 
  - artista (String): nombre del intérprete.
 
  - Genero (String): Tipo de cancion.
 
  - duracionSegundos (int): duración de la canción en segundos.
 
- **Constructor**
 
  - Inicializa un objeto Cancion con sus atributos.
 
- **Metodos**
 
  - reproducir(): imprime en consola el mensaje.
          - Reproduciendo: [titulo] - [artista]
 
  - obtenerDetalles(): devuelve un String con la información completa y formateada de la canción.
          - Título: ---- , Artista: ----- , Duración: --- segundos, Genero: --
 
### Clase Principal
 
- **Main**
 
  - Se crean tres objetos diferentes de la clase Cancion.
 
  - Se llama al método reproducir() de cada uno.
 
  - Se imprimen los detalles de una de las canciones con el método obtenerDetalles().
 
 
## Ejemplo de ejecucion:
 
- **Reproduciendo:** Choking on Flowers - Fox Academy
- **Reproduciendo:** Billie Jean - Michael Jackson
- **Reproduciendo:** Heavens Knows I'm Miserable Now - The Smiths
 
  - **Título:** ----- , **Artista:** ----, **Duración:** --- segundos, **Genero:** ----- .