package pessoas;

/**
 *
 * @author Rafael
 */
public class Pessoa {

    protected String nome;
    protected String endereco;
    protected String telefone;
    protected String email;
    
    public Pessoa(){
        
    }

    public void Pessoa(String nome, String endereco, String telefone, String email) {
        this.email = email;
        this.endereco = endereco;
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public String getNome(){
        return this.nome;
    }
    
}
