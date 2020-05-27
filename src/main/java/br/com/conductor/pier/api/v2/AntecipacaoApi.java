package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.ParametroProdutoResponse;
import br.com.conductor.pier.api.v2.model.TaxaAntecipacaoRequest;
import br.com.conductor.pier.api.v2.model.AntecipacaoResponse;
import br.com.conductor.pier.api.v2.model.PageCompraResponse;
import br.com.conductor.pier.api.v2.model.AntecipacaoSimuladaResponse;
import br.com.conductor.pier.api.v2.model.AntecipacaoSimuladaLoteResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AntecipacaoApi {
  private ApiClient apiClient;

  public AntecipacaoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AntecipacaoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Configura a Taxa de Antecipa\u00E7\u00E3o de um Produto
   * Este recurso permite configurar a Taxa de Antecipa\u00E7\u00E3o de um Produto, a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id Id Produto
   * @param taxaAntecipacaoRequest taxaAntecipacaoRequest
   * @return ParametroProdutoResponse
   */
  public ParametroProdutoResponse configurarTaxaAntecipacaoProduto(Long id, TaxaAntecipacaoRequest taxaAntecipacaoRequest) throws ApiException {
    Object postBody = taxaAntecipacaoRequest;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling configurarTaxaAntecipacaoProduto");
     }
     
     // verify the required parameter 'taxaAntecipacaoRequest' is set
     if (taxaAntecipacaoRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'taxaAntecipacaoRequest' when calling configurarTaxaAntecipacaoProduto");
     }
     
    // create path and map variables
    String path = "/api/produtos/{id}/configurar-taxa-antecipacao".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<ParametroProdutoResponse> returnType = new GenericType<ParametroProdutoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta a Taxa de Antecipa\u00E7\u00E3o de um Produto
   * Este recurso permite consultar a Taxa de Antecipa\u00E7\u00E3o de um Produto, a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id Id Produto
   * @param tipoTransacao Tipo da Transa\u00E7\u00E3o (ON-US ou OFF-US)
   * @return ParametroProdutoResponse
   */
  public ParametroProdutoResponse consultarTaxaAntecipacaoProduto(Long id, String tipoTransacao) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTaxaAntecipacaoProduto");
     }
     
     // verify the required parameter 'tipoTransacao' is set
     if (tipoTransacao == null) {
        throw new ApiException(400, "Missing the required parameter 'tipoTransacao' when calling consultarTaxaAntecipacaoProduto");
     }
     
    // create path and map variables
    String path = "/api/produtos/{id}/consultar-taxa-antecipacao".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "tipoTransacao", tipoTransacao));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<ParametroProdutoResponse> returnType = new GenericType<ParametroProdutoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Faz a efetiva\u00E7\u00E3o da antecipa\u00E7\u00E3o
   * M\u00E9todo responsavel pela efetiva\u00E7\u00E3o da antecipa\u00E7\u00E3o, cujo desconto \u00E9 calculado baseado na data da \u00FAltima parcela em aberto
   * @param idConta C\u00F3digo de Identifica\u00E7\u00E3o da Conta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do evento
   * @param quantidadeParcelas Quantidade de parcelas para serem antecipadas
   * @param complemento Dados complementares sobre a realiza\u00E7\u00E3o da transa\u00E7\u00E3o
   * @param juros Indica o tipo de evento pesquisado: 0 = Sem juros, 1 = Com juros, 2 = ambos. O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 0 (sem juros)
   * @param parcelado Indica se o evento pesquisado deve ser parcelado. 0 = Sem ser parcelado, 1 = parcelado, 2 = ambos.  O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 1 (parcelado)
   * @return AntecipacaoResponse
   */
  public AntecipacaoResponse efetivarAntecipacaoCompra(Long idConta, Long id, Long quantidadeParcelas, String complemento, Integer juros, Integer parcelado) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling efetivarAntecipacaoCompra");
     }
     
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling efetivarAntecipacaoCompra");
     }
     
     // verify the required parameter 'quantidadeParcelas' is set
     if (quantidadeParcelas == null) {
        throw new ApiException(400, "Missing the required parameter 'quantidadeParcelas' when calling efetivarAntecipacaoCompra");
     }
     
    // create path and map variables
    String path = "/api/compras-antecipaveis/{id}/efetivar-antecipacao".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "quantidadeParcelas", quantidadeParcelas));
    
    queryParams.addAll(apiClient.parameterToPairs("", "complemento", complemento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "juros", juros));
    
    queryParams.addAll(apiClient.parameterToPairs("", "parcelado", parcelado));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<AntecipacaoResponse> returnType = new GenericType<AntecipacaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Faz a efetiva\u00E7\u00E3o da antecipa\u00E7\u00E3o
   * M\u00E9todo responsavel pela efetiva\u00E7\u00E3o da antecipa\u00E7\u00E3o, cujo desconto \u00E9 calculado baseado na data da \u00FAltima parcela em aberto
   * @param idConta C\u00F3digo de Identifica\u00E7\u00E3o da Conta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do evento
   * @param quantidadeParcelas Quantidade de parcelas para serem antecipadas
   * @param complemento Dados complementares sobre a realiza\u00E7\u00E3o da transa\u00E7\u00E3o
   * @param juros Indica o tipo de evento pesquisado: 0 = Sem juros, 1 = Com juros, 2 = ambos. O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 0 (sem juros)
   * @param parcelado Indica se o evento pesquisado deve ser parcelado. 0 = Sem ser parcelado, 1 = parcelado, 2 = ambos.  O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 1 (parcelado)
   * @return AntecipacaoResponse
   */
  public AntecipacaoResponse efetivarAntecipacaoCompra1(Long idConta, Long id, Long quantidadeParcelas, String complemento, Integer juros, Integer parcelado) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling efetivarAntecipacaoCompra1");
     }
     
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling efetivarAntecipacaoCompra1");
     }
     
     // verify the required parameter 'quantidadeParcelas' is set
     if (quantidadeParcelas == null) {
        throw new ApiException(400, "Missing the required parameter 'quantidadeParcelas' when calling efetivarAntecipacaoCompra1");
     }
     
    // create path and map variables
    String path = "/api/saques-antecipaveis/{id}/efetivar-antecipacao".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "quantidadeParcelas", quantidadeParcelas));
    
    queryParams.addAll(apiClient.parameterToPairs("", "complemento", complemento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "juros", juros));
    
    queryParams.addAll(apiClient.parameterToPairs("", "parcelado", parcelado));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<AntecipacaoResponse> returnType = new GenericType<AntecipacaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Faz a efetiva\u00E7\u00E3o da antecipa\u00E7\u00E3o
   * M\u00E9todo responsavel pela efetiva\u00E7\u00E3o de todas as compras antecip\u00E1veis com todas as parcelas de uma conta
   * @param idConta C\u00F3digo de Identifica\u00E7\u00E3o da Conta
   * @param complemento Dados complementares sobre a realiza\u00E7\u00E3o da transa\u00E7\u00E3o
   * @param juros Indica o tipo de evento pesquisado: 0 = Sem juros, 1 = Com juros, 2 = ambos. O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 0 (sem juros)
   * @param parcelado Indica se o evento pesquisado deve ser parcelado. 0 = Sem ser parcelado, 1 = parcelado, 2 = ambos.  O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 1 (parcelado)
   * @return AntecipacaoResponse
   */
  public AntecipacaoResponse efetivarAntecipacoesEmLotes(Long idConta, String complemento, Integer juros, Integer parcelado) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling efetivarAntecipacoesEmLotes");
     }
     
    // create path and map variables
    String path = "/api/compras-antecipaveis/efetivar-antecipacao".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "complemento", complemento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "juros", juros));
    
    queryParams.addAll(apiClient.parameterToPairs("", "parcelado", parcelado));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<AntecipacaoResponse> returnType = new GenericType<AntecipacaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Faz a efetiva\u00E7\u00E3o da antecipa\u00E7\u00E3o
   * M\u00E9todo responsavel pela efetiva\u00E7\u00E3o de todas os saques antecip\u00E1veis com todas as parcelas de uma conta
   * @param idConta C\u00F3digo de Identifica\u00E7\u00E3o da Conta
   * @param complemento Dados complementares sobre a realiza\u00E7\u00E3o da transa\u00E7\u00E3o
   * @param juros Indica o tipo de evento pesquisado: 0 = Sem juros, 1 = Com juros, 2 = ambos. O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 0 (sem juros)
   * @param parcelado Indica se o evento pesquisado deve ser parcelado. 0 = Sem ser parcelado, 1 = parcelado, 2 = ambos.  O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 1 (parcelado)
   * @return AntecipacaoResponse
   */
  public AntecipacaoResponse efetivarAntecipacoesEmLotes1(Long idConta, String complemento, Integer juros, Integer parcelado) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling efetivarAntecipacoesEmLotes1");
     }
     
    // create path and map variables
    String path = "/api/saques-antecipaveis/efetivar-antecipacao".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "complemento", complemento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "juros", juros));
    
    queryParams.addAll(apiClient.parameterToPairs("", "parcelado", parcelado));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<AntecipacaoResponse> returnType = new GenericType<AntecipacaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar compras com parcelas antecip\u00E1veis
   * Lista as compras antecip\u00E1veis de uma conta
   * @param idConta C\u00F3digo identificador da conta da Compra
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idCompra C\u00F3digo identificador da Compra
   * @param parcelada Indica se a compra \u00E9 parcelada
   * @param juros Indica se a compra \u00E9 com ou sem juros
   * @param tipoOrigemTransacao Indica se a compra \u00E9 ON-US ou OFF-US
   * @param dataCompraInicio Data de compra(in\u00EDcio)
   * @param dataCompraFim Data de compra(fim)
   * @return PageCompraResponse
   */
  public PageCompraResponse listarComprasAntecipaveis(Long idConta, List<String> sort, Integer page, Integer limit, Long idCompra, Boolean parcelada, Boolean juros, String tipoOrigemTransacao, String dataCompraInicio, String dataCompraFim) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling listarComprasAntecipaveis");
     }
     
    // create path and map variables
    String path = "/api/compras-antecipaveis".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idCompra", idCompra));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "parcelada", parcelada));
    
    queryParams.addAll(apiClient.parameterToPairs("", "juros", juros));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tipoOrigemTransacao", tipoOrigemTransacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCompraInicio", dataCompraInicio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCompraFim", dataCompraFim));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<PageCompraResponse> returnType = new GenericType<PageCompraResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar saques com parcelas antecip\u00E1veis
   * Lista os saques antecip\u00E1veis de uma conta
   * @param idConta C\u00F3digo identificador da conta da Compra
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idCompra C\u00F3digo identificador da Compra
   * @param parcelada Indica se a compra \u00E9 parcelada
   * @param juros Indica se a compra \u00E9 com ou sem juros
   * @param tipoOrigemTransacao Indica se a compra \u00E9 ON-US ou OFF-US
   * @param dataCompraInicio Data de compra(in\u00EDcio)
   * @param dataCompraFim Data de compra(fim)
   * @return PageCompraResponse
   */
  public PageCompraResponse listarComprasAntecipaveis1(Long idConta, List<String> sort, Integer page, Integer limit, Long idCompra, Boolean parcelada, Boolean juros, String tipoOrigemTransacao, String dataCompraInicio, String dataCompraFim) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling listarComprasAntecipaveis1");
     }
     
    // create path and map variables
    String path = "/api/saques-antecipaveis".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idCompra", idCompra));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "parcelada", parcelada));
    
    queryParams.addAll(apiClient.parameterToPairs("", "juros", juros));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tipoOrigemTransacao", tipoOrigemTransacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCompraInicio", dataCompraInicio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCompraFim", dataCompraFim));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<PageCompraResponse> returnType = new GenericType<PageCompraResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Simular antecipa\u00E7\u00E3o de parcelas
   * Simula a antecipa\u00E7\u00E3o de parcelas de um evento, listando todos os planos de parcelamento dispon\u00EDveis, cujo desconto \u00E9 calculado baseado na data da \u00FAltima parcela em aberto
   * @param idConta C\u00F3digo de identifica\u00E7\u00E3o da conta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do evento
   * @param complemento Dados complementares sobre a realiza\u00E7\u00E3o da transa\u00E7\u00E3o
   * @param juros Indica o tipo de evento pesquisado: 0 = Sem juros, 1 = Com juros, 2 = ambos. O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 0 (sem juros)
   * @param parcelado Indica se o evento pesquisado deve ser parcelado. 0 = Sem ser parcelado, 1 = parcelado, 2 = ambos.  O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 1 (parcelado)
   * @return AntecipacaoSimuladaResponse
   */
  public AntecipacaoSimuladaResponse simularAntecipacaoCompra(Long idConta, Long id, String complemento, Integer juros, Integer parcelado) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling simularAntecipacaoCompra");
     }
     
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling simularAntecipacaoCompra");
     }
     
    // create path and map variables
    String path = "/api/compras-antecipaveis/{id}/simular-antecipacao".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "complemento", complemento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "juros", juros));
    
    queryParams.addAll(apiClient.parameterToPairs("", "parcelado", parcelado));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<AntecipacaoSimuladaResponse> returnType = new GenericType<AntecipacaoSimuladaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Simular antecipa\u00E7\u00E3o de parcelas
   * Simula a antecipa\u00E7\u00E3o de parcelas de um evento, listando todos os planos de parcelamento dispon\u00EDveis, cujo desconto \u00E9 calculado baseado na data da \u00FAltima parcela em aberto
   * @param idConta C\u00F3digo de identifica\u00E7\u00E3o da conta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do evento
   * @param complemento Dados complementares sobre a realiza\u00E7\u00E3o da transa\u00E7\u00E3o
   * @param juros Indica o tipo de evento pesquisado: 0 = Sem juros, 1 = Com juros, 2 = ambos. O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 0 (sem juros)
   * @param parcelado Indica se o evento pesquisado deve ser parcelado. 0 = Sem ser parcelado, 1 = parcelado, 2 = ambos.  O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 1 (parcelado)
   * @return AntecipacaoSimuladaResponse
   */
  public AntecipacaoSimuladaResponse simularAntecipacaoCompra1(Long idConta, Long id, String complemento, Integer juros, Integer parcelado) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling simularAntecipacaoCompra1");
     }
     
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling simularAntecipacaoCompra1");
     }
     
    // create path and map variables
    String path = "/api/saques-antecipaveis/{id}/simular-antecipacao".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "complemento", complemento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "juros", juros));
    
    queryParams.addAll(apiClient.parameterToPairs("", "parcelado", parcelado));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<AntecipacaoSimuladaResponse> returnType = new GenericType<AntecipacaoSimuladaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Simular antecipa\u00E7\u00E3o de todas as parcelas antecip\u00E1veis
   * O recurso permite realizar a simula\u00E7\u00E3o da antecipa\u00E7\u00E3o de todas as compras antecip\u00E1veis de todas as parcelas de uma determinada conta
   * @param idConta C\u00F3digo de identifica\u00E7\u00E3o da conta
   * @param complemento Dados complementares sobre a realiza\u00E7\u00E3o da transa\u00E7\u00E3o
   * @param juros Indica o tipo de evento pesquisado: 0 = Sem juros, 1 = Com juros, 2 = ambos. O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 0 (sem juros)
   * @param parcelado Indica se o evento pesquisado deve ser parcelado. 0 = Sem ser parcelado, 1 = parcelado, 2 = ambos.  O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 1 (parcelado)
   * @return AntecipacaoSimuladaLoteResponse
   */
  public AntecipacaoSimuladaLoteResponse simularAntecipacoesEmLote(Long idConta, String complemento, Integer juros, Integer parcelado) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling simularAntecipacoesEmLote");
     }
     
    // create path and map variables
    String path = "/api/compras-antecipaveis/simular-antecipacao".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "complemento", complemento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "juros", juros));
    
    queryParams.addAll(apiClient.parameterToPairs("", "parcelado", parcelado));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<AntecipacaoSimuladaLoteResponse> returnType = new GenericType<AntecipacaoSimuladaLoteResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Simular antecipa\u00E7\u00E3o de todas as parcelas antecip\u00E1veis
   * O recurso permite realizar a simula\u00E7\u00E3o da antecipa\u00E7\u00E3o de todas os saques antecip\u00E1veis de todas as parcelas de uma determinada conta
   * @param idConta C\u00F3digo de identifica\u00E7\u00E3o da conta
   * @param complemento Dados complementares sobre a realiza\u00E7\u00E3o da transa\u00E7\u00E3o
   * @param juros Indica o tipo de evento pesquisado: 0 = Sem juros, 1 = Com juros, 2 = ambos. O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 0 (sem juros)
   * @param parcelado Indica se o evento pesquisado deve ser parcelado. 0 = Sem ser parcelado, 1 = parcelado, 2 = ambos.  O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 1 (parcelado)
   * @return AntecipacaoSimuladaLoteResponse
   */
  public AntecipacaoSimuladaLoteResponse simularAntecipacoesEmLote1(Long idConta, String complemento, Integer juros, Integer parcelado) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling simularAntecipacoesEmLote1");
     }
     
    // create path and map variables
    String path = "/api/saques-antecipaveis/simular-antecipacao".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "complemento", complemento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "juros", juros));
    
    queryParams.addAll(apiClient.parameterToPairs("", "parcelado", parcelado));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<AntecipacaoSimuladaLoteResponse> returnType = new GenericType<AntecipacaoSimuladaLoteResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
