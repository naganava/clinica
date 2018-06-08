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
    private String tempoConsulta;
    
    public Consulta(){
    }
  
    public void cadastrarConsulta(String data, String horario, Paciente paciente, Medico medico, String tipoConsulta){
        this.data = data;
        this.horario = horario;
        this.tipoConsulta = tipoConsulta;
        this.paciente = paciente;
        this.medico = medico;
        if(tipoConsulta == "Retorno"){
            tempoConsulta = "00:30";
        }else{
            tempoConsulta = "01:00";
        }
    }
    
    public void alterarConsulta(String data, String horario, Paciente paciente, Medico medico, String tipoConsulta){
        this.data = data;
        this.horario = horario;
        this.tipoConsulta = tipoConsulta;
        this.paciente = paciente;
        this.medico = medico;
        if(tipoConsulta == "Retorno"){
            tempoConsulta = "00:30";
        }else{
            tempoConsulta = "01:00";
        }
    }
    
    public void excluirConsulta(){
        this.data = "";
        this.horario = "";
        this.tipoConsulta = "";
        this.paciente = new Paciente();
        this.medico = new Medico();
        this.tempoConsulta = "";
    }
    
    public String getData(){
        return this.data;
    }
    
    public String getHorario(){
        return this.horario;
    }
    
    public Paciente getPaciente(){
        return this.paciente;
    }
    
    public Medico getMedico(){
        return this.medico;
    }

    
}
