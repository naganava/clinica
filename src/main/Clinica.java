/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import java.util.ArrayList;
import java.util.Scanner;
import pessoas.Medico;
import pessoas.Paciente;
import pessoas.Secretaria;
import relatorios.Atestado;
import relatorios.ClientesAtendidos;
import relatorios.Consulta;
import relatorios.Receita;
import relatorios.Relatorio;
import relatorios.DeclaracaoAcompanhamento;
import relatorios.RelatorioConsultas;

/**
 *
 * @author teclaserti
 */
public class Clinica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Medico medico1 = new Medico();
        Secretaria secretaria1 = new Secretaria();
        Paciente paciente1 = new Paciente();

        Consulta consulta1 = new Consulta();
        Consulta consulta2 = new Consulta();
        Atestado atestado = new Atestado();
        Receita receita = new Receita();
        Relatorio relatorio = new Relatorio();
        DeclaracaoAcompanhamento declaracao = new DeclaracaoAcompanhamento();
        
        RelatorioConsultas relatorioConsultas = new RelatorioConsultas();
        ArrayList<Consulta> consultas = new ArrayList();
        
        ClientesAtendidos clientesAtendidos = new ClientesAtendidos();
        
        
        //métodos de secretaria
        secretaria1.cadastrarPaciente(paciente1,"Felipe", "Rua dos bobos", "99-99999999", "felipebobo@email.com", "01/01/90", "UNIMED");        
        secretaria1.alterarPaciente(paciente1, "Felipe Naganava","","","","","");
        secretaria1.excluiPaciente(paciente1);
      
        secretaria1.cadastrarConsulta(consulta1,"31/05/2018", "16:37", paciente1, medico1, "Retorno");
        secretaria1.cadastrarConsulta(consulta2,"01/06/2018", "17:37", paciente1, medico1, "Retorno");
        
        //Adiciona as consultas no array de Consultas
        consultas.add(consulta1);
        consultas.add(consulta2);
        
        //Imprime relatório de consultas
        System.out.print(relatorioConsultas.gerarRelatorio("31/05/2018", consultas, true));
        
        
        medico1.cadastroMedico("Dr Bonilha", "Avenida Brasil", "44-35427364", "clinicadrbonilha@pr.com");        

        receita.receitaMedica(paciente1, "Cataflan e Dorflex");
        relatorio.cadastroRelatorio("04/06/2018", "14:45");
        declaracao.declaracaoAcompanhante(paciente1);
        declaracao.setMedico(medico1);
        atestado.atestadoMedico(paciente1, 3);//Quantos dias o paciente1 terá de atestado.
        atestado.setMedico(medico1);
        
        
        System.out.println(atestado.gerarRelatorio());
        System.out.println(receita.gerarRelatorio());
        System.out.println(relatorio.gerarRelatorio());
        System.out.println(declaracao.gerarRelatorio());
        System.out.println(clientesAtendidos.gerarRelatorio());
        /*
        System.out.println("Paciente fuma?: ");
        boolean fuma = leitor.nextBoolean();
        System.out.println("Paciente bebe?: ");
        boolean bebe = leitor.nextBoolean();
        System.out.println("Paciente tem colesterol?: ");
        boolean colesterol = leitor.nextBoolean();
        System.out.println("Paciente tem diabete?: ");
        boolean diabete = leitor.nextBoolean();
        System.out.println("Paciente tem doenças cardiacas?: ");
        boolean doencaCardiaca = leitor.nextBoolean();
        
        ArrayList<String> cirurgia = new ArrayList();
        
        ArrayList<String> alergias = new ArrayList();
        
        String aux = new String();
     
        medico.cadastrarDadosComplementares(fuma, bebe, colesterol, diabete, doencaCardiaca, cirurgia, alergias, paciente);
         */

    }

}
