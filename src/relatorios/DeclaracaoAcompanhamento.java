package relatorios;

import pessoas.Medico;
import pessoas.Paciente;

/**
 *
 * @author Rafael
 */
public class DeclaracaoAcompanhamento extends RelatorioMedico {

    private Paciente paciente;
    private String acompanhante;
    
    public DeclaracaoAcompanhamento(){
        
    }
    public DeclaracaoAcompanhamento(Paciente paciente, String acompanhante, Medico medico){
        super.medico = medico;
        this.paciente = paciente;
        this.acompanhante = acompanhante;
    }
    public void setMedico(Medico medico) {
        super.medico = medico;
    }

    @Override
    public String gerarRelatorio() {
        return "Eu, " + super.medico.getNome() + " declaro que o(a) " + paciente.getNome() 
                + " paciente está acompanhado de " +this.acompanhante+". ";
    }

}
