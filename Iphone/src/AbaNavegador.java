public class AbaNavegador {
    private String url;
    private String titulo;
    
    public AbaNavegador(String url, String titulo) {
        this.url = url;
        this.titulo = titulo;
    }
    
    public String getUrl() {
        return url;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
