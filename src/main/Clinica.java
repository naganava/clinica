/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import gerenciadorMensagens.GerenciadorDeMensagens;
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
import relatorios.Prontuario;
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
        medico1.cadastroMedico("Dr Bonilha", "Avenida Brasil", "44-35427364", "clinicadrbonilha@pr.com");
        Secretaria secretaria1 = new Secretaria();
        Paciente paciente1 = new Paciente();
        GerenciadorDeMensagens gerenciadorMensagem = new GerenciadorDeMensagens();

        Consulta consulta1 = new Consulta();
        Consulta consulta2 = new Consulta();
        Atestado atestado = new Atestado();
        Receita receita = new Receita();
        Relatorio relatorio = new Relatorio();
        DeclaracaoAcompanhamento declaracao = new DeclaracaoAcompanhamento();
        
        RelatorioConsultas relatorioConsultas = new RelatorioConsultas();
        ArrayList<Consulta> consultas = new ArrayList();
        
        ClientesAtendidos clientesAtendidos = new ClientesAtendidos();   
        
        String nomePaciente;
        String enderecoPaciente;
        String email;
        String telefone;
        String planoSaude;
        String dataNascimento;
        String dataConsulta;
        String horarioConsulta;
        String tipoConsulta;
        boolean fuma = false;
        boolean bebe = false;
        boolean colesterol = false;
        boolean diabete = false;
        boolean doencaCardiaca = false;

        ArrayList<String> cirurgia = new ArrayList();
        ArrayList<String> alergias = new ArrayList();
        ArrayList<String> sintomas = new ArrayList();
        
        Prontuario prontuario = new Prontuario();
                                
        int opcao = -1;
        int opcao2 = -1;
        int opcao3 = -1;
        int opcao4 = -1;
        
        
        while(opcao != 0){
            System.out.println("*****MENU*****");
            System.out.println("1. Secretária");
            System.out.println("2. Médico");
            System.out.println("3. Gerenciador de Mensagem");
            System.out.println("0. Sair");
            opcao = leitor.nextInt();
            
            switch (opcao) {
                case 1:
                    while(opcao2 != 0){
                        System.out.println("*****MENU SECRETARIA*****");
                        System.out.println("1. Cadastrar cliente");
                        System.out.println("2. Alterar cliente");
                        System.out.println("3. Deletar cliente");
                        System.out.println("4. Cadastrar consulta");
                        System.out.println("5. Alterar consulta");
                        System.out.println("6. Cancelar consulta");
                        System.out.println("7. Relatório de consultas");
                        System.out.println("0. Voltar");
                        opcao2 = leitor.nextInt();
                        
                        switch (opcao2) {
                            case 1:
                                System.out.println("Nome do paciente: ");
                                nomePaciente = leitor.next();
                                System.out.println("Endereco do paciente: ");
                                enderecoPaciente = leitor.next();
                                System.out.println("Telefone: ");
                                telefone = leitor.next();
                                System.out.println("Email: ");
                                email = leitor.next();
                                System.out.println("Data de nascimento: ");
                                dataNascimento = leitor.next();
                                System.out.println("Data de nascimento: ");
                                planoSaude = leitor.next();
                                secretaria1.cadastrarPaciente(paciente1,nomePaciente, enderecoPaciente, telefone, email, dataNascimento, planoSaude);        
                                break;
                            case 2:
                                System.out.println("Nome do paciente: ");
                                nomePaciente = leitor.next();
                                System.out.println("Endereco do paciente: ");
                                enderecoPaciente = leitor.next();
                                System.out.println("Telefone: ");
                                telefone = leitor.next();
                                System.out.println("Email: ");
                                email = leitor.next();
                                System.out.println("Data de nascimento: ");
                                dataNascimento = leitor.next();
                                System.out.println("Data de nascimento: ");
                                planoSaude = leitor.next();
                                secretaria1.alterarPaciente(paciente1,nomePaciente, enderecoPaciente, telefone, email, dataNascimento, planoSaude);
                                break;
                            case 3:
                                secretaria1.excluiPaciente(paciente1);
                                break;
                            case 4:
                                System.out.println("Data da consulta: ");
                                dataConsulta = leitor.next();
                                System.out.println("Horario da consulta: ");
                                horarioConsulta = leitor.next();
                                System.out.println("Tipo da consulta: ");
                                //teria que escolher o médico e o paciente, mas isso fica pra depois
                                tipoConsulta = leitor.next();
                                secretaria1.cadastrarConsulta(consulta1,dataConsulta,horarioConsulta, paciente1, medico1,tipoConsulta);
                                consultas.add(consulta1);
                                break;
                            case 5:
                                System.out.println("Data da consulta: ");
                                dataConsulta = leitor.next();
                                System.out.println("Horario da consulta: ");
                                horarioConsulta = leitor.next();
                                System.out.println("Tipo da consulta: ");
                                //teria que escolher o médico e o paciente, mas isso fica pra depois
                                tipoConsulta = leitor.next();
                                secretaria1.alterarConsulta(consulta1,dataConsulta,horarioConsulta, paciente1, medico1,tipoConsulta);
                                break;
                            case 6:
                                secretaria1.excluirConsulta(consulta1);
                                break;
                            case 7:
                                System.out.println("Data da consulta: ");
                                dataConsulta = leitor.next();
                                System.out.print(relatorioConsultas.gerarRelatorio(dataConsulta, consultas, true));
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opção inválida");
                                break;
                        }
                    }
                    break;
                case 2:
                    while(opcao3 != 0){
                        System.out.println("*****MENU MÉDICO*****");
                        System.out.println("1. Cadastrar dados adicionais cliente");
                        System.out.println("2. Alterar dados adicionais cliente");
                        System.out.println("3. Deletar dados adicionais cliente");
                        System.out.println("4. Cadastrar prontuario");
                        System.out.println("5. Alterar prontuario");
                        System.out.println("6. Excluir prontuario");
                        System.out.println("7. Gerar relatórios médicos");
                        System.out.println("0. Voltar");
                        opcao3 = leitor.nextInt();
                        
                        switch (opcao3) {
                            case 1:
                                System.out.println("Paciente fuma?: ");
                                fuma = leitor.nextBoolean();
                                System.out.println("Paciente bebe?: ");
                                bebe = leitor.nextBoolean();
                                System.out.println("Paciente tem colesterol?: ");
                                colesterol = leitor.nextBoolean();
                                System.out.println("Paciente tem diabete?: ");
                                diabete = leitor.nextBoolean();
                                System.out.println("Paciente tem doenças cardiacas?: ");
                                doencaCardiaca = leitor.nextBoolean();

                                cirurgia = new ArrayList();
                                
                                alergias = new ArrayList();

                                medico1.cadastrarDadosComplementares(paciente1, fuma, bebe, colesterol, diabete, doencaCardiaca, cirurgia, alergias);
                                break;                             
                            case 2:
                                System.out.println("Paciente fuma?: ");
                                fuma = leitor.nextBoolean();
                                System.out.println("Paciente bebe?: ");
                                bebe = leitor.nextBoolean();
                                System.out.println("Paciente tem colesterol?: ");
                                colesterol = leitor.nextBoolean();
                                System.out.println("Paciente tem diabete?: ");
                                diabete = leitor.nextBoolean();
                                System.out.println("Paciente tem doenças cardiacas?: ");
                                doencaCardiaca = leitor.nextBoolean();

                                cirurgia = new ArrayList();

                                alergias = new ArrayList();

                                medico1.cadastrarDadosComplementares(paciente1, fuma, bebe, colesterol, diabete, doencaCardiaca, cirurgia, alergias);
                                break;
                            case 3:
                                medico1.excluirDadosComplementares(paciente1);
                                break;
                            case 4:
                                medico1.cadastrarProntuario(prontuario, paciente1, sintomas, "Gripe", "Benegripe");
                                break;
                            case 5:
                                medico1.atualizarProntuario(prontuario, paciente1, sintomas, "Gripe", "Benegripe");
                                break;
                            case 6:
                                medico1.removerProntuario(prontuario, paciente1, sintomas, "Gripe", "Benegripe");
                                break;
                            case 7:
                                
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opção inválida");
                                break;
                        }
                    }
                    break;
                case 3:
                    while(opcao4 != 0){
                        System.out.println("*****MENU GERENCIADOR DE MENSAGEM*****");
                        System.out.println("1. Enviar email");
                        System.out.println("2. Enviar SMS");
                        System.out.println("0. Voltar");
                        opcao4 = leitor.nextInt();
                    
                        switch (opcao4) {
                            case 1:
                                System.out.println(gerenciadorMensagem.enviarEmail(paciente1));
                                break;
                            case 2:
                                System.out.println(gerenciadorMensagem.enviarSMS(paciente1));
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opção inválida");
                                break;
                        }
                    }
                    break;
                case 0:
                    break;                
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        
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
        
         */

    }

}
