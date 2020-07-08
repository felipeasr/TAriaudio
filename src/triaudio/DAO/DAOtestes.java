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
public class DAOtestes {
     public int salvarTESTE(usuarios_Pacientes pPaciente) {

        Conectar conexao = new Conectar();

        try {

            conexao.conectar();

          String sql
                    = "INSERT INTO ResultadoTestes (CPF_Responsavel,ResultadoTeste,RetesteEOAE,DescriçãoRetesteEOAE,RetestePEATE,Diagnostico,TerapiaFonodiologicaORL,RehabilitacaoImplanteCoclear,RehabilitaçãoAasi,IndicadordeRisco,SequimentoORL) VALUES ("
                    
                  
                 + "'" + pPaciente.getCpfTeste()+ "',"
                 + "'" + pPaciente.getTeste1() + "',"
                 + "'" + pPaciente.getRetesteEOAE()+ "',"
                 + "'" + pPaciente.getTexto()+ "',"
                 + "'" + pPaciente.getRetestePeate()+ "',"
                 + "'" + pPaciente.getDiagnostico()+ "',"
                 + "'" + pPaciente.getTerapiaFonodiologicaORL()+ "',"
                 + "'" + pPaciente.getRehabilitacaoImplateCoclear()+ "',"
                 + "'" + pPaciente.getRehabilitacaoAasi()+ "',"
                 + "'" + pPaciente.getIndicadordeRisco()+ "',"
                 + "'" + pPaciente.getSequimentoORl()+ "'"
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
//,RetesteEOAE,descriçãoRetesteEOAE,RetestePEATE,DiagnósticoOtorrinolaringológicoeOudiológico,DiagnosticoAudiologico,TerapiaFonodiologicaORL,RehabilitaçãoImplateCoclear,RehabilitaçãoAasi,DiagnosticoOtorrinolaringologico,IndicadordeRisco