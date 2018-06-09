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
    private String tipoConsulta;
    private String tempoConsulta;
    private Paciente paciente;
    private Medico medico;
    
    public Consulta(){
    }
  
    public Consulta(String data, String horario, String tipoConsulta,Paciente paciente, Medico medico){
        this.data = data;
        this.horario = horario;
        this.tipoConsulta = tipoConsulta;
        this.paciente = paciente;
        this.medico = medico;
        if("Retorno".equals(tipoConsulta)){
            tempoConsulta = "00:30";
        }else{
            tempoConsulta = "01:00";
        }
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
