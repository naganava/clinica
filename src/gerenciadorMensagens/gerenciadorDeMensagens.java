/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadorMensagens;

import pessoas.Paciente;

/**
 *
 * @author teclaserti
 */
public class gerenciadorDeMensagens {
    private final Paciente paciente;
    
    public gerenciadorDeMensagens(Paciente paciente){
        this.paciente = paciente;
    }
    
    public String enviarEmail(){
        return "Email enviado para o paciente "+ paciente.getNome();
    }
    
    public String enviarSMS(){
        return "SMS enviado para o paciente "+ paciente.getNome();
    }
}
