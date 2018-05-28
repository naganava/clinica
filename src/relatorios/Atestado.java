package relatorios;

import pessoas.Medico;
import pessoas.Paciente;

/**
 *
 * @author Rafael
 */
public class Atestado extends RelatorioMedico{

 private Paciente paciente;
 private int diasAtestado;
 
 @Override
 public String gerarRelatorio(){
     return "Eu, "+super.medico.getNome()+ " declaro que o paciente, "+ paciente.getNome()+
             " tem direito a "+this.diasAtestado + "dias de atestado";
 }
 
 public Atestado(){
     
 }
 
 public Atestado(Paciente paciente,int diasAtestado){
     super();
     this.diasAtestado = diasAtestado;
     this.paciente = paciente;
 }

    public void setMedico(Medico medico) {
        super.medico = medico; 
    }
 
 
}
