package pessoas;

import java.util.ArrayList;
import relatorios.Consulta;
import relatorios.Prontuario;

/**
 *
 * @author Rafael
 */
public class Medico extends Pessoa{
    
    ArrayList<Consulta> consultas = new ArrayList();
    
    public Medico(){
        
    }
    
    public Medico(String nome, String endereco, String telefone, String email){
        super.nome = nome;
        super.endereco = endereco;
        super.telefone = telefone;
        super.email = email;
    }
    
    public void adicionarConsulta(Consulta consulta){
        consultas.add(consulta);
    }
    
    public Paciente cadastrarDadosComplementares(Paciente paciente, boolean fuma, boolean bebe, boolean colesterol, boolean diabete,
            boolean doencaCardiaca, ArrayList<String> cirurgia, ArrayList<String> alergias){
        paciente.setAlergias(alergias);
        paciente.setBebe(bebe);
        paciente.setCirurgia(cirurgia);
        paciente.setColesterol(colesterol);
        paciente.setDiabete(diabete);
        paciente.setDoencaCardiaca(doencaCardiaca);
        paciente.setFuma(fuma);
        return paciente;
    }
    
    public Paciente alterarDadosComplementares(Paciente paciente, boolean fuma, boolean bebe, boolean colesterol, boolean diabete,
            boolean doencaCardiaca, ArrayList<String> cirurgia, ArrayList<String> alergias){
        paciente.setAlergias(alergias);
        paciente.setBebe(bebe);
        paciente.setCirurgia(cirurgia);
        paciente.setColesterol(colesterol);
        paciente.setDiabete(diabete);
        paciente.setDoencaCardiaca(doencaCardiaca);
        paciente.setFuma(fuma);
        return paciente;
    }
    
    public Paciente excluirDadosComplementares(Paciente paciente){
        ArrayList<String> cirurgias = new ArrayList();
        ArrayList<String> alergias = new ArrayList();
        
        paciente.setAlergias(alergias);
        paciente.setBebe(false);
        paciente.setCirurgia(cirurgias);
        paciente.setColesterol(false);
        paciente.setDiabete(false);
        paciente.setDoencaCardiaca(false);
        paciente.setFuma(false);
        return paciente;
    }
    
    public void cadastrarProntuario(Prontuario prontuario,Paciente paciente,ArrayList<String> sintomas, String diagnostico, String prescricao){
        prontuario.cadastrarProntuario(sintomas, diagnostico, prescricao);
        paciente.setProntuario(prontuario);
    }
    
    public void atualizarProntuario(Prontuario prontuario,Paciente paciente,ArrayList<String> sintomas, String diagnostico, String prescricao){
        prontuario.atualizarProntuario(sintomas, diagnostico, prescricao);
        paciente.setProntuario(prontuario);
    }
    
    public void removerProntuario(Prontuario prontuario,Paciente paciente){
        prontuario.removerProntuario();
        paciente.setProntuario(prontuario);
    }
  
    
    
    
}
