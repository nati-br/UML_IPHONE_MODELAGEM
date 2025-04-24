import java.util.List;

public class IPod implements ReprodutorMusical {
    private List<Musica> listaMusicas;
    private int volume;
    
    public IPod(List<Musica> listaMusicas) {
        this.listaMusicas = listaMusicas;
        this.volume = 50; // Volume padrão 50%
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocando música no iPod...");
    }
    
    @Override
    public void pausar() {
        System.out.println("Música pausada no iPod");
    }
    
    @Override
    public void avancar() {
        System.out.println("Avançando para próxima música no iPod");
    }
    
    @Override
    public void retroceder() {
        System.out.println("Retrocedendo para música anterior no iPod");
    }
    
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música no iPod: " + musica);
    }
    
    public void modoCoverFlow() {
        System.out.println("Ativando modo Cover Flow no iPod");
    }
    
    public void ajustarVolume(int novoVolume) {
        this.volume = novoVolume;
        System.out.println("Volume ajustado para: " + novoVolume + "%");
    }
}