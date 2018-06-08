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
public class GerenciadorDeMensagens {
    
    public String enviarEmail(Paciente paciente){
        return "Email enviado para o paciente "+ paciente.getNome();
    }
    
    public String enviarSMS(Paciente paciente){
        return "SMS enviado para o paciente "+ paciente.getNome();
    }
}
