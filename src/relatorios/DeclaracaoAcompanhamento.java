package relatorios;

import pessoas.Medico;
import pessoas.Paciente;

/**
 *
 * @author Rafael
 */
public class DeclaracaoAcompanhamento extends RelatorioMedico {

    private Paciente paciente;
    
    public DeclaracaoAcompanhamento(){
        
    }
    public void declaracaoAcompanhante(Paciente paciente){
        super.medico = medico;
        this.paciente = paciente;
    }
    public void setMedico(Medico medico) {
        super.medico = medico;
    }

    @Override
    public String gerarRelatorio() {
        return "Eu, " + super.medico.getNome() + " declaro que o(a) " + paciente.getNome() 
                + " paciente está acompanhado. ";
    }

}
