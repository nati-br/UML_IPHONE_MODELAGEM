public class Musica {
    private String titulo;
    private String artista;
    private String album;
    private int duracaoSegundos;
    
    public Musica(String titulo, String artista, String album, int duracaoSegundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.duracaoSegundos = duracaoSegundos;
    }
    
   
    public String getTitulo() {
        return titulo;
    }
    
    public String getArtista() {
        return artista;
    }
    
    public String getAlbum() {
        return album;
    }
    
    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }
}