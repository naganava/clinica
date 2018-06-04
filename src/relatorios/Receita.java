package relatorios;

import pessoas.Medico;
import pessoas.Paciente;

/**
 *
 * @author Rafael
 */
public class Receita extends RelatorioMedico {

    protected Paciente paciente;
    protected String receita;

    public Receita() {

    }

    public void receitaMedica(Paciente paciente, String receita) {
        super.medico = medico;
        this.paciente = paciente;
        this.receita = receita;
        
    }

    public void setMedico(Medico medico) {
        super.medico = medico;
    }
    
    public String getReceita() {
        return receita;
    }

    public String gerarRelatorio() {
        return "Receita médica: "+ this.receita +".";
    }

}
