package pessoas;

import relatorios.Consulta;
import relatorios.RelatorioConsultas;

/**
 *
 * @author Rafael
 */
public class Secretaria extends Pessoa{

    private Consulta consulta;
    private RelatorioConsultas relatorioConsultas;

    public void Secretaria(){
        
    }
    
    public void cadastrarPaciente(Paciente paciente, String nome, String endereco, String telefone, String email, String dataNascimento, String tipoConvenio){
        paciente.cadastrarPaciente("Felipe", "Rua dos bobos", "99-99999999", "felipebobo@email.com", "01/01/90", "UNIMED");
    }
    
    public void alterarPaciente(Paciente paciente, String nome, String endereco, String telefone, String email, String dataNascimento, String tipoConvenio){
        paciente.alterarPaciente(nome, endereco, telefone, email, dataNascimento, tipoConvenio);
    }

    public void excluiPaciente(Paciente paciente) {
        paciente.excluirPaciente();
    }

    public void cadastrarConsulta(Consulta consulta, String data, String horario, Paciente paciente, Medico medico, String tipoConsulta) {
        consulta.cadastrarConsulta(data, horario, paciente, medico, tipoConsulta);
    }
    
}
