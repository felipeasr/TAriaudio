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
public class usuarios_Pacientes {
    
     private String situacao;
     private String nomePaciente;
     private String nomeResponsavelP;	
     private String cpfResponsavelP;
     private String sexo;
     private String horaNas;
     private String TipoParto;
     private String TCEP;
     private String cidade;
     private String rua;
     private String bairro;
     private String estado;
     private String complementoEndereco;
     
     private String cpfTeste;
    public String getCpfTeste() {
        return cpfTeste;
    }

    public void setCpfTeste(String cpfTeste) {
        this.cpfTeste = cpfTeste;
    }
     private String Teste1;
     private String RetesteEOAE;
     private String RetestePeate;
     private String Diagnostico;
     private String texto;
     private String TerapiaFonodiologicaORL;
     private String RehabilitacaoImplateCoclear;
     private String RehabilitacaoAasi;
     private String IndicadordeRisco;
     private String SequimentoORl;
     

    public String getTeste1() {
        return Teste1;
    }

    public void setTeste1(String Teste1) {
        this.Teste1 = Teste1;
    }

    public String getRetesteEOAE() {
        return RetesteEOAE;
    }

    public void setRetesteEOAE(String RetesteEOAE) {
        this.RetesteEOAE = RetesteEOAE;
    }

    public String getRetestePeate() {
        return RetestePeate;
    }

    public void setRetestePeate(String RetestePeate) {
        this.RetestePeate = RetestePeate;
    }

    public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String Diagnostico) {
        this.Diagnostico = Diagnostico;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }


    public String getTerapiaFonodiologicaORL() {
        return TerapiaFonodiologicaORL;
    }

    public void setTerapiaFonodiologicaORL(String TerapiaFonodiologicaORL) {
        this.TerapiaFonodiologicaORL = TerapiaFonodiologicaORL;
    }

    public String getRehabilitacaoImplateCoclear() {
        return RehabilitacaoImplateCoclear;
    }

    public void setRehabilitacaoImplateCoclear(String RehabilitacaoImplateCoclear) {
        this.RehabilitacaoImplateCoclear = RehabilitacaoImplateCoclear;
    }

    public String getRehabilitacaoAasi() {
        return RehabilitacaoAasi;
    }

    public void setRehabilitacaoAasi(String RehabilitacaoAasi) {
        this.RehabilitacaoAasi = RehabilitacaoAasi;
    }


    public String getIndicadordeRisco() {
        return IndicadordeRisco;
    }

    public void setIndicadordeRisco(String IndicadordeRisco) {
        this.IndicadordeRisco = IndicadordeRisco;
    }

    public String getSequimentoORl() {
        return SequimentoORl;
    }

    public void setSequimentoORl(String SequimentoORl) {
        this.SequimentoORl = SequimentoORl;
    }
     
     
     

     

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   
     
     public usuarios_Pacientes(){}

    public usuarios_Pacientes(String situacao, String nomePaciente, String nomeResponsavelP, String cpfResponsavelP, String sexo, String horaNas, String ResultadoTeste, String TipoParto, String TCEP, String cidade, String rua, String bairro, String estado, String complementoEndereco) {
        this.situacao = situacao;
        this.nomePaciente = nomePaciente;
        this.nomeResponsavelP = nomeResponsavelP;
        this.cpfResponsavelP = cpfResponsavelP;
        this.sexo = sexo;
        this.horaNas = horaNas;
        this.TipoParto = TipoParto;
        this.TCEP = TCEP;
        this.cidade = cidade;
        this.rua = rua;
        this.bairro = bairro;
        this.estado = estado;
        this.complementoEndereco = complementoEndereco;
        
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getNomeResponsavelP() {
        return nomeResponsavelP;
    }

    public void setNomeResponsavelP(String nomeResponsavelP) {
        this.nomeResponsavelP = nomeResponsavelP;
    }

    public String getCpfResponsavelP() {
        return cpfResponsavelP;
    }

    public void setCpfResponsavelP(String cpfResponsavelP) {
        this.cpfResponsavelP = cpfResponsavelP;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getHoraNas() {
        return horaNas;
    }

    public void setHoraNas(String horaNas) {
        this.horaNas = horaNas;
    }


    public String getTipoParto() {
        return TipoParto;
    }

    public void setTipoParto(String TipoParto) {
        this.TipoParto = TipoParto;
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


    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }
     
}
