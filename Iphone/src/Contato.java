import java.util.List;

public class Contato {
    private String nome;
    private List<String> telefones;
    private String email;
    
    public Contato(String nome, List<String> telefones, String email) {
        this.nome = nome;
        this.telefones = telefones;
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }
    
    public List<String> getTelefones() {
        return telefones;
    }
    
    public String getEmail() {
        return email;
    }
}
