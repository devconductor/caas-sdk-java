package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





/**
 * Objeto Cart\u00C3\u00A3o para Impresso
 **/

@ApiModel(description = "Objeto Cart\u00C3\u00A3o para Impresso")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoImpressao   {
  
  private String centroCustoConta = null;
  private String cpf = null;
  private String cvv2 = null;
  private Date dataGeracao = null;
  private Date dataValidade = null;
  private Long idBandeira = null;
  private Long idCartao = null;
  private Long idConta = null;
  private Long idPessoa = null;
  private Long idTipoCartao = null;
  private String nomeEmpregador = null;
  private String nomeEmpresa = null;
  private String nomeEmpresaBeneficio = null;
  private String nomeOrigemComercial = null;
  private String nomePlastico = null;
  private Integer numeroAgencia = null;
  private String numeroCartao = null;
  private String numeroContaCorente = null;
  private String tipoPortador = null;
  private String trilha1 = null;
  private String trilha2 = null;
  private String trilhaCVV1 = null;
  private String trilhaCVV2 = null;

  
  /**
   **/
  public CartaoImpressao centroCustoConta(String centroCustoConta) {
    this.centroCustoConta = centroCustoConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("centroCustoConta")
  public String getCentroCustoConta() {
    return centroCustoConta;
  }
  public void setCentroCustoConta(String centroCustoConta) {
    this.centroCustoConta = centroCustoConta;
  }

  
  /**
   **/
  public CartaoImpressao cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   **/
  public CartaoImpressao cvv2(String cvv2) {
    this.cvv2 = cvv2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cvv2")
  public String getCvv2() {
    return cvv2;
  }
  public void setCvv2(String cvv2) {
    this.cvv2 = cvv2;
  }

  
  /**
   **/
  public CartaoImpressao dataGeracao(Date dataGeracao) {
    this.dataGeracao = dataGeracao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataGeracao")
  public Date getDataGeracao() {
    return dataGeracao;
  }
  public void setDataGeracao(Date dataGeracao) {
    this.dataGeracao = dataGeracao;
  }

  
  /**
   **/
  public CartaoImpressao dataValidade(Date dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataValidade")
  public Date getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(Date dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   **/
  public CartaoImpressao idBandeira(Long idBandeira) {
    this.idBandeira = idBandeira;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idBandeira")
  public Long getIdBandeira() {
    return idBandeira;
  }
  public void setIdBandeira(Long idBandeira) {
    this.idBandeira = idBandeira;
  }

  
  /**
   **/
  public CartaoImpressao idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   **/
  public CartaoImpressao idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   **/
  public CartaoImpressao idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   **/
  public CartaoImpressao idTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idTipoCartao")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   **/
  public CartaoImpressao nomeEmpregador(String nomeEmpregador) {
    this.nomeEmpregador = nomeEmpregador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nomeEmpregador")
  public String getNomeEmpregador() {
    return nomeEmpregador;
  }
  public void setNomeEmpregador(String nomeEmpregador) {
    this.nomeEmpregador = nomeEmpregador;
  }

  
  /**
   **/
  public CartaoImpressao nomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nomeEmpresa")
  public String getNomeEmpresa() {
    return nomeEmpresa;
  }
  public void setNomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
  }

  
  /**
   **/
  public CartaoImpressao nomeEmpresaBeneficio(String nomeEmpresaBeneficio) {
    this.nomeEmpresaBeneficio = nomeEmpresaBeneficio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nomeEmpresaBeneficio")
  public String getNomeEmpresaBeneficio() {
    return nomeEmpresaBeneficio;
  }
  public void setNomeEmpresaBeneficio(String nomeEmpresaBeneficio) {
    this.nomeEmpresaBeneficio = nomeEmpresaBeneficio;
  }

  
  /**
   **/
  public CartaoImpressao nomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nomeOrigemComercial")
  public String getNomeOrigemComercial() {
    return nomeOrigemComercial;
  }
  public void setNomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
  }

  
  /**
   **/
  public CartaoImpressao nomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nomePlastico")
  public String getNomePlastico() {
    return nomePlastico;
  }
  public void setNomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
  }

  
  /**
   **/
  public CartaoImpressao numeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numeroAgencia")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   **/
  public CartaoImpressao numeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numeroCartao")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   **/
  public CartaoImpressao numeroContaCorente(String numeroContaCorente) {
    this.numeroContaCorente = numeroContaCorente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numeroContaCorente")
  public String getNumeroContaCorente() {
    return numeroContaCorente;
  }
  public void setNumeroContaCorente(String numeroContaCorente) {
    this.numeroContaCorente = numeroContaCorente;
  }

  
  /**
   **/
  public CartaoImpressao tipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tipoPortador")
  public String getTipoPortador() {
    return tipoPortador;
  }
  public void setTipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
  }

  
  /**
   **/
  public CartaoImpressao trilha1(String trilha1) {
    this.trilha1 = trilha1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("trilha1")
  public String getTrilha1() {
    return trilha1;
  }
  public void setTrilha1(String trilha1) {
    this.trilha1 = trilha1;
  }

  
  /**
   **/
  public CartaoImpressao trilha2(String trilha2) {
    this.trilha2 = trilha2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("trilha2")
  public String getTrilha2() {
    return trilha2;
  }
  public void setTrilha2(String trilha2) {
    this.trilha2 = trilha2;
  }

  
  /**
   **/
  public CartaoImpressao trilhaCVV1(String trilhaCVV1) {
    this.trilhaCVV1 = trilhaCVV1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("trilhaCVV1")
  public String getTrilhaCVV1() {
    return trilhaCVV1;
  }
  public void setTrilhaCVV1(String trilhaCVV1) {
    this.trilhaCVV1 = trilhaCVV1;
  }

  
  /**
   **/
  public CartaoImpressao trilhaCVV2(String trilhaCVV2) {
    this.trilhaCVV2 = trilhaCVV2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("trilhaCVV2")
  public String getTrilhaCVV2() {
    return trilhaCVV2;
  }
  public void setTrilhaCVV2(String trilhaCVV2) {
    this.trilhaCVV2 = trilhaCVV2;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartaoImpressao cartaoImpressao = (CartaoImpressao) o;
    return Objects.equals(this.centroCustoConta, cartaoImpressao.centroCustoConta) &&
        Objects.equals(this.cpf, cartaoImpressao.cpf) &&
        Objects.equals(this.cvv2, cartaoImpressao.cvv2) &&
        Objects.equals(this.dataGeracao, cartaoImpressao.dataGeracao) &&
        Objects.equals(this.dataValidade, cartaoImpressao.dataValidade) &&
        Objects.equals(this.idBandeira, cartaoImpressao.idBandeira) &&
        Objects.equals(this.idCartao, cartaoImpressao.idCartao) &&
        Objects.equals(this.idConta, cartaoImpressao.idConta) &&
        Objects.equals(this.idPessoa, cartaoImpressao.idPessoa) &&
        Objects.equals(this.idTipoCartao, cartaoImpressao.idTipoCartao) &&
        Objects.equals(this.nomeEmpregador, cartaoImpressao.nomeEmpregador) &&
        Objects.equals(this.nomeEmpresa, cartaoImpressao.nomeEmpresa) &&
        Objects.equals(this.nomeEmpresaBeneficio, cartaoImpressao.nomeEmpresaBeneficio) &&
        Objects.equals(this.nomeOrigemComercial, cartaoImpressao.nomeOrigemComercial) &&
        Objects.equals(this.nomePlastico, cartaoImpressao.nomePlastico) &&
        Objects.equals(this.numeroAgencia, cartaoImpressao.numeroAgencia) &&
        Objects.equals(this.numeroCartao, cartaoImpressao.numeroCartao) &&
        Objects.equals(this.numeroContaCorente, cartaoImpressao.numeroContaCorente) &&
        Objects.equals(this.tipoPortador, cartaoImpressao.tipoPortador) &&
        Objects.equals(this.trilha1, cartaoImpressao.trilha1) &&
        Objects.equals(this.trilha2, cartaoImpressao.trilha2) &&
        Objects.equals(this.trilhaCVV1, cartaoImpressao.trilhaCVV1) &&
        Objects.equals(this.trilhaCVV2, cartaoImpressao.trilhaCVV2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(centroCustoConta, cpf, cvv2, dataGeracao, dataValidade, idBandeira, idCartao, idConta, idPessoa, idTipoCartao, nomeEmpregador, nomeEmpresa, nomeEmpresaBeneficio, nomeOrigemComercial, nomePlastico, numeroAgencia, numeroCartao, numeroContaCorente, tipoPortador, trilha1, trilha2, trilhaCVV1, trilhaCVV2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoImpressao {\n");
    
    sb.append("    centroCustoConta: ").append(toIndentedString(centroCustoConta)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    cvv2: ").append(toIndentedString(cvv2)).append("\n");
    sb.append("    dataGeracao: ").append(toIndentedString(dataGeracao)).append("\n");
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    idBandeira: ").append(toIndentedString(idBandeira)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idTipoCartao: ").append(toIndentedString(idTipoCartao)).append("\n");
    sb.append("    nomeEmpregador: ").append(toIndentedString(nomeEmpregador)).append("\n");
    sb.append("    nomeEmpresa: ").append(toIndentedString(nomeEmpresa)).append("\n");
    sb.append("    nomeEmpresaBeneficio: ").append(toIndentedString(nomeEmpresaBeneficio)).append("\n");
    sb.append("    nomeOrigemComercial: ").append(toIndentedString(nomeOrigemComercial)).append("\n");
    sb.append("    nomePlastico: ").append(toIndentedString(nomePlastico)).append("\n");
    sb.append("    numeroAgencia: ").append(toIndentedString(numeroAgencia)).append("\n");
    sb.append("    numeroCartao: ").append(toIndentedString(numeroCartao)).append("\n");
    sb.append("    numeroContaCorente: ").append(toIndentedString(numeroContaCorente)).append("\n");
    sb.append("    tipoPortador: ").append(toIndentedString(tipoPortador)).append("\n");
    sb.append("    trilha1: ").append(toIndentedString(trilha1)).append("\n");
    sb.append("    trilha2: ").append(toIndentedString(trilha2)).append("\n");
    sb.append("    trilhaCVV1: ").append(toIndentedString(trilhaCVV1)).append("\n");
    sb.append("    trilhaCVV2: ").append(toIndentedString(trilhaCVV2)).append("\n");
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



