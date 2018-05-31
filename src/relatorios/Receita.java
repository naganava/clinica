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


    public String gerarRelatorio() {
        return "Eu, " + super.medico.getNome() + " declaro que o(a) paciente " + paciente.getNome()
                + " obtém os medicamentos " + this.receita + " desta receita médica.";
    }

}
