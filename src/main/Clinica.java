/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import java.util.Scanner;
import pessoas.Medico;
import pessoas.Paciente;
import pessoas.Secretaria;
import relatorios.Atestado;
import relatorios.ClientesAtendidos;
import relatorios.Consulta;
import relatorios.Receita;


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
        Atestado atestado = new Atestado();
        Receita receita = new Receita();
        ClientesAtendidos clientesAtendidos = new ClientesAtendidos();
        
        medico1.cadastroMedico("Dr Bonilha", "Avenida Brasil", "44-35427364", "clinicadrbonilha@pr.com");        
        paciente1.cadastrarPaciente("Felipe", "Rua dos bobos", "99-99999999", "felipebobo@email.com", "01/01/90", "UNIMED");        
        consulta1.cadastrarConsulta("31/05/2018", "16:37", paciente1, medico1, "Retorno");
        receita.receitaMedica(paciente1, "Cataflan e Dorflex");
        atestado.atestadoMedico(paciente1, 3);//Quantos dias o paciente1 terá de atestado.
        atestado.setMedico(medico1);
        
        
        System.out.println(atestado.gerarRelatorio());
        System.out.println(receita.gerarRelatorio());
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
