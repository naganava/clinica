package relatorios;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class ClientesAtendidos extends RelatorioMedico {

    private ArrayList<String> consulta;

    public ClientesAtendidos() {

    }

    public String gerarRelatorio() {
        return "Foram realizadas " + this.consulta + " consulta(s).";
    }


}
