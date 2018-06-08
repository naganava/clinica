package pessoas;

import java.util.ArrayList;
import relatorios.Prontuario;

/**
 *
 * @author Rafael
 */
public class Medico extends Pessoa{

    public void Medico(){
        
    }
    
    public void cadastroMedico(String nome, String endereco, String telefone, String email){
        super.nome = nome;
        super.endereco = endereco;
        super.telefone = telefone;
        super.email = email;
    }
    
    public void cadastrarDadosComplementares(Paciente paciente, boolean fuma, boolean bebe, boolean colesterol, boolean diabete,
            boolean doencaCardiaca, ArrayList<String> cirurgia, ArrayList<String> alergias){
        
        paciente.cadastrarComplementos(fuma, bebe, colesterol, diabete, doencaCardiaca, cirurgia, alergias);
    }
    
    public void alterarDadosComplementares(Paciente paciente, boolean fuma, boolean bebe, boolean colesterol, boolean diabete,
            boolean doencaCardiaca, ArrayList<String> cirurgia, ArrayList<String> alergias){
        
        paciente.alterarComplementos(fuma, bebe, colesterol, diabete, doencaCardiaca, cirurgia, alergias);
    }
    
    public void excluirDadosComplementares(Paciente paciente){
        paciente.excluirComplementos();
    }
    
    public void cadastrarProntuario(Prontuario prontuario,Paciente paciente,ArrayList<String> sintomas, String diagnostico, String prescricao){
        prontuario.cadastrarProntuario(sintomas, diagnostico, prescricao);
        paciente.cadastrarProntuario(prontuario);
    }
    
    public void atualizarProntuario(Prontuario prontuario,Paciente paciente,ArrayList<String> sintomas, String diagnostico, String prescricao){
        prontuario.atualizarProntuario(sintomas, diagnostico, prescricao);
        paciente.cadastrarProntuario(prontuario);
    }
    
    public void removerProntuario(Prontuario prontuario,Paciente paciente,ArrayList<String> sintomas, String diagnostico, String prescricao){
        prontuario.removerProntuario();
        paciente.removerProntuario();
    }
    
    public String getNome(){
        return this.nome;
    }
    
    
    
}
