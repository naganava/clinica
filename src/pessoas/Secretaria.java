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
    private Paciente paciente;

    public void Secretaria(){
        
    }
    
    public Paciente cadastrarPaciente(String nome, String endereco, String telefone, String email, String dataNascimento, String tipoConvenio){
        this.paciente = new Paciente(nome, endereco, telefone, email, dataNascimento, tipoConvenio);
        return paciente;
    }
    
    public Paciente alterarPaciente(Paciente paciente, String nome, String endereco, String telefone, String email, String dataNascimento, String tipoConvenio){
        paciente = new Paciente(nome, endereco, telefone, email, dataNascimento, tipoConvenio);
        return paciente;
    }

    public void excluiPaciente(Paciente paciente) {
        //procura pelo paciente no array e exclui
    }

    public Consulta cadastrarConsulta(String data, String horario, String tipoConsulta, Paciente paciente, Medico medico) {
        consulta = new Consulta(data, horario, tipoConsulta, paciente, medico);
        paciente.setConsulta(consulta);
        medico.adicionarConsulta(consulta);
        return consulta;
    }
    
    public Consulta alterarConsulta(String data, String horario, String tipoConsulta, Paciente paciente, Medico medico) {
        consulta = new Consulta(data, horario, tipoConsulta, paciente, medico);
        paciente.setConsulta(consulta);
        medico.adicionarConsulta(consulta);
        return consulta;
    }
    
}
