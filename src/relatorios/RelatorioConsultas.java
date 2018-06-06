package relatorios;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Rafael
 */
public class RelatorioConsultas extends Relatorio {
    
    public String gerarRelatorio(String dataRelatorio,ArrayList<Consulta> consultas, boolean contato){
        String relatorio = "";
        for (Iterator iterator = consultas.iterator(); iterator.hasNext(); ) {
            Consulta consulta = (Consulta) iterator.next();
            if (consulta.getData() == dataRelatorio){
                relatorio += consulta.getMedico().getNome()+" tem consulta marcada com "+consulta.getPaciente().getNome()+
                        " as "+consulta.getHorario() +" de "+ consulta.getData()+ System.getProperty("line.separator");
            }
        }
        return relatorio;
    }
    
    
}
