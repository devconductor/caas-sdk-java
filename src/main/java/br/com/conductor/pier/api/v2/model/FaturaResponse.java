package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Fatura futura
 **/

@ApiModel(description = "Fatura futura")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class FaturaResponse   {
  
  private Long idConta = null;


  public enum SituacaoProcessamentoEnum {
    ABERTA("ABERTA"),
    FECHADA("FECHADA"),
    TODAS("TODAS");

    private String value;

    SituacaoProcessamentoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private SituacaoProcessamentoEnum situacaoProcessamento = null;
  private Boolean pagamentoEfetuado = null;
  private String dataVencimentoFatura = null;
  private String dataVencimentoReal = null;
  private String dataFechamento = null;
  private BigDecimal valorTotal = null;
  private BigDecimal valorPagamentoMinimo = null;
  private BigDecimal saldoAnterior = null;
  private Long idBoleto = null;
  private Boolean flagEmiteExtrato = null;
  private String linhaDigitavel = null;
  private BigDecimal cetMensal = null;
  private BigDecimal cetAnual = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta
   **/
  public FaturaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Situa\u00E7\u00E3o de Processamento da fatura
   **/
  public FaturaResponse situacaoProcessamento(SituacaoProcessamentoEnum situacaoProcessamento) {
    this.situacaoProcessamento = situacaoProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Situa\u00E7\u00E3o de Processamento da fatura")
  @JsonProperty("situacaoProcessamento")
  public SituacaoProcessamentoEnum getSituacaoProcessamento() {
    return situacaoProcessamento;
  }
  public void setSituacaoProcessamento(SituacaoProcessamentoEnum situacaoProcessamento) {
    this.situacaoProcessamento = situacaoProcessamento;
  }

  
  /**
   * Status de pagamento efetuado
   **/
  public FaturaResponse pagamentoEfetuado(Boolean pagamentoEfetuado) {
    this.pagamentoEfetuado = pagamentoEfetuado;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Status de pagamento efetuado")
  @JsonProperty("pagamentoEfetuado")
  public Boolean getPagamentoEfetuado() {
    return pagamentoEfetuado;
  }
  public void setPagamentoEfetuado(Boolean pagamentoEfetuado) {
    this.pagamentoEfetuado = pagamentoEfetuado;
  }

  
  /**
   * Data de vencimento da fatura
   **/
  public FaturaResponse dataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "Data de vencimento da fatura")
  @JsonProperty("dataVencimentoFatura")
  public String getDataVencimentoFatura() {
    return dataVencimentoFatura;
  }
  public void setDataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
  }

  
  /**
   * Data de vencimento real da fatura
   **/
  public FaturaResponse dataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "Data de vencimento real da fatura")
  @JsonProperty("dataVencimentoReal")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * Data de fechamento da fatura
   **/
  public FaturaResponse dataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "Data de fechamento da fatura")
  @JsonProperty("dataFechamento")
  public String getDataFechamento() {
    return dataFechamento;
  }
  public void setDataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
  }

  
  /**
   * Valor total da fatura
   **/
  public FaturaResponse valorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total da fatura")
  @JsonProperty("valorTotal")
  public BigDecimal getValorTotal() {
    return valorTotal;
  }
  public void setValorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
  }

  
  /**
   * Valor do pagamento m\u00EDnimo
   **/
  public FaturaResponse valorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do pagamento m\u00EDnimo")
  @JsonProperty("valorPagamentoMinimo")
  public BigDecimal getValorPagamentoMinimo() {
    return valorPagamentoMinimo;
  }
  public void setValorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
  }

  
  /**
   * Valor do saldo anterior
   **/
  public FaturaResponse saldoAnterior(BigDecimal saldoAnterior) {
    this.saldoAnterior = saldoAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do saldo anterior")
  @JsonProperty("saldoAnterior")
  public BigDecimal getSaldoAnterior() {
    return saldoAnterior;
  }
  public void setSaldoAnterior(BigDecimal saldoAnterior) {
    this.saldoAnterior = saldoAnterior;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do boleto
   **/
  public FaturaResponse idBoleto(Long idBoleto) {
    this.idBoleto = idBoleto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do boleto")
  @JsonProperty("idBoleto")
  public Long getIdBoleto() {
    return idBoleto;
  }
  public void setIdBoleto(Long idBoleto) {
    this.idBoleto = idBoleto;
  }

  
  /**
   * Flag de emite extrato.
   **/
  public FaturaResponse flagEmiteExtrato(Boolean flagEmiteExtrato) {
    this.flagEmiteExtrato = flagEmiteExtrato;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag de emite extrato.")
  @JsonProperty("flagEmiteExtrato")
  public Boolean getFlagEmiteExtrato() {
    return flagEmiteExtrato;
  }
  public void setFlagEmiteExtrato(Boolean flagEmiteExtrato) {
    this.flagEmiteExtrato = flagEmiteExtrato;
  }

  
  /**
   * Linha digit\u00E1vel da fatura
   **/
  public FaturaResponse linhaDigitavel(String linhaDigitavel) {
    this.linhaDigitavel = linhaDigitavel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Linha digit\u00E1vel da fatura")
  @JsonProperty("linhaDigitavel")
  public String getLinhaDigitavel() {
    return linhaDigitavel;
  }
  public void setLinhaDigitavel(String linhaDigitavel) {
    this.linhaDigitavel = linhaDigitavel;
  }

  
  /**
   * Valor do CET (Custo efetivo total) mensal.
   **/
  public FaturaResponse cetMensal(BigDecimal cetMensal) {
    this.cetMensal = cetMensal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do CET (Custo efetivo total) mensal.")
  @JsonProperty("cetMensal")
  public BigDecimal getCetMensal() {
    return cetMensal;
  }
  public void setCetMensal(BigDecimal cetMensal) {
    this.cetMensal = cetMensal;
  }

  
  /**
   * Valor do CET (Custo efetivo total) anual.
   **/
  public FaturaResponse cetAnual(BigDecimal cetAnual) {
    this.cetAnual = cetAnual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do CET (Custo efetivo total) anual.")
  @JsonProperty("cetAnual")
  public BigDecimal getCetAnual() {
    return cetAnual;
  }
  public void setCetAnual(BigDecimal cetAnual) {
    this.cetAnual = cetAnual;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaturaResponse faturaResponse = (FaturaResponse) o;
    return Objects.equals(this.idConta, faturaResponse.idConta) &&
        Objects.equals(this.situacaoProcessamento, faturaResponse.situacaoProcessamento) &&
        Objects.equals(this.pagamentoEfetuado, faturaResponse.pagamentoEfetuado) &&
        Objects.equals(this.dataVencimentoFatura, faturaResponse.dataVencimentoFatura) &&
        Objects.equals(this.dataVencimentoReal, faturaResponse.dataVencimentoReal) &&
        Objects.equals(this.dataFechamento, faturaResponse.dataFechamento) &&
        Objects.equals(this.valorTotal, faturaResponse.valorTotal) &&
        Objects.equals(this.valorPagamentoMinimo, faturaResponse.valorPagamentoMinimo) &&
        Objects.equals(this.saldoAnterior, faturaResponse.saldoAnterior) &&
        Objects.equals(this.idBoleto, faturaResponse.idBoleto) &&
        Objects.equals(this.flagEmiteExtrato, faturaResponse.flagEmiteExtrato) &&
        Objects.equals(this.linhaDigitavel, faturaResponse.linhaDigitavel) &&
        Objects.equals(this.cetMensal, faturaResponse.cetMensal) &&
        Objects.equals(this.cetAnual, faturaResponse.cetAnual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, situacaoProcessamento, pagamentoEfetuado, dataVencimentoFatura, dataVencimentoReal, dataFechamento, valorTotal, valorPagamentoMinimo, saldoAnterior, idBoleto, flagEmiteExtrato, linhaDigitavel, cetMensal, cetAnual);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaturaResponse {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    situacaoProcessamento: ").append(toIndentedString(situacaoProcessamento)).append("\n");
    sb.append("    pagamentoEfetuado: ").append(toIndentedString(pagamentoEfetuado)).append("\n");
    sb.append("    dataVencimentoFatura: ").append(toIndentedString(dataVencimentoFatura)).append("\n");
    sb.append("    dataVencimentoReal: ").append(toIndentedString(dataVencimentoReal)).append("\n");
    sb.append("    dataFechamento: ").append(toIndentedString(dataFechamento)).append("\n");
    sb.append("    valorTotal: ").append(toIndentedString(valorTotal)).append("\n");
    sb.append("    valorPagamentoMinimo: ").append(toIndentedString(valorPagamentoMinimo)).append("\n");
    sb.append("    saldoAnterior: ").append(toIndentedString(saldoAnterior)).append("\n");
    sb.append("    idBoleto: ").append(toIndentedString(idBoleto)).append("\n");
    sb.append("    flagEmiteExtrato: ").append(toIndentedString(flagEmiteExtrato)).append("\n");
    sb.append("    linhaDigitavel: ").append(toIndentedString(linhaDigitavel)).append("\n");
    sb.append("    cetMensal: ").append(toIndentedString(cetMensal)).append("\n");
    sb.append("    cetAnual: ").append(toIndentedString(cetAnual)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

