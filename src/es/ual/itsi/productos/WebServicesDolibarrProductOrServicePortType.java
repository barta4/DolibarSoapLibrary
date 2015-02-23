/**
 * WebServicesDolibarrProductOrServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.ual.itsi.productos;

import es.ual.itsi.dolibar.common.Authentication;

public interface WebServicesDolibarrProductOrServicePortType extends java.rmi.Remote {

    /**
     * WS to get product or service
     */
    public void getProductOrService(Authentication authentication, java.lang.String id, java.lang.String ref, java.lang.String ref_ext, java.lang.String lang, es.ual.itsi.productos.holders.ResultHolder result, es.ual.itsi.productos.holders.ProductHolder product) throws java.rmi.RemoteException;

    /**
     * WS to create a product or service
     */
    public void createProductOrService(Authentication authentication, es.ual.itsi.productos.Product product, es.ual.itsi.productos.holders.ResultHolder result, javax.xml.rpc.holders.StringHolder id) throws java.rmi.RemoteException;

    /**
     * WS to update a product or service
     */
    public void updateProductOrService(Authentication authentication, es.ual.itsi.productos.Product product, es.ual.itsi.productos.holders.ResultHolder result, javax.xml.rpc.holders.StringHolder id) throws java.rmi.RemoteException;

    /**
     * WS to delete a product or service
     */
    public void deleteProductOrService(Authentication authentication, java.lang.String listofid, es.ual.itsi.productos.holders.ResultHolder result, javax.xml.rpc.holders.IntHolder nbdeleted) throws java.rmi.RemoteException;

    /**
     * WS to get list of all products or services id and ref
     */
    public void getListOfProductsOrServices(Authentication authentication, es.ual.itsi.productos.Filterproduct filterproduct, es.ual.itsi.productos.holders.ResultHolder result, es.ual.itsi.productos.holders.ProductsArray2Holder products) throws java.rmi.RemoteException;

    /**
     * WS to get list of all products or services for a category
     */
    public void getProductsForCategory(Authentication authentication, java.lang.String id, java.lang.String lang, es.ual.itsi.productos.holders.ResultHolder result, es.ual.itsi.productos.holders.ProductsArray2Holder products) throws java.rmi.RemoteException;
}
