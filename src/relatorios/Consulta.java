package relatorios;

import pessoas.Medico;
import pessoas.Paciente;

/**
 *
 * @author teclaserti
 */
public class Consulta {
    private String data;
    private String horario;
    private Paciente paciente;
    private Medico medico;
    private String tipoConsulta;
    
    public Consulta(){
    }
  
    public void cadastrarConsulta(String data, String horario, Paciente paciente, Medico medico, String tipoConsulta){
        this.data = data;
        this.horario = horario;
        this.tipoConsulta = tipoConsulta;
        this.paciente = paciente;
        this.medico = medico;
    }

    
}
