package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Par\u00E2metros utilizados no cadastro de par\u00E2metros de produto
 **/

@ApiModel(description = "Par\u00E2metros utilizados no cadastro de par\u00E2metros de produto")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ParametroProdutoPersist   {
  
  private Long idProduto = null;
  private String dataValidade = null;
  private String codigo = null;
  private String descricao = null;
  private String tipo = null;
  private String valorParametro = null;

  
  /**
   * Identificador do produto
   **/
  public ParametroProdutoPersist idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "1", required = true, value = "Identificador do produto")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Data de validade do par\u00E2metro de produto
   **/
  public ParametroProdutoPersist dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "2020-12-31T00:00:00.000Z", required = true, value = "Data de validade do par\u00E2metro de produto")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * C\u00F3digo do par\u00E2metro do produto
   **/
  public ParametroProdutoPersist codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }
  
  @ApiModelProperty(example = "PARAMETRO_EXEMPLO", required = true, value = "C\u00F3digo do par\u00E2metro do produto")
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  
  /**
   * Descri\u00E7\u00E3o do par\u00E2metro de produto
   **/
  public ParametroProdutoPersist descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "Parâmetro exemplo do parâmetro de produto", required = true, value = "Descri\u00E7\u00E3o do par\u00E2metro de produto")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Tipo do par\u00E2metro de produto
   **/
  public ParametroProdutoPersist tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }
  
  @ApiModelProperty(example = "N", required = true, value = "Tipo do par\u00E2metro de produto")
  @JsonProperty("tipo")
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  
  /**
   * Valor do par\u00E2metro do produto
   **/
  public ParametroProdutoPersist valorParametro(String valorParametro) {
    this.valorParametro = valorParametro;
    return this;
  }
  
  @ApiModelProperty(example = "150.50", value = "Valor do par\u00E2metro do produto")
  @JsonProperty("valorParametro")
  public String getValorParametro() {
    return valorParametro;
  }
  public void setValorParametro(String valorParametro) {
    this.valorParametro = valorParametro;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParametroProdutoPersist parametroProdutoPersist = (ParametroProdutoPersist) o;
    return Objects.equals(this.idProduto, parametroProdutoPersist.idProduto) &&
        Objects.equals(this.dataValidade, parametroProdutoPersist.dataValidade) &&
        Objects.equals(this.codigo, parametroProdutoPersist.codigo) &&
        Objects.equals(this.descricao, parametroProdutoPersist.descricao) &&
        Objects.equals(this.tipo, parametroProdutoPersist.tipo) &&
        Objects.equals(this.valorParametro, parametroProdutoPersist.valorParametro);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProduto, dataValidade, codigo, descricao, tipo, valorParametro);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParametroProdutoPersist {\n");
    
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    valorParametro: ").append(toIndentedString(valorParametro)).append("\n");
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

