package pessoas;


/**
 *
 * @author Rafael
 */
public class Paciente extends Pessoa{

    protected String dataNacimento;
    protected String tipoConvenio;
    
    public Paciente(){
        
    }
    
    protected void excluirPaciente(){
        super.nome = " ";
        super.endereco = " ";
        super.email = " ";
        super.telefone = " ";
        this.dataNacimento = " ";
        this.tipoConvenio = " ";
    }
    
    protected void alterarPaciente(String nome, String endereco, String telefone, String email, String dataNascimento, String tipoConvenio){
        if(nome !=""){
            super.nome = nome;
        }
        if(endereco != ""){
            super.endereco = endereco;
        }
        if(email != ""){
            super.email = email;
        }
        if(telefone != ""){
            super.telefone = telefone;
        }
        if(dataNascimento != ""){
            this.dataNacimento = dataNascimento;
        }
        if(tipoConvenio != ""){
            this.tipoConvenio = tipoConvenio;
        }
    }
    
    public void cadastrarPaciente(String nome, String endereco, String telefone, String email, String dataNascimento, String tipoConvenio){
        super.nome = nome;
        super.endereco = endereco;
        super.email = email;
        super.telefone = telefone;
        this.dataNacimento = dataNascimento;
        this.tipoConvenio = tipoConvenio;
    }

    public String getNome() {
        return super.nome;
    }
    
}
