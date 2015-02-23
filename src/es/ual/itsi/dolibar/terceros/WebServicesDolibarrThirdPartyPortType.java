/**
 * WebServicesDolibarrThirdPartyPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.ual.itsi.dolibar.terceros;

public interface WebServicesDolibarrThirdPartyPortType extends java.rmi.Remote {

    /**
     * WS to get a thirdparty from its id, ref or ref_ext
     */
    public void getThirdParty(es.ual.itsi.dolibar.common.Authentication authentication, java.lang.String id, java.lang.String ref, java.lang.String ref_ext, es.ual.itsi.dolibar.holders.ResultHolder result, es.ual.itsi.dolibar.holders.ThirdpartyHolder thirdparty) throws java.rmi.RemoteException;

    /**
     * WS to create a thirdparty
     */
    public void createThirdParty(es.ual.itsi.dolibar.common.Authentication authentication, es.ual.itsi.dolibar.terceros.Thirdparty thirdparty, es.ual.itsi.dolibar.holders.ResultHolder result, javax.xml.rpc.holders.StringHolder id, javax.xml.rpc.holders.StringHolder ref) throws java.rmi.RemoteException;

    /**
     * WS to update a thirdparty
     */
    public void updateThirdParty(es.ual.itsi.dolibar.common.Authentication authentication, es.ual.itsi.dolibar.terceros.Thirdparty thirdparty, es.ual.itsi.dolibar.holders.ResultHolder result, javax.xml.rpc.holders.StringHolder id) throws java.rmi.RemoteException;

    /**
     * WS to get list of thirdparties id and ref
     */
    public void getListOfThirdParties(es.ual.itsi.dolibar.common.Authentication authentication, es.ual.itsi.dolibar.terceros.Filterthirdparty filterthirdparty, es.ual.itsi.dolibar.holders.ResultHolder result, es.ual.itsi.dolibar.holders.ThirdPartiesArray2Holder thirdparties) throws java.rmi.RemoteException;
}
