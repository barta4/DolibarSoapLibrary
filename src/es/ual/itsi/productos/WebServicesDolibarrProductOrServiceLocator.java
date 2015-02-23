/**
 * WebServicesDolibarrProductOrServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.ual.itsi.productos;

public class WebServicesDolibarrProductOrServiceLocator extends org.apache.axis.client.Service implements es.ual.itsi.productos.WebServicesDolibarrProductOrService {

    public WebServicesDolibarrProductOrServiceLocator() {
    }


    public WebServicesDolibarrProductOrServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebServicesDolibarrProductOrServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebServicesDolibarrProductOrServicePort
    private java.lang.String WebServicesDolibarrProductOrServicePort_address = "http://rpbian.ddns.net/dolibarr/htdocs/webservices/server_productorservice.php";

    public java.lang.String getWebServicesDolibarrProductOrServicePortAddress() {
        return WebServicesDolibarrProductOrServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebServicesDolibarrProductOrServicePortWSDDServiceName = "WebServicesDolibarrProductOrServicePort";

    public java.lang.String getWebServicesDolibarrProductOrServicePortWSDDServiceName() {
        return WebServicesDolibarrProductOrServicePortWSDDServiceName;
    }

    public void setWebServicesDolibarrProductOrServicePortWSDDServiceName(java.lang.String name) {
        WebServicesDolibarrProductOrServicePortWSDDServiceName = name;
    }

    public es.ual.itsi.productos.WebServicesDolibarrProductOrServicePortType getWebServicesDolibarrProductOrServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebServicesDolibarrProductOrServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebServicesDolibarrProductOrServicePort(endpoint);
    }

    public es.ual.itsi.productos.WebServicesDolibarrProductOrServicePortType getWebServicesDolibarrProductOrServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            es.ual.itsi.productos.WebServicesDolibarrProductOrServiceBindingStub _stub = new es.ual.itsi.productos.WebServicesDolibarrProductOrServiceBindingStub(portAddress, this);
            _stub.setPortName(getWebServicesDolibarrProductOrServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebServicesDolibarrProductOrServicePortEndpointAddress(java.lang.String address) {
        WebServicesDolibarrProductOrServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (es.ual.itsi.productos.WebServicesDolibarrProductOrServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                es.ual.itsi.productos.WebServicesDolibarrProductOrServiceBindingStub _stub = new es.ual.itsi.productos.WebServicesDolibarrProductOrServiceBindingStub(new java.net.URL(WebServicesDolibarrProductOrServicePort_address), this);
                _stub.setPortName(getWebServicesDolibarrProductOrServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WebServicesDolibarrProductOrServicePort".equals(inputPortName)) {
            return getWebServicesDolibarrProductOrServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.dolibarr.org/ns/", "WebServicesDolibarrProductOrService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.dolibarr.org/ns/", "WebServicesDolibarrProductOrServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebServicesDolibarrProductOrServicePort".equals(portName)) {
            setWebServicesDolibarrProductOrServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
