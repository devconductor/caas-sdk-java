package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.MotivoFraudeUpdate;
import br.com.conductor.pier.api.v2.model.MotivoFraudeResponse;
import br.com.conductor.pier.api.v2.model.SuspeitaFraudeUpdate;
import br.com.conductor.pier.api.v2.model.SuspeitaFraudeResponse;
import br.com.conductor.pier.api.v2.model.MotivoFraudePersist;
import br.com.conductor.pier.api.v2.model.PageMotivoFraudeResponse;
import br.com.conductor.pier.api.v2.model.PageSuspeitaFraudeResponse;
import br.com.conductor.pier.api.v2.model.SuspeitaFraudePersist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class FraudeApi {
  private ApiClient apiClient;

  public FraudeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FraudeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Altera motivo fraude
   * Recurso altera\u00E7\u00F5es dos motivos fraude
   * @param id id
   * @param motivoFraudeUpdate motivoFraudeUpdate
   * @return MotivoFraudeResponse
   */
  public MotivoFraudeResponse alterarMotivoFraude(Long id, MotivoFraudeUpdate motivoFraudeUpdate) throws ApiException {
    Object postBody = motivoFraudeUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarMotivoFraude");
     }
     
     // verify the required parameter 'motivoFraudeUpdate' is set
     if (motivoFraudeUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'motivoFraudeUpdate' when calling alterarMotivoFraude");
     }
     
    // create path and map variables
    String path = "/api/fraudes/motivos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<MotivoFraudeResponse> returnType = new GenericType<MotivoFraudeResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Altera suspeita de fraude
   * Recurso para alterar uma suspeita de fraude
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da Suspeita de Fraude
   * @param suspeitaFraudeUpdate suspeitaFraudeUpdate
   * @return SuspeitaFraudeResponse
   */
  public SuspeitaFraudeResponse alterarSuspeitaFraude(Long id, SuspeitaFraudeUpdate suspeitaFraudeUpdate) throws ApiException {
    Object postBody = suspeitaFraudeUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarSuspeitaFraude");
     }
     
     // verify the required parameter 'suspeitaFraudeUpdate' is set
     if (suspeitaFraudeUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'suspeitaFraudeUpdate' when calling alterarSuspeitaFraude");
     }
     
    // create path and map variables
    String path = "/api/fraudes/suspeitas/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<SuspeitaFraudeResponse> returnType = new GenericType<SuspeitaFraudeResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastra motivo fraude
   * Recurso para cadastrar os motivos fraude
   * @param motivoFraudePersist motivoFraudePersist
   * @return MotivoFraudeResponse
   */
  public MotivoFraudeResponse cadastrarMotivoFraude(MotivoFraudePersist motivoFraudePersist) throws ApiException {
    Object postBody = motivoFraudePersist;
    
     // verify the required parameter 'motivoFraudePersist' is set
     if (motivoFraudePersist == null) {
        throw new ApiException(400, "Missing the required parameter 'motivoFraudePersist' when calling cadastrarMotivoFraude");
     }
     
    // create path and map variables
    String path = "/api/fraudes/motivos".replaceAll("\\{format\\}","json");

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

    
    GenericType<MotivoFraudeResponse> returnType = new GenericType<MotivoFraudeResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta motivo fraude
   * Recurso para consultar os motivos fraude
   * @param id id
   * @return MotivoFraudeResponse
   */
  public MotivoFraudeResponse consultarMotivoFraude(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarMotivoFraude");
     }
     
    // create path and map variables
    String path = "/api/fraudes/motivos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<MotivoFraudeResponse> returnType = new GenericType<MotivoFraudeResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta suspeita de fraude
   * Recurso para consultar suspeitas de fraude
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da Suspeita de Fraude
   * @return SuspeitaFraudeResponse
   */
  public SuspeitaFraudeResponse consultarSuspeitaFraude(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarSuspeitaFraude");
     }
     
    // create path and map variables
    String path = "/api/fraudes/suspeitas/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<SuspeitaFraudeResponse> returnType = new GenericType<SuspeitaFraudeResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista motivo fraude
   * Recurso que lista os motivos fraude
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param descricao Descri\u00E7\u00E3o motivo fraude
   * @return PageMotivoFraudeResponse
   */
  public PageMotivoFraudeResponse listarMotivoFraude(List<String> sort, Integer page, Integer limit, String descricao) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/fraudes/motivos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    

    

    

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

    
    GenericType<PageMotivoFraudeResponse> returnType = new GenericType<PageMotivoFraudeResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista suspeitas de fraude
   * Recursos para listagens das suspeitas de fraude
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idMotivoFraude C\u00F3digo de identifica\u00E7\u00E3o do motivo da suspeita de fraude
   * @param idPessoa C\u00F3digo de identifica\u00E7\u00E3o da pessoa com suspeita de fraude
   * @param dataSuspeitaFraudeInicial Data in\u00EDcio do per\u00EDodo da consulta
   * @param dataSuspeitaFraudeFinal Data fim do per\u00EDodo da consulta
   * @return PageSuspeitaFraudeResponse
   */
  public PageSuspeitaFraudeResponse listarSuspeitaFraude(List<String> sort, Integer page, Integer limit, Long idMotivoFraude, Long idPessoa, String dataSuspeitaFraudeInicial, String dataSuspeitaFraudeFinal) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/fraudes/suspeitas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idMotivoFraude", idMotivoFraude));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataSuspeitaFraudeInicial", dataSuspeitaFraudeInicial));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataSuspeitaFraudeFinal", dataSuspeitaFraudeFinal));
    

    

    

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

    
    GenericType<PageSuspeitaFraudeResponse> returnType = new GenericType<PageSuspeitaFraudeResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastra suspeita de fraude
   * Recurso para cadastrar as suspeitas de fraude
   * @param suspeitaFraudePersist suspeitaFraudePersist
   * @return SuspeitaFraudeResponse
   */
  public SuspeitaFraudeResponse salvarSuspeitaFraude(SuspeitaFraudePersist suspeitaFraudePersist) throws ApiException {
    Object postBody = suspeitaFraudePersist;
    
     // verify the required parameter 'suspeitaFraudePersist' is set
     if (suspeitaFraudePersist == null) {
        throw new ApiException(400, "Missing the required parameter 'suspeitaFraudePersist' when calling salvarSuspeitaFraude");
     }
     
    // create path and map variables
    String path = "/api/fraudes/suspeitas".replaceAll("\\{format\\}","json");

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

    
    GenericType<SuspeitaFraudeResponse> returnType = new GenericType<SuspeitaFraudeResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
