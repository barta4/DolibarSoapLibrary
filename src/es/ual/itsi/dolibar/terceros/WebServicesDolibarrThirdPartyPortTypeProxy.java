package es.ual.itsi.dolibar.terceros;

public class WebServicesDolibarrThirdPartyPortTypeProxy implements es.ual.itsi.dolibar.terceros.WebServicesDolibarrThirdPartyPortType {
  private String _endpoint = null;
  private es.ual.itsi.dolibar.terceros.WebServicesDolibarrThirdPartyPortType webServicesDolibarrThirdPartyPortType = null;
  
  public WebServicesDolibarrThirdPartyPortTypeProxy() {
    _initWebServicesDolibarrThirdPartyPortTypeProxy();
  }
  
  public WebServicesDolibarrThirdPartyPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebServicesDolibarrThirdPartyPortTypeProxy();
  }
  
  private void _initWebServicesDolibarrThirdPartyPortTypeProxy() {
    try {
      webServicesDolibarrThirdPartyPortType = (new es.ual.itsi.dolibar.terceros.WebServicesDolibarrThirdPartyLocator()).getWebServicesDolibarrThirdPartyPort();
      if (webServicesDolibarrThirdPartyPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webServicesDolibarrThirdPartyPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webServicesDolibarrThirdPartyPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webServicesDolibarrThirdPartyPortType != null)
      ((javax.xml.rpc.Stub)webServicesDolibarrThirdPartyPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public es.ual.itsi.dolibar.terceros.WebServicesDolibarrThirdPartyPortType getWebServicesDolibarrThirdPartyPortType() {
    if (webServicesDolibarrThirdPartyPortType == null)
      _initWebServicesDolibarrThirdPartyPortTypeProxy();
    return webServicesDolibarrThirdPartyPortType;
  }
  
  public void getThirdParty(es.ual.itsi.dolibar.common.Authentication authentication, java.lang.String id, java.lang.String ref, java.lang.String ref_ext, es.ual.itsi.dolibar.holders.ResultHolder result, es.ual.itsi.dolibar.holders.ThirdpartyHolder thirdparty) throws java.rmi.RemoteException{
    if (webServicesDolibarrThirdPartyPortType == null)
      _initWebServicesDolibarrThirdPartyPortTypeProxy();
    webServicesDolibarrThirdPartyPortType.getThirdParty(authentication, id, ref, ref_ext, result, thirdparty);
  }
  
  public void createThirdParty(es.ual.itsi.dolibar.common.Authentication authentication, es.ual.itsi.dolibar.terceros.Thirdparty thirdparty, es.ual.itsi.dolibar.holders.ResultHolder result, javax.xml.rpc.holders.StringHolder id, javax.xml.rpc.holders.StringHolder ref) throws java.rmi.RemoteException{
    if (webServicesDolibarrThirdPartyPortType == null)
      _initWebServicesDolibarrThirdPartyPortTypeProxy();
    webServicesDolibarrThirdPartyPortType.createThirdParty(authentication, thirdparty, result, id, ref);
  }
  
  public void updateThirdParty(es.ual.itsi.dolibar.common.Authentication authentication, es.ual.itsi.dolibar.terceros.Thirdparty thirdparty, es.ual.itsi.dolibar.holders.ResultHolder result, javax.xml.rpc.holders.StringHolder id) throws java.rmi.RemoteException{
    if (webServicesDolibarrThirdPartyPortType == null)
      _initWebServicesDolibarrThirdPartyPortTypeProxy();
    webServicesDolibarrThirdPartyPortType.updateThirdParty(authentication, thirdparty, result, id);
  }
  
  public void getListOfThirdParties(es.ual.itsi.dolibar.common.Authentication authentication, es.ual.itsi.dolibar.terceros.Filterthirdparty filterthirdparty, es.ual.itsi.dolibar.holders.ResultHolder result, es.ual.itsi.dolibar.holders.ThirdPartiesArray2Holder thirdparties) throws java.rmi.RemoteException{
    if (webServicesDolibarrThirdPartyPortType == null)
      _initWebServicesDolibarrThirdPartyPortTypeProxy();
    webServicesDolibarrThirdPartyPortType.getListOfThirdParties(authentication, filterthirdparty, result, thirdparties);
  }
  
  
}