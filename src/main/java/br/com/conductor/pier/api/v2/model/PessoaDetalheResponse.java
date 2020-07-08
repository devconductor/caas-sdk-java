package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * PessoaDetalheResponse
 **/

@ApiModel(description = "PessoaDetalheResponse")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PessoaDetalheResponse   {
  
  private Long idPessoa = null;
  private String nomeMae = null;
  private Long idEstadoCivil = null;
  private String idProfissao = null;
  private Long idNaturezaOcupacao = null;
  private Long idNacionalidade = null;
  private Integer numeroBanco = null;
  private Integer numeroAgencia = null;
  private String numeroContaCorrente = null;
  private String email = null;
  private String nomeEmpresa = null;
  private String nomeReferencia1 = null;
  private String enderecoReferencia1 = null;
  private String nomeReferencia2 = null;
  private String enderecoReferencia2 = null;
  private BigDecimal salario = null;
  private Boolean impedidoFinanciamento = null;
  private String naturalidadeCidade = null;
  private String naturalidadeEstado = null;
  private Integer grauInstrucao = null;
  private Integer numeroDependentes = null;
  private String nomePai = null;
  private Integer chequeEspecial = null;
  private String numeroCnh = null;
  private Boolean pessoaPoliticamenteExposta = null;
  private BigDecimal patrimonioTotal = null;
  private String nomeConjuge = null;
  private Boolean flagNomePaiNaoInformado = null;
  private Boolean flagSemEnderecoComercialFixo = null;
  private String dataEmissaoCnh = null;

  
  /**
   * C\u00F3digo identificador da pessoa
   **/
  public PessoaDetalheResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador da pessoa")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Apresenta o nome da m\u00E3e da pessoa fisica
   **/
  public PessoaDetalheResponse nomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome da m\u00E3e da pessoa fisica")
  @JsonProperty("nomeMae")
  public String getNomeMae() {
    return nomeMae;
  }
  public void setNomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
  }

  
  /**
   * Id Estado civil da pessoa fisica
   **/
  public PessoaDetalheResponse idEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id Estado civil da pessoa fisica")
  @JsonProperty("idEstadoCivil")
  public Long getIdEstadoCivil() {
    return idEstadoCivil;
  }
  public void setIdEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
  }

  
  /**
   * Profiss\u00E3o da pessoa fisica
   **/
  public PessoaDetalheResponse idProfissao(String idProfissao) {
    this.idProfissao = idProfissao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Profiss\u00E3o da pessoa fisica")
  @JsonProperty("idProfissao")
  public String getIdProfissao() {
    return idProfissao;
  }
  public void setIdProfissao(String idProfissao) {
    this.idProfissao = idProfissao;
  }

  
  /**
   * Id Natureza Ocupa\u00E7\u00E3o da pessoa fisica
   **/
  public PessoaDetalheResponse idNaturezaOcupacao(Long idNaturezaOcupacao) {
    this.idNaturezaOcupacao = idNaturezaOcupacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id Natureza Ocupa\u00E7\u00E3o da pessoa fisica")
  @JsonProperty("idNaturezaOcupacao")
  public Long getIdNaturezaOcupacao() {
    return idNaturezaOcupacao;
  }
  public void setIdNaturezaOcupacao(Long idNaturezaOcupacao) {
    this.idNaturezaOcupacao = idNaturezaOcupacao;
  }

  
  /**
   * Id Nacionalidade da pessoa fisica
   **/
  public PessoaDetalheResponse idNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id Nacionalidade da pessoa fisica")
  @JsonProperty("idNacionalidade")
  public Long getIdNacionalidade() {
    return idNacionalidade;
  }
  public void setIdNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
  }

  
  /**
   * N\u00FAmero do banco
   **/
  public PessoaDetalheResponse numeroBanco(Integer numeroBanco) {
    this.numeroBanco = numeroBanco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do banco")
  @JsonProperty("numeroBanco")
  public Integer getNumeroBanco() {
    return numeroBanco;
  }
  public void setNumeroBanco(Integer numeroBanco) {
    this.numeroBanco = numeroBanco;
  }

  
  /**
   * N\u00FAmero da ag\u00EAncia
   **/
  public PessoaDetalheResponse numeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero da ag\u00EAncia")
  @JsonProperty("numeroAgencia")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * N\u00FAmero da conta corrente
   **/
  public PessoaDetalheResponse numeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero da conta corrente")
  @JsonProperty("numeroContaCorrente")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * Email da pessoa fisica
   **/
  public PessoaDetalheResponse email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email da pessoa fisica")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Nome que deve ser impresso no cart\u00E3o
   **/
  public PessoaDetalheResponse nomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome que deve ser impresso no cart\u00E3o")
  @JsonProperty("nomeEmpresa")
  public String getNomeEmpresa() {
    return nomeEmpresa;
  }
  public void setNomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
  }

  
  /**
   * Nome de refer\u00EAncia 1
   **/
  public PessoaDetalheResponse nomeReferencia1(String nomeReferencia1) {
    this.nomeReferencia1 = nomeReferencia1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome de refer\u00EAncia 1")
  @JsonProperty("nomeReferencia1")
  public String getNomeReferencia1() {
    return nomeReferencia1;
  }
  public void setNomeReferencia1(String nomeReferencia1) {
    this.nomeReferencia1 = nomeReferencia1;
  }

  
  /**
   * Endere\u00E7o de refer\u00EAncia 1
   **/
  public PessoaDetalheResponse enderecoReferencia1(String enderecoReferencia1) {
    this.enderecoReferencia1 = enderecoReferencia1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Endere\u00E7o de refer\u00EAncia 1")
  @JsonProperty("enderecoReferencia1")
  public String getEnderecoReferencia1() {
    return enderecoReferencia1;
  }
  public void setEnderecoReferencia1(String enderecoReferencia1) {
    this.enderecoReferencia1 = enderecoReferencia1;
  }

  
  /**
   * Nome de refer\u00EAncia 2
   **/
  public PessoaDetalheResponse nomeReferencia2(String nomeReferencia2) {
    this.nomeReferencia2 = nomeReferencia2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome de refer\u00EAncia 2")
  @JsonProperty("nomeReferencia2")
  public String getNomeReferencia2() {
    return nomeReferencia2;
  }
  public void setNomeReferencia2(String nomeReferencia2) {
    this.nomeReferencia2 = nomeReferencia2;
  }

  
  /**
   * Endere\u00E7o de refer\u00EAncia 2
   **/
  public PessoaDetalheResponse enderecoReferencia2(String enderecoReferencia2) {
    this.enderecoReferencia2 = enderecoReferencia2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Endere\u00E7o de refer\u00EAncia 2")
  @JsonProperty("enderecoReferencia2")
  public String getEnderecoReferencia2() {
    return enderecoReferencia2;
  }
  public void setEnderecoReferencia2(String enderecoReferencia2) {
    this.enderecoReferencia2 = enderecoReferencia2;
  }

  
  /**
   * Sal\u00E1rio
   **/
  public PessoaDetalheResponse salario(BigDecimal salario) {
    this.salario = salario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sal\u00E1rio")
  @JsonProperty("salario")
  public BigDecimal getSalario() {
    return salario;
  }
  public void setSalario(BigDecimal salario) {
    this.salario = salario;
  }

  
  /**
   * Flag para s\u00F3cios do banco que s\u00E3o portadores do cart\u00E3o, mas n\u00E3o podem operar transa\u00E7\u00F5es de cr\u00E9dito(Lei n. 4.595/64)
   **/
  public PessoaDetalheResponse impedidoFinanciamento(Boolean impedidoFinanciamento) {
    this.impedidoFinanciamento = impedidoFinanciamento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag para s\u00F3cios do banco que s\u00E3o portadores do cart\u00E3o, mas n\u00E3o podem operar transa\u00E7\u00F5es de cr\u00E9dito(Lei n. 4.595/64)")
  @JsonProperty("impedidoFinanciamento")
  public Boolean getImpedidoFinanciamento() {
    return impedidoFinanciamento;
  }
  public void setImpedidoFinanciamento(Boolean impedidoFinanciamento) {
    this.impedidoFinanciamento = impedidoFinanciamento;
  }

  
  /**
   * Apresenta o nome da cidade de nascimento da pessoa f\u00EDsica
   **/
  public PessoaDetalheResponse naturalidadeCidade(String naturalidadeCidade) {
    this.naturalidadeCidade = naturalidadeCidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome da cidade de nascimento da pessoa f\u00EDsica")
  @JsonProperty("naturalidadeCidade")
  public String getNaturalidadeCidade() {
    return naturalidadeCidade;
  }
  public void setNaturalidadeCidade(String naturalidadeCidade) {
    this.naturalidadeCidade = naturalidadeCidade;
  }

  
  /**
   * Apresenta a sigla do estado de nascimento da pessoa f\u00EDsica
   **/
  public PessoaDetalheResponse naturalidadeEstado(String naturalidadeEstado) {
    this.naturalidadeEstado = naturalidadeEstado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a sigla do estado de nascimento da pessoa f\u00EDsica")
  @JsonProperty("naturalidadeEstado")
  public String getNaturalidadeEstado() {
    return naturalidadeEstado;
  }
  public void setNaturalidadeEstado(String naturalidadeEstado) {
    this.naturalidadeEstado = naturalidadeEstado;
  }

  
  /**
   * Apresenta o grau de instru\u00E7\u00E3o da pessoa f\u00EDsica
   **/
  public PessoaDetalheResponse grauInstrucao(Integer grauInstrucao) {
    this.grauInstrucao = grauInstrucao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o grau de instru\u00E7\u00E3o da pessoa f\u00EDsica")
  @JsonProperty("grauInstrucao")
  public Integer getGrauInstrucao() {
    return grauInstrucao;
  }
  public void setGrauInstrucao(Integer grauInstrucao) {
    this.grauInstrucao = grauInstrucao;
  }

  
  /**
   * Apresenta o n\u00FAmero de dependentes da pessoa f\u00EDsica
   **/
  public PessoaDetalheResponse numeroDependentes(Integer numeroDependentes) {
    this.numeroDependentes = numeroDependentes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o n\u00FAmero de dependentes da pessoa f\u00EDsica")
  @JsonProperty("numeroDependentes")
  public Integer getNumeroDependentes() {
    return numeroDependentes;
  }
  public void setNumeroDependentes(Integer numeroDependentes) {
    this.numeroDependentes = numeroDependentes;
  }

  
  /**
   * Apresenta o nome do pai da pessoa f\u00EDsica
   **/
  public PessoaDetalheResponse nomePai(String nomePai) {
    this.nomePai = nomePai;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome do pai da pessoa f\u00EDsica")
  @JsonProperty("nomePai")
  public String getNomePai() {
    return nomePai;
  }
  public void setNomePai(String nomePai) {
    this.nomePai = nomePai;
  }

  
  /**
   * Indica se pessoa f\u00EDsica aderir ao cheque especial
   **/
  public PessoaDetalheResponse chequeEspecial(Integer chequeEspecial) {
    this.chequeEspecial = chequeEspecial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica se pessoa f\u00EDsica aderir ao cheque especial")
  @JsonProperty("chequeEspecial")
  public Integer getChequeEspecial() {
    return chequeEspecial;
  }
  public void setChequeEspecial(Integer chequeEspecial) {
    this.chequeEspecial = chequeEspecial;
  }

  
  /**
   * N\u00FAmero da CNH da pessoa
   **/
  public PessoaDetalheResponse numeroCnh(String numeroCnh) {
    this.numeroCnh = numeroCnh;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero da CNH da pessoa")
  @JsonProperty("numeroCnh")
  public String getNumeroCnh() {
    return numeroCnh;
  }
  public void setNumeroCnh(String numeroCnh) {
    this.numeroCnh = numeroCnh;
  }

  
  /**
   * Flag para identificar se a pessoa \u00E9 politicamente exposta
   **/
  public PessoaDetalheResponse pessoaPoliticamenteExposta(Boolean pessoaPoliticamenteExposta) {
    this.pessoaPoliticamenteExposta = pessoaPoliticamenteExposta;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag para identificar se a pessoa \u00E9 politicamente exposta")
  @JsonProperty("pessoaPoliticamenteExposta")
  public Boolean getPessoaPoliticamenteExposta() {
    return pessoaPoliticamenteExposta;
  }
  public void setPessoaPoliticamenteExposta(Boolean pessoaPoliticamenteExposta) {
    this.pessoaPoliticamenteExposta = pessoaPoliticamenteExposta;
  }

  
  /**
   * Patrim\u00F4nio total da pessoa
   **/
  public PessoaDetalheResponse patrimonioTotal(BigDecimal patrimonioTotal) {
    this.patrimonioTotal = patrimonioTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Patrim\u00F4nio total da pessoa")
  @JsonProperty("patrimonioTotal")
  public BigDecimal getPatrimonioTotal() {
    return patrimonioTotal;
  }
  public void setPatrimonioTotal(BigDecimal patrimonioTotal) {
    this.patrimonioTotal = patrimonioTotal;
  }

  
  /**
   * Nome do c\u00F4njuge da pessoa
   **/
  public PessoaDetalheResponse nomeConjuge(String nomeConjuge) {
    this.nomeConjuge = nomeConjuge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do c\u00F4njuge da pessoa")
  @JsonProperty("nomeConjuge")
  public String getNomeConjuge() {
    return nomeConjuge;
  }
  public void setNomeConjuge(String nomeConjuge) {
    this.nomeConjuge = nomeConjuge;
  }

  
  /**
   * Flag que indica se a pessoa informou nome do pai
   **/
  public PessoaDetalheResponse flagNomePaiNaoInformado(Boolean flagNomePaiNaoInformado) {
    this.flagNomePaiNaoInformado = flagNomePaiNaoInformado;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que indica se a pessoa informou nome do pai")
  @JsonProperty("flagNomePaiNaoInformado")
  public Boolean getFlagNomePaiNaoInformado() {
    return flagNomePaiNaoInformado;
  }
  public void setFlagNomePaiNaoInformado(Boolean flagNomePaiNaoInformado) {
    this.flagNomePaiNaoInformado = flagNomePaiNaoInformado;
  }

  
  /**
   * Flag que indica se a pessoa possui endere\u00E7o comercial fixo
   **/
  public PessoaDetalheResponse flagSemEnderecoComercialFixo(Boolean flagSemEnderecoComercialFixo) {
    this.flagSemEnderecoComercialFixo = flagSemEnderecoComercialFixo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que indica se a pessoa possui endere\u00E7o comercial fixo")
  @JsonProperty("flagSemEnderecoComercialFixo")
  public Boolean getFlagSemEnderecoComercialFixo() {
    return flagSemEnderecoComercialFixo;
  }
  public void setFlagSemEnderecoComercialFixo(Boolean flagSemEnderecoComercialFixo) {
    this.flagSemEnderecoComercialFixo = flagSemEnderecoComercialFixo;
  }

  
  /**
   * Data emiss\u00E3o CNH
   **/
  public PessoaDetalheResponse dataEmissaoCnh(String dataEmissaoCnh) {
    this.dataEmissaoCnh = dataEmissaoCnh;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data emiss\u00E3o CNH")
  @JsonProperty("dataEmissaoCnh")
  public String getDataEmissaoCnh() {
    return dataEmissaoCnh;
  }
  public void setDataEmissaoCnh(String dataEmissaoCnh) {
    this.dataEmissaoCnh = dataEmissaoCnh;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PessoaDetalheResponse pessoaDetalheResponse = (PessoaDetalheResponse) o;
    return Objects.equals(this.idPessoa, pessoaDetalheResponse.idPessoa) &&
        Objects.equals(this.nomeMae, pessoaDetalheResponse.nomeMae) &&
        Objects.equals(this.idEstadoCivil, pessoaDetalheResponse.idEstadoCivil) &&
        Objects.equals(this.idProfissao, pessoaDetalheResponse.idProfissao) &&
        Objects.equals(this.idNaturezaOcupacao, pessoaDetalheResponse.idNaturezaOcupacao) &&
        Objects.equals(this.idNacionalidade, pessoaDetalheResponse.idNacionalidade) &&
        Objects.equals(this.numeroBanco, pessoaDetalheResponse.numeroBanco) &&
        Objects.equals(this.numeroAgencia, pessoaDetalheResponse.numeroAgencia) &&
        Objects.equals(this.numeroContaCorrente, pessoaDetalheResponse.numeroContaCorrente) &&
        Objects.equals(this.email, pessoaDetalheResponse.email) &&
        Objects.equals(this.nomeEmpresa, pessoaDetalheResponse.nomeEmpresa) &&
        Objects.equals(this.nomeReferencia1, pessoaDetalheResponse.nomeReferencia1) &&
        Objects.equals(this.enderecoReferencia1, pessoaDetalheResponse.enderecoReferencia1) &&
        Objects.equals(this.nomeReferencia2, pessoaDetalheResponse.nomeReferencia2) &&
        Objects.equals(this.enderecoReferencia2, pessoaDetalheResponse.enderecoReferencia2) &&
        Objects.equals(this.salario, pessoaDetalheResponse.salario) &&
        Objects.equals(this.impedidoFinanciamento, pessoaDetalheResponse.impedidoFinanciamento) &&
        Objects.equals(this.naturalidadeCidade, pessoaDetalheResponse.naturalidadeCidade) &&
        Objects.equals(this.naturalidadeEstado, pessoaDetalheResponse.naturalidadeEstado) &&
        Objects.equals(this.grauInstrucao, pessoaDetalheResponse.grauInstrucao) &&
        Objects.equals(this.numeroDependentes, pessoaDetalheResponse.numeroDependentes) &&
        Objects.equals(this.nomePai, pessoaDetalheResponse.nomePai) &&
        Objects.equals(this.chequeEspecial, pessoaDetalheResponse.chequeEspecial) &&
        Objects.equals(this.numeroCnh, pessoaDetalheResponse.numeroCnh) &&
        Objects.equals(this.pessoaPoliticamenteExposta, pessoaDetalheResponse.pessoaPoliticamenteExposta) &&
        Objects.equals(this.patrimonioTotal, pessoaDetalheResponse.patrimonioTotal) &&
        Objects.equals(this.nomeConjuge, pessoaDetalheResponse.nomeConjuge) &&
        Objects.equals(this.flagNomePaiNaoInformado, pessoaDetalheResponse.flagNomePaiNaoInformado) &&
        Objects.equals(this.flagSemEnderecoComercialFixo, pessoaDetalheResponse.flagSemEnderecoComercialFixo) &&
        Objects.equals(this.dataEmissaoCnh, pessoaDetalheResponse.dataEmissaoCnh);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPessoa, nomeMae, idEstadoCivil, idProfissao, idNaturezaOcupacao, idNacionalidade, numeroBanco, numeroAgencia, numeroContaCorrente, email, nomeEmpresa, nomeReferencia1, enderecoReferencia1, nomeReferencia2, enderecoReferencia2, salario, impedidoFinanciamento, naturalidadeCidade, naturalidadeEstado, grauInstrucao, numeroDependentes, nomePai, chequeEspecial, numeroCnh, pessoaPoliticamenteExposta, patrimonioTotal, nomeConjuge, flagNomePaiNaoInformado, flagSemEnderecoComercialFixo, dataEmissaoCnh);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaDetalheResponse {\n");
    
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    nomeMae: ").append(toIndentedString(nomeMae)).append("\n");
    sb.append("    idEstadoCivil: ").append(toIndentedString(idEstadoCivil)).append("\n");
    sb.append("    idProfissao: ").append(toIndentedString(idProfissao)).append("\n");
    sb.append("    idNaturezaOcupacao: ").append(toIndentedString(idNaturezaOcupacao)).append("\n");
    sb.append("    idNacionalidade: ").append(toIndentedString(idNacionalidade)).append("\n");
    sb.append("    numeroBanco: ").append(toIndentedString(numeroBanco)).append("\n");
    sb.append("    numeroAgencia: ").append(toIndentedString(numeroAgencia)).append("\n");
    sb.append("    numeroContaCorrente: ").append(toIndentedString(numeroContaCorrente)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    nomeEmpresa: ").append(toIndentedString(nomeEmpresa)).append("\n");
    sb.append("    nomeReferencia1: ").append(toIndentedString(nomeReferencia1)).append("\n");
    sb.append("    enderecoReferencia1: ").append(toIndentedString(enderecoReferencia1)).append("\n");
    sb.append("    nomeReferencia2: ").append(toIndentedString(nomeReferencia2)).append("\n");
    sb.append("    enderecoReferencia2: ").append(toIndentedString(enderecoReferencia2)).append("\n");
    sb.append("    salario: ").append(toIndentedString(salario)).append("\n");
    sb.append("    impedidoFinanciamento: ").append(toIndentedString(impedidoFinanciamento)).append("\n");
    sb.append("    naturalidadeCidade: ").append(toIndentedString(naturalidadeCidade)).append("\n");
    sb.append("    naturalidadeEstado: ").append(toIndentedString(naturalidadeEstado)).append("\n");
    sb.append("    grauInstrucao: ").append(toIndentedString(grauInstrucao)).append("\n");
    sb.append("    numeroDependentes: ").append(toIndentedString(numeroDependentes)).append("\n");
    sb.append("    nomePai: ").append(toIndentedString(nomePai)).append("\n");
    sb.append("    chequeEspecial: ").append(toIndentedString(chequeEspecial)).append("\n");
    sb.append("    numeroCnh: ").append(toIndentedString(numeroCnh)).append("\n");
    sb.append("    pessoaPoliticamenteExposta: ").append(toIndentedString(pessoaPoliticamenteExposta)).append("\n");
    sb.append("    patrimonioTotal: ").append(toIndentedString(patrimonioTotal)).append("\n");
    sb.append("    nomeConjuge: ").append(toIndentedString(nomeConjuge)).append("\n");
    sb.append("    flagNomePaiNaoInformado: ").append(toIndentedString(flagNomePaiNaoInformado)).append("\n");
    sb.append("    flagSemEnderecoComercialFixo: ").append(toIndentedString(flagSemEnderecoComercialFixo)).append("\n");
    sb.append("    dataEmissaoCnh: ").append(toIndentedString(dataEmissaoCnh)).append("\n");
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

