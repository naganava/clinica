/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import gerenciadorMensagens.GerenciadorDeMensagens;
import java.util.ArrayList;
import java.util.Iterator;
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

        Medico medico1 = new Medico("Dr Bonilha", "Avenida Brasil", "44-35427364", "clinicadrbonilha@pr.com");
        ArrayList<Medico> medicos = new ArrayList();
        medicos.add(medico1);
        Secretaria secretaria1 = new Secretaria();
        Paciente paciente1 = new Paciente();
        GerenciadorDeMensagens gerenciadorMensagem = new GerenciadorDeMensagens();

        Consulta consulta1 = new Consulta();
        Atestado atestado = new Atestado();
        Receita receita = new Receita();
        Relatorio relatorio = new Relatorio();
        relatorio.cadastroRelatorio("04/06/2018", "14:45");
        DeclaracaoAcompanhamento declaracao = new DeclaracaoAcompanhamento();
        
        RelatorioConsultas relatorioConsultas = new RelatorioConsultas();
        ArrayList<Consulta> consultas = new ArrayList();
        ArrayList<Paciente> pacientes = new ArrayList();
        
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
        String receitaMedica;
        String nomeAcompanhante;
        int diasAtestado;
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
        int opcao5 = -1;
        
        
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
                                System.out.println("Plano de Saúde: ");
                                planoSaude = leitor.next();
                                paciente1 = secretaria1.cadastrarPaciente(nomePaciente, enderecoPaciente, telefone, email, dataNascimento, planoSaude);
                                pacientes.add(paciente1);
                                break;
                            case 2:
                                int i = selecionaPaciente(pacientes);                                
                                paciente1 = pacientes.get(i);
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
                                System.out.println("Plano de Saúde: ");
                                planoSaude = leitor.next();
                                paciente1 = secretaria1.alterarPaciente(paciente1,nomePaciente, enderecoPaciente, telefone, email, dataNascimento, planoSaude);
                                pacientes.set(i, paciente1);
                                System.out.println("Cliente alterado");
                                break;
                            case 3:
                                i = selecionaPaciente(pacientes); 
                                pacientes.remove(i);
                                System.out.println("Paciente excluido");
                                break;
                            case 4:
                                System.out.println("Data da consulta: ");
                                dataConsulta = leitor.next();
                                System.out.println("Horario da consulta: ");
                                horarioConsulta = leitor.next();
                                System.out.println("Tipo da consulta: ");
                                tipoConsulta = leitor.next(); 
                                i = selecionaPaciente(pacientes);
                                paciente1 = pacientes.get(i);
                                System.out.println("Selecione um médico");
                                for (Iterator iterator = medicos.iterator(); iterator.hasNext(); i++) {
                                    medico1 = (Medico) iterator.next();
                                    System.out.println(i+". " +medico1.getNome());
                                }
                                i = leitor.nextInt();
                                medico1 = medicos.get(i);
                                consulta1 = secretaria1.cadastrarConsulta(dataConsulta,horarioConsulta,tipoConsulta, paciente1, medico1);
                                consultas.add(consulta1);
                                System.out.println("Consulta adicionada");
                                break;
                            case 5:
                                System.out.println("Data da consulta: ");
                                dataConsulta = leitor.next();
                                System.out.println("Horario da consulta: ");
                                horarioConsulta = leitor.next();
                                System.out.println("Tipo da consulta: ");
                                tipoConsulta = leitor.next();
                                i = selecionaPaciente(pacientes);
                                paciente1 = pacientes.get(i);
                                System.out.println("Selecione um médico");
                                for (Iterator iterator = medicos.iterator(); iterator.hasNext(); i++) {
                                    medico1 = (Medico) iterator.next();
                                    System.out.println(i+". " +medico1.getNome());
                                }
                                i = leitor.nextInt();
                                medico1 = medicos.get(i);
                                consulta1 = secretaria1.alterarConsulta(dataConsulta,horarioConsulta,tipoConsulta, paciente1, medico1);
                                consultas.set(i, consulta1);
                                System.out.println("Consulta alterada");
                                break;
                            case 6:
                                i = 0;
                                System.out.println("Selecione uma consulta");
                                for (Iterator iterator = consultas.iterator(); iterator.hasNext(); i++) {
                                    consulta1 = (Consulta) iterator.next();
                                    System.out.println(i+". " +consulta1.getData()+" - "+consulta1.getHorario()+ " - "+ consulta1.getPaciente().getNome());
                                }
                                i = leitor.nextInt(); 
                                consultas.remove(i);
                                System.out.println("Consulta excluida");
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
                                int i = selecionaPaciente(pacientes);
                                paciente1 = pacientes.get(i);
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

                                paciente1 = medico1.cadastrarDadosComplementares(paciente1, fuma, bebe, colesterol, diabete, doencaCardiaca, cirurgia, alergias);
                                pacientes.set(i, paciente1);
                                break;                             
                            case 2:
                                i = selecionaPaciente(pacientes);
                                paciente1 = pacientes.get(i);
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
                                
                                //Fazer um loop para preencher esses dados;
                                cirurgia = new ArrayList();

                                alergias = new ArrayList();

                                paciente1 = medico1.alterarDadosComplementares(paciente1, fuma, bebe, colesterol, diabete, doencaCardiaca, cirurgia, alergias);
                                pacientes.set(i, paciente1);
                                break;
                            case 3:
                                i = selecionaPaciente(pacientes);
                                paciente1 = medico1.excluirDadosComplementares(paciente1);
                                pacientes.set(i, paciente1);
                                break;
                            case 4:
                                medico1.cadastrarProntuario(prontuario, paciente1, sintomas, "Gripe", "Benegripe");
                                break;
                            case 5:
                                medico1.atualizarProntuario(prontuario, paciente1, sintomas, "Gripe", "Benegripe");
                                break;
                            case 6:
                                medico1.removerProntuario(prontuario, paciente1);
                                break;
                            case 7:
                                while(opcao5 != 0){
                                    System.out.println("*****RELATÓRIOS MÉDICOS*****");
                                    System.out.println("1. Receita");
                                    System.out.println("2. Atestado");
                                    System.out.println("3. Declaração de acompanhamento");
                                    System.out.println("4. Clientes atendidos no mês");
                                    System.out.println("0. Voltar");
                                    opcao5 = leitor.nextInt();
                                    
                                    switch (opcao5) {
                                        case 1:
                                            System.out.println("Escreva a receita médica: ");
                                            receitaMedica = leitor.next();
                                            receita.receitaMedica(paciente1, receitaMedica);
                                            System.out.println(receita.gerarRelatorio());
                                            break;
                                        case 2:
                                            System.out.println("Dias de atestado: ");
                                            diasAtestado = leitor.nextInt();
                                            atestado.setMedico(medico1);
                                            atestado.atestadoMedico(paciente1, 3);
                                            System.out.println(atestado.gerarRelatorio());
                                            break;
                                        case 3:
                                            System.out.println("Nome do acompanhante: ");
                                            nomeAcompanhante = leitor.next();
                                            declaracao.declaracaoAcompanhante(paciente1);
                                            declaracao.setMedico(medico1);
                                            System.out.println(declaracao.gerarRelatorio(nomeAcompanhante));
                                            break;
                                        case 4:
                                            System.out.println(clientesAtendidos.gerarRelatorio(consultas));
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
    }
    
    public static int selecionaPaciente(ArrayList<Paciente> pacientes){
    System.out.println("Selecione um paciente");
    int i = 0;
    Scanner leitor = new Scanner(System.in);
    Paciente paciente = new Paciente();
    
    for (Iterator iterator = pacientes.iterator(); iterator.hasNext(); i++) {
        paciente = (Paciente) iterator.next();
        System.out.println(i+". " +paciente.getNome());
    }
    return leitor.nextInt();
}

}


