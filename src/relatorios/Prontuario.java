/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relatorios;

import java.util.ArrayList;

/**
 *
 * @author teclaserti
 */
public class Prontuario {
    private ArrayList<String> sintomas;
    private String diagnostico;
    private String prescricao;
    
    public Prontuario(){
        
    }
    
    public Prontuario(ArrayList<String> sintomas, String diagnostico, String prescricao){
        this.diagnostico = diagnostico;
        this.prescricao = prescricao;
        this.sintomas = sintomas;
    }
    
    public void atualizarProntuario(ArrayList<String> sintomas, String diagnostico, String prescricao){
        this.diagnostico = diagnostico;
        this.prescricao = prescricao;
        this.sintomas = sintomas;
    }
    
    public void removerProntuario(){
        this.diagnostico = " ";
        this.prescricao = " ";
        this.sintomas = new ArrayList();
    }
   
    
}
