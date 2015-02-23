package es.ual.itsi.productos;

import es.ual.itsi.dolibar.common.Authentication;

public class WebServicesDolibarrProductOrServicePortTypeProxy implements es.ual.itsi.productos.WebServicesDolibarrProductOrServicePortType {
  private String _endpoint = null;
  private es.ual.itsi.productos.WebServicesDolibarrProductOrServicePortType webServicesDolibarrProductOrServicePortType = null;
  
  public WebServicesDolibarrProductOrServicePortTypeProxy() {
    _initWebServicesDolibarrProductOrServicePortTypeProxy();
  }
  
  public WebServicesDolibarrProductOrServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebServicesDolibarrProductOrServicePortTypeProxy();
  }
  
  private void _initWebServicesDolibarrProductOrServicePortTypeProxy() {
    try {
      webServicesDolibarrProductOrServicePortType = (new es.ual.itsi.productos.WebServicesDolibarrProductOrServiceLocator()).getWebServicesDolibarrProductOrServicePort();
      if (webServicesDolibarrProductOrServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webServicesDolibarrProductOrServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webServicesDolibarrProductOrServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webServicesDolibarrProductOrServicePortType != null)
      ((javax.xml.rpc.Stub)webServicesDolibarrProductOrServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public es.ual.itsi.productos.WebServicesDolibarrProductOrServicePortType getWebServicesDolibarrProductOrServicePortType() {
    if (webServicesDolibarrProductOrServicePortType == null)
      _initWebServicesDolibarrProductOrServicePortTypeProxy();
    return webServicesDolibarrProductOrServicePortType;
  }
  
  public void getProductOrService(Authentication authentication, java.lang.String id, java.lang.String ref, java.lang.String ref_ext, java.lang.String lang, es.ual.itsi.productos.holders.ResultHolder result, es.ual.itsi.productos.holders.ProductHolder product) throws java.rmi.RemoteException{
    if (webServicesDolibarrProductOrServicePortType == null)
      _initWebServicesDolibarrProductOrServicePortTypeProxy();
    webServicesDolibarrProductOrServicePortType.getProductOrService(authentication, id, ref, ref_ext, lang, result, product);
  }
  
  public void createProductOrService(Authentication authentication, es.ual.itsi.productos.Product product, es.ual.itsi.productos.holders.ResultHolder result, javax.xml.rpc.holders.StringHolder id) throws java.rmi.RemoteException{
    if (webServicesDolibarrProductOrServicePortType == null)
      _initWebServicesDolibarrProductOrServicePortTypeProxy();
    webServicesDolibarrProductOrServicePortType.createProductOrService(authentication, product, result, id);
  }
  
  public void updateProductOrService(Authentication authentication, es.ual.itsi.productos.Product product, es.ual.itsi.productos.holders.ResultHolder result, javax.xml.rpc.holders.StringHolder id) throws java.rmi.RemoteException{
    if (webServicesDolibarrProductOrServicePortType == null)
      _initWebServicesDolibarrProductOrServicePortTypeProxy();
    webServicesDolibarrProductOrServicePortType.updateProductOrService(authentication, product, result, id);
  }
  
  public void deleteProductOrService(Authentication authentication, java.lang.String listofid, es.ual.itsi.productos.holders.ResultHolder result, javax.xml.rpc.holders.IntHolder nbdeleted) throws java.rmi.RemoteException{
    if (webServicesDolibarrProductOrServicePortType == null)
      _initWebServicesDolibarrProductOrServicePortTypeProxy();
    webServicesDolibarrProductOrServicePortType.deleteProductOrService(authentication, listofid, result, nbdeleted);
  }
  
  public void getListOfProductsOrServices(Authentication authentication, es.ual.itsi.productos.Filterproduct filterproduct, es.ual.itsi.productos.holders.ResultHolder result, es.ual.itsi.productos.holders.ProductsArray2Holder products) throws java.rmi.RemoteException{
    if (webServicesDolibarrProductOrServicePortType == null)
      _initWebServicesDolibarrProductOrServicePortTypeProxy();
    webServicesDolibarrProductOrServicePortType.getListOfProductsOrServices(authentication, filterproduct, result, products);
  }
  
  public void getProductsForCategory(Authentication authentication, java.lang.String id, java.lang.String lang, es.ual.itsi.productos.holders.ResultHolder result, es.ual.itsi.productos.holders.ProductsArray2Holder products) throws java.rmi.RemoteException{
    if (webServicesDolibarrProductOrServicePortType == null)
      _initWebServicesDolibarrProductOrServicePortTypeProxy();
    webServicesDolibarrProductOrServicePortType.getProductsForCategory(authentication, id, lang, result, products);
  }
  
  
}