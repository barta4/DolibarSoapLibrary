/**
 * Result.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.ual.itsi.dolibar.terceros;

public class Result  implements java.io.Serializable {
    private java.lang.String result_code;

    private java.lang.String result_label;

    public Result() {
    }

    public Result(
           java.lang.String result_code,
           java.lang.String result_label) {
           this.result_code = result_code;
           this.result_label = result_label;
    }


    /**
     * Gets the result_code value for this Result.
     * 
     * @return result_code
     */
    public java.lang.String getResult_code() {
        return result_code;
    }


    /**
     * Sets the result_code value for this Result.
     * 
     * @param result_code
     */
    public void setResult_code(java.lang.String result_code) {
        this.result_code = result_code;
    }


    /**
     * Gets the result_label value for this Result.
     * 
     * @return result_label
     */
    public java.lang.String getResult_label() {
        return result_label;
    }


    /**
     * Sets the result_label value for this Result.
     * 
     * @param result_label
     */
    public void setResult_label(java.lang.String result_label) {
        this.result_label = result_label;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Result)) return false;
        Result other = (Result) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.result_code==null && other.getResult_code()==null) || 
             (this.result_code!=null &&
              this.result_code.equals(other.getResult_code()))) &&
            ((this.result_label==null && other.getResult_label()==null) || 
             (this.result_label!=null &&
              this.result_label.equals(other.getResult_label())));
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
        if (getResult_code() != null) {
            _hashCode += getResult_code().hashCode();
        }
        if (getResult_label() != null) {
            _hashCode += getResult_label().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Result.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.dolibarr.org/ns/", "result"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "result_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result_label");
        elemField.setXmlName(new javax.xml.namespace.QName("", "result_label"));
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
