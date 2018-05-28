package pessoas;

import java.util.ArrayList;
import relatorios.Prontuario;

public class PacienteComplementar extends Paciente {
    private boolean fuma;
    private boolean bebe;
    private boolean colesterol;
    private boolean diabete;
    private boolean doencaCardiaca;
    private ArrayList cirurgia;
    private ArrayList alergias;
    private Prontuario prontuario;
    private Paciente paciente;
    
    protected void cadastrarPaciente(boolean fuma, boolean bebe, boolean colesterol, boolean diabete,
            boolean doencaCardiaca, ArrayList<String> cirurgia, ArrayList<String> alergias, Paciente paciente){
        this.alergias = alergias;
        this.bebe = bebe;
        this.cirurgia = cirurgia;
        this.colesterol = colesterol;
        this.diabete = diabete;
        this.doencaCardiaca = doencaCardiaca;
        this.fuma = fuma;
        this.paciente = paciente;
    }
}
