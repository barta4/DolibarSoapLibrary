/**
 * Filterproduct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.ual.itsi.productos;

public class Filterproduct  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String status_tobuy;

    private java.lang.String status_tosell;

    public Filterproduct() {
    }

    public Filterproduct(
           java.lang.String type,
           java.lang.String status_tobuy,
           java.lang.String status_tosell) {
           this.type = type;
           this.status_tobuy = status_tobuy;
           this.status_tosell = status_tosell;
    }


    /**
     * Gets the type value for this Filterproduct.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Filterproduct.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the status_tobuy value for this Filterproduct.
     * 
     * @return status_tobuy
     */
    public java.lang.String getStatus_tobuy() {
        return status_tobuy;
    }


    /**
     * Sets the status_tobuy value for this Filterproduct.
     * 
     * @param status_tobuy
     */
    public void setStatus_tobuy(java.lang.String status_tobuy) {
        this.status_tobuy = status_tobuy;
    }


    /**
     * Gets the status_tosell value for this Filterproduct.
     * 
     * @return status_tosell
     */
    public java.lang.String getStatus_tosell() {
        return status_tosell;
    }


    /**
     * Sets the status_tosell value for this Filterproduct.
     * 
     * @param status_tosell
     */
    public void setStatus_tosell(java.lang.String status_tosell) {
        this.status_tosell = status_tosell;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Filterproduct)) return false;
        Filterproduct other = (Filterproduct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.status_tobuy==null && other.getStatus_tobuy()==null) || 
             (this.status_tobuy!=null &&
              this.status_tobuy.equals(other.getStatus_tobuy()))) &&
            ((this.status_tosell==null && other.getStatus_tosell()==null) || 
             (this.status_tosell!=null &&
              this.status_tosell.equals(other.getStatus_tosell())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getStatus_tobuy() != null) {
            _hashCode += getStatus_tobuy().hashCode();
        }
        if (getStatus_tosell() != null) {
            _hashCode += getStatus_tosell().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Filterproduct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.dolibarr.org/ns/", "filterproduct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_tobuy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status_tobuy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_tosell");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status_tosell"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
