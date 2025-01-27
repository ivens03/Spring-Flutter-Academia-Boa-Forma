package academia.SpringBoaForma.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

//private String servicoEscolhido; < Diaria e mensal >
//private String tipoPagamento; < Dinheiro, Pix, Debito e Credito >
//private String qualObjetivo = < Força, correção, hipertrofica, emagrecer, bundão, piroca >

/*
    Força
*/

@Entity
@Table(name = "tb_alunos")
public class alunoModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idAluno;
    public  String nomeAluno;
    private Date dataNascimento;
    private Date dataRegistroSistema;
    private String numeroTelefonicoAluno;
    private String numeroEnergenciaAluno;
    private String rua;
    private String cpf;
    public Boolean doenca;
    private String descricaoDoenca;

    public Boolean getAcessoAlunoSistema() {
        return acessoAlunoSistema;
    }

    public void setAcessoAlunoSistema(Boolean acessoAlunoSistema) {
        this.acessoAlunoSistema = acessoAlunoSistema;
    }

    public Float getValorPago() {
        return valorPago;
    }

    public void setValorPago(Float valorPago) {
        this.valorPago = valorPago;
    }

    public Date getValidadeDaMensalidade() {
        return validadeDaMensalidade;
    }

    public void setValidadeDaMensalidade(Date validadeDaMensalidade) {
        this.validadeDaMensalidade = validadeDaMensalidade;
    }

    public Date getValidadeMensalidadePeloDiaPago() {
        return ValidadeMensalidadePeloDiaPago;
    }

    public void setValidadeMensalidadePeloDiaPago(Date validadeMensalidadePeloDiaPago) {
        ValidadeMensalidadePeloDiaPago = validadeMensalidadePeloDiaPago;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getSenhaAluno() {
        return senhaAluno;
    }

    public void setSenhaAluno(String senhaAluno) {
        this.senhaAluno = senhaAluno;
    }

    public String getDescricaoDoenca() {
        return descricaoDoenca;
    }

    public void setDescricaoDoenca(String descricaoDoenca) {
        this.descricaoDoenca = descricaoDoenca;
    }

    public Boolean getDoenca() {
        return doenca;
    }

    public void setDoenca(Boolean doenca) {
        this.doenca = doenca;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumeroEnergenciaAluno() {
        return numeroEnergenciaAluno;
    }

    public void setNumeroEnergenciaAluno(String numeroEnergenciaAluno) {
        this.numeroEnergenciaAluno = numeroEnergenciaAluno;
    }

    public String getNumeroTelefonicoAluno() {
        return numeroTelefonicoAluno;
    }

    public void setNumeroTelefonicoAluno(String numeroTelefonicoAluno) {
        this.numeroTelefonicoAluno = numeroTelefonicoAluno;
    }

    public Date getDataRegistroSistema() {
        return dataRegistroSistema;
    }

    public void setDataRegistroSistema(Date dataRegistroSistema) {
        this.dataRegistroSistema = dataRegistroSistema;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public Long getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Long idAluno) {
        this.idAluno = idAluno;
    }

    private String senhaAluno;
    public Date dataPagamento;
    public Date ValidadeMensalidadePeloDiaPago;
    private Date validadeDaMensalidade;
    public Float valorPago;
    public Boolean acessoAlunoSistema;
}
