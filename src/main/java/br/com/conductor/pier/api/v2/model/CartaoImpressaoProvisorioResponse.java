package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto cart\u00E3o provis\u00F3rio
 **/

@ApiModel(description = "Objeto cart\u00E3o provis\u00F3rio")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoImpressaoProvisorioResponse   {
  
  private Integer flagVirtual = null;
  private Long idConta = null;
  private Long idPessoa = null;
  private Long idCartao = null;
  private String numeroCartao = null;
  private String nomePlastico = null;
  private String dataValidade = null;
  private Long idMifare = null;
  private String matriculaMifare = null;

  
  /**
   **/
  public CartaoImpressaoProvisorioResponse flagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagVirtual")
  public Integer getFlagVirtual() {
    return flagVirtual;
  }
  public void setFlagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
  }

  
  /**
   * Apresenta o C\u00F3digo de Identifica\u00E7\u00E3o da Conta (id) a qual o cart\u00E3o gerado pertence
   **/
  public CartaoImpressaoProvisorioResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o C\u00F3digo de Identifica\u00E7\u00E3o da Conta (id) a qual o cart\u00E3o gerado pertence")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Apresenta o C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa (id) portadora do cart\u00E3o gerado
   **/
  public CartaoImpressaoProvisorioResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa (id) portadora do cart\u00E3o gerado")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Apresenta o C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id) que foi gerado
   **/
  public CartaoImpressaoProvisorioResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id) que foi gerado")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Apresenta o n\u00FAmero do cart\u00E3o
   **/
  public CartaoImpressaoProvisorioResponse numeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o n\u00FAmero do cart\u00E3o")
  @JsonProperty("numeroCartao")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * Apresenta o nome do Portador do Cart\u00E3o
   **/
  public CartaoImpressaoProvisorioResponse nomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome do Portador do Cart\u00E3o")
  @JsonProperty("nomePlastico")
  public String getNomePlastico() {
    return nomePlastico;
  }
  public void setNomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
  }

  
  /**
   * Apresenta a data de Validade do Cart\u00E3o
   **/
  public CartaoImpressaoProvisorioResponse dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data de Validade do Cart\u00E3o")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * C\u00F3digo identificador da tecnologia MIFARE
   **/
  public CartaoImpressaoProvisorioResponse idMifare(Long idMifare) {
    this.idMifare = idMifare;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador da tecnologia MIFARE")
  @JsonProperty("idMifare")
  public Long getIdMifare() {
    return idMifare;
  }
  public void setIdMifare(Long idMifare) {
    this.idMifare = idMifare;
  }

  
  /**
   * N\u00FAmero da matricula do portador
   **/
  public CartaoImpressaoProvisorioResponse matriculaMifare(String matriculaMifare) {
    this.matriculaMifare = matriculaMifare;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero da matricula do portador")
  @JsonProperty("matriculaMifare")
  public String getMatriculaMifare() {
    return matriculaMifare;
  }
  public void setMatriculaMifare(String matriculaMifare) {
    this.matriculaMifare = matriculaMifare;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartaoImpressaoProvisorioResponse cartaoImpressaoProvisorioResponse = (CartaoImpressaoProvisorioResponse) o;
    return Objects.equals(this.flagVirtual, cartaoImpressaoProvisorioResponse.flagVirtual) &&
        Objects.equals(this.idConta, cartaoImpressaoProvisorioResponse.idConta) &&
        Objects.equals(this.idPessoa, cartaoImpressaoProvisorioResponse.idPessoa) &&
        Objects.equals(this.idCartao, cartaoImpressaoProvisorioResponse.idCartao) &&
        Objects.equals(this.numeroCartao, cartaoImpressaoProvisorioResponse.numeroCartao) &&
        Objects.equals(this.nomePlastico, cartaoImpressaoProvisorioResponse.nomePlastico) &&
        Objects.equals(this.dataValidade, cartaoImpressaoProvisorioResponse.dataValidade) &&
        Objects.equals(this.idMifare, cartaoImpressaoProvisorioResponse.idMifare) &&
        Objects.equals(this.matriculaMifare, cartaoImpressaoProvisorioResponse.matriculaMifare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flagVirtual, idConta, idPessoa, idCartao, numeroCartao, nomePlastico, dataValidade, idMifare, matriculaMifare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoImpressaoProvisorioResponse {\n");
    
    sb.append("    flagVirtual: ").append(toIndentedString(flagVirtual)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    numeroCartao: ").append(toIndentedString(numeroCartao)).append("\n");
    sb.append("    nomePlastico: ").append(toIndentedString(nomePlastico)).append("\n");
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    idMifare: ").append(toIndentedString(idMifare)).append("\n");
    sb.append("    matriculaMifare: ").append(toIndentedString(matriculaMifare)).append("\n");
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

