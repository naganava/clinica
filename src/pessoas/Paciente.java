package pessoas;

import java.util.ArrayList;
import relatorios.Prontuario;


/**
 *
 * @author Rafael
 */
public class Paciente extends Pessoa{

    protected String dataNacimento;
    protected String tipoConvenio;
    private boolean fuma;
    private boolean bebe;
    private boolean colesterol;
    private boolean diabete;
    private boolean doencaCardiaca;
    private ArrayList cirurgia;
    private ArrayList alergias;
    private Prontuario prontuario;
    private Paciente paciente;
    
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
    
    public void cadastrarComplementos(boolean fuma, boolean bebe, boolean colesterol, boolean diabete,
            boolean doencaCardiaca, ArrayList<String> cirurgia, ArrayList<String> alergias){
        this.alergias = alergias;
        this.bebe = bebe;
        this.cirurgia = cirurgia;
        this.colesterol = colesterol;
        this.diabete = diabete;
        this.doencaCardiaca = doencaCardiaca;
        this.fuma = fuma;
    }
    
    public void alterarComplementos(boolean fuma, boolean bebe, boolean colesterol, boolean diabete,
            boolean doencaCardiaca, ArrayList<String> cirurgia, ArrayList<String> alergias){
        this.alergias = alergias;
        this.bebe = bebe;
        this.cirurgia = cirurgia;
        this.colesterol = colesterol;
        this.diabete = diabete;
        this.doencaCardiaca = doencaCardiaca;
        this.fuma = fuma;
    }
    
    public void excluirComplementos(){
        this.alergias = new ArrayList();
        this.bebe = false;
        this.cirurgia = new ArrayList();
        this.colesterol = false;
        this.diabete = false;
        this.doencaCardiaca = false;
        this.fuma = false;
    }

    public String getNome() {
        return super.nome;
    }

    public void cadastrarProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    void removerProntuario() {
        this.prontuario = new Prontuario();
    }
    
}
