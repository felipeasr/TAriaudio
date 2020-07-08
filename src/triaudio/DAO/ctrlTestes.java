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
public class ctrlTestes {
    public int salvarteste(usuarios_Pacientes pPacientes){
        return  new DAOtestes().salvarTESTE(pPacientes);
    }
public usuarios_Pacientes getCtrl(int CPF){
        return new DAOpaciente().getPaciente(CPF);
    }
}
