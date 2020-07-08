/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triaudio.users;

/**
 *
 * @author felip
 */
public class usuarios {

    //
     private String cpfP;
     private String nomeP;
     private String HospitalClinica;	
     private String especialidadeP;
     private String dataNasCP;
     private String emailP;
     private String telefoneP;
     private String TCEP;
     private String cidade;
     private String rua;
     private String bairro;
     private String estado;
     private String sexo;


   
    public usuarios(String cpfP, String nomeP,String HospitalClinica) {
        this.cpfP = cpfP;
        this.nomeP = nomeP;
        this.HospitalClinica = HospitalClinica;
    }

    public usuarios(String cpfP, String nomeP, String HospitalClinica, String especialidadeP, String dataNasCP, String emailP, String telefoneP, String TCEP, String cidade, String rua, String bairro, String estado, String sexo) {
        this.cpfP = cpfP;
        this.nomeP = nomeP;
        this.HospitalClinica = HospitalClinica;
        this.especialidadeP = especialidadeP;
        this.dataNasCP = dataNasCP;
        this.emailP = emailP;
        this.telefoneP = telefoneP;
        this.TCEP = TCEP;
        this.cidade = cidade;
        this.rua = rua;
        this.bairro = bairro;
        this.estado = estado;
        this.sexo = sexo;
        
    }

    public String getEspecialidadeP() {
        return especialidadeP;
    }

    public void setEspecialidadeP(String especialidadeP) {
        this.especialidadeP = especialidadeP;
    }

    public String getDataNasCP() {
        return dataNasCP;
    }

    public void setDataNasCP(String dataNasCP) {
        this.dataNasCP = dataNasCP;
    }

    public String getEmailP() {
        return emailP;
    }

    public void setEmailP(String emailP) {
        this.emailP = emailP;
    }

    public String getTelefoneP() {
        return telefoneP;
    }

    public void setTelefoneP(String telefoneP) {
        this.telefoneP = telefoneP;
    }

    public String getTCEP() {
        return TCEP;
    }

    public void setTCEP(String TCEP) {
        this.TCEP = TCEP;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getHospitalClinica() {
        return HospitalClinica;
    }

    public void setHospitalClinica(String HospitalClinica) {
        this.HospitalClinica = HospitalClinica;
    }
   
    public usuarios(){};

    public String getCpfP() {
        return cpfP;
    }

    public void setCpfP(String cpfP) {
        this.cpfP = cpfP;
    }

    public String getNomeP() {
        return nomeP;
    }

    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }
    
    
}
