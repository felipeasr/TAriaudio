/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triaudio.DAO;

import triaudio.users.usuarios;
import triaudio.DAO.DAOProfissional;

/**
 *
 * @author felip
 */
public class ctrlProfissional {
    public int salvarCtrl(usuarios pPessoa){
        return new DAOProfissional().salvarDAO(pPessoa);
    }
}
