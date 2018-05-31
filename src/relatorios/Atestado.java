package relatorios;

import pessoas.Medico;
import pessoas.Paciente;

/**
 *
 * @author Rafael
 */
public class Atestado extends RelatorioMedico {

    private Paciente paciente;
    private int diasAtestado;

    public Atestado() {

    }

    public void atestadoMedico(Paciente paciente, int diasAtestado) {
        super.medico = medico;
        this.diasAtestado = diasAtestado;
        this.paciente = paciente;
    }

    public void setMedico(Medico medico) {
        super.medico = medico;
    }

    @Override
    public String gerarRelatorio() {
        return "Eu, " + super.medico.getNome() + " declaro que o(a) paciente " + paciente.getNome()
                + " tem direito a " + this.diasAtestado + " dia(s) de atestado.";
    }
}
