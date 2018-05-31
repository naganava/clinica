package relatorios;

import pessoas.Paciente;

/**
 *
 * @author Rafael
 */
public class DeclaracaoAcompanhamento extends RelatorioMedico{
    
    private Paciente paciente;
    
    @Override
    public String gerarRelatorio(){
        return "Eu, " + super.medico.getNome() + " declaro que o(a) paciente " + paciente.getNome()
                + " está acompanhado. ";
    }
    
}
