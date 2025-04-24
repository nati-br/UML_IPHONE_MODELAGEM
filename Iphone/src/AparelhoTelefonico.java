public interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void encerrar();
    void iniciarConferencia(String[] numeros);
    void enviarMensagem(String numero, String mensagem);
    
} 
