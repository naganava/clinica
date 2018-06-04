package relatorios;

/**
 *
 * @author Rafael
 */
public class Relatorio {

    protected String dataRelatorio;
    protected String horaRelatorio;
    
    public Relatorio(){     
    }
    
    public void cadastroRelatorio(String dataRelatorio, String horaRelatorio) {
        this.dataRelatorio = dataRelatorio;
        this.horaRelatorio = horaRelatorio;
    }

    public String gerarRelatorio() {
        return "Data da consulta: " + this.dataRelatorio + ". Hora do Relatório: " + this.horaRelatorio + ".";
    }
}
