/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triaudio.DAO;

import triaudio.users.usuarios_Pacientes;

/**
 *
 * @author felip
 */
public class ctrlPaciente {
    public int salvarCtrl(usuarios_Pacientes pPaciente){
        return new DAOpaciente().salvarDAO(pPaciente);
    
    }
  
}
