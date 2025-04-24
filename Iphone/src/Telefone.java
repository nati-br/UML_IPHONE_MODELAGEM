import java.util.List;

public class Telefone implements AparelhoTelefonico {
    private List<Contato> contatos;
    
    public Telefone(List<Contato> contatos) {
        this.contatos = contatos;
    }
    
    @Override
    public void ligar(String numero) {
        System.out.println("Discando número: " + numero);
    }
    
    @Override
    public void atender() {
        System.out.println("Atendendo chamada telefônica...");
    }
    
    @Override
    public void encerrar() {
        System.out.println("Chamada telefônica encerrada");
    }
    
    @Override
    public void iniciarConferencia(String[] numeros) {
        System.out.println("Iniciando conferência telefônica com:");
        for (String numero : numeros) {
            System.out.println("- " + numero);
        }
    }
    
    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando SMS para " + numero + ": " + mensagem);
    }
    
    public void visualizarContatos() {
        System.out.println("Lista de contatos:");
        for (Contato contato : contatos) {
            System.out.println("- " + contato.getNome());
        }
    }
}