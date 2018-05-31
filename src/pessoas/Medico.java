package pessoas;

import java.util.ArrayList;
import relatorios.Consulta;
import relatorios.RelatorioMedico;

/**
 *
 * @author Rafael
 */
public class Medico extends Pessoa{

    private Consulta consulta;
    private PacienteComplementar pacienteComplementar;
    private RelatorioMedico relatorioMedico;
    
    public void Medico(){
        
    }
    
    public void cadastroMedico(String nome, String endereco, String telefone, String email){
        super.nome = nome;
        super.endereco = endereco;
        super.telefone = telefone;
        super.email = email;
    }
    
    public void cadastrarDadosComplementares(boolean fuma, boolean bebe, boolean colesterol, boolean diabete,
            boolean doencaCardiaca, ArrayList<String> cirurgia, ArrayList<String> alergias, Paciente paciente){
        
        pacienteComplementar.cadastrarPaciente(fuma, bebe, colesterol, diabete, doencaCardiaca, cirurgia, alergias, paciente);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    
    
}
