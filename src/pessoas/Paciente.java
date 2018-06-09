package pessoas;

import java.util.ArrayList;
import relatorios.Atestado;
import relatorios.Consulta;
import relatorios.Prontuario;
import relatorios.Receita;


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
    private Atestado atestado;
    private Receita receita;
    private Consulta consulta;
    
    public Paciente(){
        
    }
    
    public Paciente(String nome, String endereco, String telefone, String email, String dataNascimento, String tipoConvenio){
        super.nome = nome;
        super.endereco = endereco;
        super.email = email;
        super.telefone = telefone;
        this.dataNacimento = dataNascimento;
        this.tipoConvenio = tipoConvenio;
    }

    public String getDataNacimento() {
        return dataNacimento;
    }

    public String getTipoConvenio() {
        return tipoConvenio;
    }

    public boolean isFuma() {
        return fuma;
    }

    public boolean isBebe() {
        return bebe;
    }

    public boolean isColesterol() {
        return colesterol;
    }

    public boolean isDiabete() {
        return diabete;
    }

    public boolean isDoencaCardiaca() {
        return doencaCardiaca;
    }

    public ArrayList getCirurgia() {
        return cirurgia;
    }

    public ArrayList getAlergias() {
        return alergias;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }

    public Atestado getAtestado() {
        return atestado;
    }

    public Receita getReceita() {
        return receita;
    }

    protected void setFuma(boolean fuma) {
        this.fuma = fuma;
    }

    protected void setBebe(boolean bebe) {
        this.bebe = bebe;
    }

    protected void setColesterol(boolean colesterol) {
        this.colesterol = colesterol;
    }

    protected void setDiabete(boolean diabete) {
        this.diabete = diabete;
    }

    protected void setDoencaCardiaca(boolean doencaCardiaca) {
        this.doencaCardiaca = doencaCardiaca;
    }

    protected void setCirurgia(ArrayList cirurgia) {
        this.cirurgia = cirurgia;
    }

    protected void setAlergias(ArrayList alergias) {
        this.alergias = alergias;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    public void setAtestado(Atestado atestado) {
        this.atestado = atestado;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }
    
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    
    
    
    
    
}
