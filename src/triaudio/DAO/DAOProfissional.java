/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triaudio.DAO;

import triaudio.conectar.Conectar;
import triaudio.users.usuarios;

/**
 *
 * @author felip
 */
public class DAOProfissional {
     public int salvarDAO(usuarios pPessoa) {

        Conectar conexao = new Conectar();

        try {

            conexao.conectar();

          String sql
                    = "INSERT INTO cadastroprofissional (nomeP, Clinica,cpf,sexo,especialidade,dataNas,email,telefone,cep,cidade,rua,bairro,estado) VALUES ("
                    
                    + "'" + pPessoa.getNomeP()+ "',"
                    + "'" + pPessoa.getHospitalClinica() + "',"
                    + "'" + pPessoa.getCpfP() + "',"
                    + "'" + pPessoa.getSexo() + "',"
                    + "'" + pPessoa.getEspecialidadeP() + "',"
                    + "'" + pPessoa.getDataNasCP()+ "',"
                    + "'" + pPessoa.getEmailP() + "',"
                    + "'" + pPessoa.getTelefoneP() + "',"
                    + "'" + pPessoa.getTCEP() + "',"
                    + "'" + pPessoa.getCidade() + "',"
                    + "'" + pPessoa.getRua() + "',"
                    + "'" + pPessoa.getBairro() + "',"
                    + "'" + pPessoa.getEstado() + "'"
                    + ");";    
          
                   return conexao.insertSQL(sql);

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            conexao.fecharConexao();
        }
    }
}
