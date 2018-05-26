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
    
    public Paciente(String nome, String endereco, String telefone, String email, String dataNascimento, String tipoConvenio){
        super(nome,endereco,telefone,email);
        this.dataNacimento = dataNascimento;
        this.tipoConvenio = tipoConvenio;
    }
    
    public void ExcluirPaciente(){
        super.nome = " ";
        super.endereco = " ";
        super.email = " ";
        super.telefone = " ";
        this.dataNacimento = " ";
        this.tipoConvenio = " ";
    }
    
    public void AlterarPaciente(String nome, String endereco, String telefone, String email, String dataNascimento, String tipoConvenio){
        super.nome = nome;
        super.endereco = endereco;
        super.email = email;
        super.telefone = telefone;
        this.dataNacimento = dataNascimento;
        this.tipoConvenio = tipoConvenio;
    }
    
    public void CadastrarPaciente(String nome, String endereco, String telefone, String email, String dataNascimento, String tipoConvenio){
        super.nome = nome;
        super.endereco = endereco;
        super.email = email;
        super.telefone = telefone;
        this.dataNacimento = dataNascimento;
        this.tipoConvenio = tipoConvenio;
    }

    public String getNome() {
        return this.nome;
    }
    
}
