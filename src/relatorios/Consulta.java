/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relatorios;

/**
 *
 * @author teclaserti
 */
public class Consulta {
    private String data;
    private String horario;
    private Paciente paciente;
    private Medico medico;
    private char tipoConsulta;
    
    public Consulta(){
        
    }
    
    private void cadastrarConsulta(String data, String horario, Paciente paciente, Medico medico, char tipoConsulta){
        this.data = data;
        this.horario = horario;
        this.tipoConsulta = tipoConsulta;
        this.paciente = paciente;
        this.medico = medico;
    }
}
