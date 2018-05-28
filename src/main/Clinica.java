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
import relatorios.RelatorioMedico;

/**
 *
 * @author teclaserti
 */
public class Clinica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Medico medico = new Medico();
        Secretaria secretaria = new Secretaria();
        Paciente paciente = new Paciente();
        
        paciente.CadastrarPaciente("Felipe", "rua dos bobo", "999999999", "email@email", "01/01/90", "UNIMED");
        Scanner leitor = new Scanner(System.in);
        
        
        Atestado atestado = new Atestado(paciente, 1);
        atestado.setMedico(medico);
        System.out.println(atestado.gerarRelatorio());
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
