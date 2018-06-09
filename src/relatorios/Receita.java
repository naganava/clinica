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

    public Receita(Paciente paciente, String receita) {
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
        return "Receita médica de "+this.paciente.getNome()+": "+ this.receita +".";
    }

}
