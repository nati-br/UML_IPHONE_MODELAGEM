public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    private String modelo;
    private String versaoSistema;
    
    public IPhone(String modelo, String versaoSistema) {
        this.modelo = modelo;
        this.versaoSistema = versaoSistema;
    }
    
   
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }
    
    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }
    
    @Override
    public void avancar() {
        System.out.println("Avançando para próxima música");
    }
    
    @Override
    public void retroceder() {
        System.out.println("Retrocedendo para música anterior");
    }
    
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }
    
    // Métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }
    
    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }
    
    @Override
    public void encerrar() {
        System.out.println("Chamada encerrada");
    }
    
    @Override
    public void iniciarConferencia(String[] numeros) {
        System.out.println("Iniciando conferência com:");
        for (String numero : numeros) {
            System.out.println("- " + numero);
        }
    }
    
    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }
    
   
    @Override
    public void abrirURL(String url) {
        System.out.println("Abrindo URL: " + url);
    }
    
    @Override
    public void pesquisar(String termo) {
        System.out.println("Pesquisando por: " + termo);
    }
    
    @Override
    public void navegarHistorico() {
        System.out.println("Acessando histórico de navegação");
    }
    
    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }
    
    @Override
    public void fecharAba() {
        System.out.println("Aba fechada");
    }
}