import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        IPhone meuIPhone = new IPhone("iPhone 1", "1.0");
        
        
        System.out.println("\n=== TESTANDO APARELHO ===");
        meuIPhone.ligar("4002-8922");
        meuIPhone.atender();
        meuIPhone.iniciarConferencia(new String[]{"9999-9999", "8888-8888"});
        meuIPhone.enviarMensagem("98765-4321", "Olá, tudo bem?");
        
        
        List<Contato> contatos = Arrays.asList(
            new Contato("Steve Jobs", Arrays.asList("9999-9999"), "steve@mail.com"),
            new Contato("Lady Gaga", Arrays.asList("8888-8888"), "tim@mail.com")
        );
        
        Telefone meuTelefone = new Telefone(contatos);
        meuTelefone.visualizarContatos();
        meuTelefone.ligar("4002-8922");
   
    }
}