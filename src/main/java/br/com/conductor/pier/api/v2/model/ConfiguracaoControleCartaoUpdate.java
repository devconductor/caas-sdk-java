package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Representa\u00E7\u00E3o de objeto para altera\u00E7\u00E3o de dados de Configuracao de Controle do Cartao
 **/

@ApiModel(description = "Representa\u00E7\u00E3o de objeto para altera\u00E7\u00E3o de dados de Configuracao de Controle do Cartao")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ConfiguracaoControleCartaoUpdate   {
  
  private Boolean permiteEcommerce = null;
  private Boolean permiteSaque = null;
  private Boolean permiteWallet = null;
  private Boolean permiteControleMCC = null;
  private Boolean permiteCompraInternacional = null;
  private Boolean permiteTarjaMagnetica = null;
  private Boolean permiteContactless = null;
  private BigDecimal limiteContactlessSemSenha = null;

  
  /**
   * Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es ecommerce
   **/
  public ConfiguracaoControleCartaoUpdate permiteEcommerce(Boolean permiteEcommerce) {
    this.permiteEcommerce = permiteEcommerce;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es ecommerce")
  @JsonProperty("permiteEcommerce")
  public Boolean getPermiteEcommerce() {
    return permiteEcommerce;
  }
  public void setPermiteEcommerce(Boolean permiteEcommerce) {
    this.permiteEcommerce = permiteEcommerce;
  }

  
  /**
   * Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es de saque
   **/
  public ConfiguracaoControleCartaoUpdate permiteSaque(Boolean permiteSaque) {
    this.permiteSaque = permiteSaque;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es de saque")
  @JsonProperty("permiteSaque")
  public Boolean getPermiteSaque() {
    return permiteSaque;
  }
  public void setPermiteSaque(Boolean permiteSaque) {
    this.permiteSaque = permiteSaque;
  }

  
  /**
   * Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es por wallet
   **/
  public ConfiguracaoControleCartaoUpdate permiteWallet(Boolean permiteWallet) {
    this.permiteWallet = permiteWallet;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es por wallet")
  @JsonProperty("permiteWallet")
  public Boolean getPermiteWallet() {
    return permiteWallet;
  }
  public void setPermiteWallet(Boolean permiteWallet) {
    this.permiteWallet = permiteWallet;
  }

  
  /**
   * Indica se o cart\u00E3o est\u00E1 ativo para controle por grupos de MCCs
   **/
  public ConfiguracaoControleCartaoUpdate permiteControleMCC(Boolean permiteControleMCC) {
    this.permiteControleMCC = permiteControleMCC;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indica se o cart\u00E3o est\u00E1 ativo para controle por grupos de MCCs")
  @JsonProperty("permiteControleMCC")
  public Boolean getPermiteControleMCC() {
    return permiteControleMCC;
  }
  public void setPermiteControleMCC(Boolean permiteControleMCC) {
    this.permiteControleMCC = permiteControleMCC;
  }

  
  /**
   * Indica se o cart\u00E3o est\u00E1 habilitado/desabilitado para transa\u00E7\u00F5es internacionais
   **/
  public ConfiguracaoControleCartaoUpdate permiteCompraInternacional(Boolean permiteCompraInternacional) {
    this.permiteCompraInternacional = permiteCompraInternacional;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indica se o cart\u00E3o est\u00E1 habilitado/desabilitado para transa\u00E7\u00F5es internacionais")
  @JsonProperty("permiteCompraInternacional")
  public Boolean getPermiteCompraInternacional() {
    return permiteCompraInternacional;
  }
  public void setPermiteCompraInternacional(Boolean permiteCompraInternacional) {
    this.permiteCompraInternacional = permiteCompraInternacional;
  }

  
  /**
   * Indica se o cart\u00E3o est\u00E1 habilitado/desabilitado para transa\u00E7\u00F5es por tarja magnetica
   **/
  public ConfiguracaoControleCartaoUpdate permiteTarjaMagnetica(Boolean permiteTarjaMagnetica) {
    this.permiteTarjaMagnetica = permiteTarjaMagnetica;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indica se o cart\u00E3o est\u00E1 habilitado/desabilitado para transa\u00E7\u00F5es por tarja magnetica")
  @JsonProperty("permiteTarjaMagnetica")
  public Boolean getPermiteTarjaMagnetica() {
    return permiteTarjaMagnetica;
  }
  public void setPermiteTarjaMagnetica(Boolean permiteTarjaMagnetica) {
    this.permiteTarjaMagnetica = permiteTarjaMagnetica;
  }

  
  /**
   * Indica se o cart\u00E3o est\u00E1 habilitado/desabilitado para transa\u00E7\u00F5es via contactless
   **/
  public ConfiguracaoControleCartaoUpdate permiteContactless(Boolean permiteContactless) {
    this.permiteContactless = permiteContactless;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indica se o cart\u00E3o est\u00E1 habilitado/desabilitado para transa\u00E7\u00F5es via contactless")
  @JsonProperty("permiteContactless")
  public Boolean getPermiteContactless() {
    return permiteContactless;
  }
  public void setPermiteContactless(Boolean permiteContactless) {
    this.permiteContactless = permiteContactless;
  }

  
  /**
   * Indica o limite usado em transa\u00E7\u00F5es com a fun\u00E7\u00E3o contactless sem senha. O valor m\u00E1ximo \u00E9 50 e o m\u00EDnimo \u00E9 1.
   **/
  public ConfiguracaoControleCartaoUpdate limiteContactlessSemSenha(BigDecimal limiteContactlessSemSenha) {
    this.limiteContactlessSemSenha = limiteContactlessSemSenha;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica o limite usado em transa\u00E7\u00F5es com a fun\u00E7\u00E3o contactless sem senha. O valor m\u00E1ximo \u00E9 50 e o m\u00EDnimo \u00E9 1.")
  @JsonProperty("limiteContactlessSemSenha")
  public BigDecimal getLimiteContactlessSemSenha() {
    return limiteContactlessSemSenha;
  }
  public void setLimiteContactlessSemSenha(BigDecimal limiteContactlessSemSenha) {
    this.limiteContactlessSemSenha = limiteContactlessSemSenha;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfiguracaoControleCartaoUpdate configuracaoControleCartaoUpdate = (ConfiguracaoControleCartaoUpdate) o;
    return Objects.equals(this.permiteEcommerce, configuracaoControleCartaoUpdate.permiteEcommerce) &&
        Objects.equals(this.permiteSaque, configuracaoControleCartaoUpdate.permiteSaque) &&
        Objects.equals(this.permiteWallet, configuracaoControleCartaoUpdate.permiteWallet) &&
        Objects.equals(this.permiteControleMCC, configuracaoControleCartaoUpdate.permiteControleMCC) &&
        Objects.equals(this.permiteCompraInternacional, configuracaoControleCartaoUpdate.permiteCompraInternacional) &&
        Objects.equals(this.permiteTarjaMagnetica, configuracaoControleCartaoUpdate.permiteTarjaMagnetica) &&
        Objects.equals(this.permiteContactless, configuracaoControleCartaoUpdate.permiteContactless) &&
        Objects.equals(this.limiteContactlessSemSenha, configuracaoControleCartaoUpdate.limiteContactlessSemSenha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permiteEcommerce, permiteSaque, permiteWallet, permiteControleMCC, permiteCompraInternacional, permiteTarjaMagnetica, permiteContactless, limiteContactlessSemSenha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguracaoControleCartaoUpdate {\n");
    
    sb.append("    permiteEcommerce: ").append(toIndentedString(permiteEcommerce)).append("\n");
    sb.append("    permiteSaque: ").append(toIndentedString(permiteSaque)).append("\n");
    sb.append("    permiteWallet: ").append(toIndentedString(permiteWallet)).append("\n");
    sb.append("    permiteControleMCC: ").append(toIndentedString(permiteControleMCC)).append("\n");
    sb.append("    permiteCompraInternacional: ").append(toIndentedString(permiteCompraInternacional)).append("\n");
    sb.append("    permiteTarjaMagnetica: ").append(toIndentedString(permiteTarjaMagnetica)).append("\n");
    sb.append("    permiteContactless: ").append(toIndentedString(permiteContactless)).append("\n");
    sb.append("    limiteContactlessSemSenha: ").append(toIndentedString(limiteContactlessSemSenha)).append("\n");
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

