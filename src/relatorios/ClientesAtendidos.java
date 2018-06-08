package relatorios;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class ClientesAtendidos extends RelatorioMedico {
    
    public ClientesAtendidos() {

    }

    public String gerarRelatorio(ArrayList<Consulta> consulta) {
        return "Foram realizadas " + consulta.size() + " consulta(s).";
    }


}
