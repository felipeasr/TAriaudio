/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triaudio.DAO;

import triaudio.conectar.Conectar;
import triaudio.users.usuarios_Pacientes;

/**
 *
 * @author felip
 */
public class DAOpaciente {
      public int salvarDAO(usuarios_Pacientes pPaciente) {

        Conectar conexao = new Conectar();

        try {

            conexao.conectar();

          String sql
                    = "INSERT INTO cadastroPaciente (situacao,Nome,NomeResponsavel,CpfResponsavel,sexo,horasNascimentos,TipoParto,TCEP,cidade,rua,bairro,estado,complementoEndereco) VALUES ("
                    
                    + "'"+  pPaciente.getSituacao()+ "',"
                    + "'" + pPaciente.getNomePaciente() + "',"
                    + "'" + pPaciente.getNomeResponsavelP() + "',"
                    + "'" + pPaciente.getCpfResponsavelP() + "',"
                    + "'" + pPaciente.getSexo() + "',"
                    + "'" + pPaciente.getHoraNas()+ "',"
                    + "'" + pPaciente.getTipoParto() + "',"
                    + "'" + pPaciente.getTCEP() + "',"
                    + "'" + pPaciente.getCidade() + "',"
                    + "'" + pPaciente.getRua() + "',"
                    + "'" + pPaciente.getBairro() + "',"
                    + "'" + pPaciente.getEstado()+ "',"
                    + "'" + pPaciente.getComplementoEndereco()+ "'"
                    //+ "'" + pPaciente.getTeste1()+ "'"
                    + ");";    
          
                   return conexao.insertSQL(sql);

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            conexao.fecharConexao();
        }
    }
  public usuarios_Pacientes getPaciente (int CPF){
    usuarios_Pacientes paciente = new usuarios_Pacientes();
    Conectar conexao = new Conectar();
 
    try {

            conexao.conectar();

            String sql
                    = "SELECT Nome FROM cadastroPaciente WHERE codigo = '" + CPF + "'"
                    + ";";
            
            conexao.executarSQL(sql);

            while (conexao.getResultSet().next()) {
                
                paciente.setNomePaciente(conexao.getResultSet().getString("Nome"));
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
        }

        return paciente;

   
}
}