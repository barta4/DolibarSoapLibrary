/**
 * Authentication.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.ual.itsi.dolibar.common;

public class Authentication  implements java.io.Serializable {
    private java.lang.String dolibarrkey;

    private java.lang.String sourceapplication;

    private java.lang.String login;

    private java.lang.String password;

    private java.lang.String entity;

    public Authentication() {
    }

    public Authentication(
           java.lang.String dolibarrkey,
           java.lang.String sourceapplication,
           java.lang.String login,
           java.lang.String password,
           java.lang.String entity) {
           this.dolibarrkey = dolibarrkey;
           this.sourceapplication = sourceapplication;
           this.login = login;
           this.password = password;
           this.entity = entity;
    }


    /**
     * Gets the dolibarrkey value for this Authentication.
     * 
     * @return dolibarrkey
     */
    public java.lang.String getDolibarrkey() {
        return dolibarrkey;
    }


    /**
     * Sets the dolibarrkey value for this Authentication.
     * 
     * @param dolibarrkey
     */
    public void setDolibarrkey(java.lang.String dolibarrkey) {
        this.dolibarrkey = dolibarrkey;
    }


    /**
     * Gets the sourceapplication value for this Authentication.
     * 
     * @return sourceapplication
     */
    public java.lang.String getSourceapplication() {
        return sourceapplication;
    }


    /**
     * Sets the sourceapplication value for this Authentication.
     * 
     * @param sourceapplication
     */
    public void setSourceapplication(java.lang.String sourceapplication) {
        this.sourceapplication = sourceapplication;
    }


    /**
     * Gets the login value for this Authentication.
     * 
     * @return login
     */
    public java.lang.String getLogin() {
        return login;
    }


    /**
     * Sets the login value for this Authentication.
     * 
     * @param login
     */
    public void setLogin(java.lang.String login) {
        this.login = login;
    }


    /**
     * Gets the password value for this Authentication.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this Authentication.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the entity value for this Authentication.
     * 
     * @return entity
     */
    public java.lang.String getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this Authentication.
     * 
     * @param entity
     */
    public void setEntity(java.lang.String entity) {
        this.entity = entity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Authentication)) return false;
        Authentication other = (Authentication) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dolibarrkey==null && other.getDolibarrkey()==null) || 
             (this.dolibarrkey!=null &&
              this.dolibarrkey.equals(other.getDolibarrkey()))) &&
            ((this.sourceapplication==null && other.getSourceapplication()==null) || 
             (this.sourceapplication!=null &&
              this.sourceapplication.equals(other.getSourceapplication()))) &&
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity())));
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
        if (getDolibarrkey() != null) {
            _hashCode += getDolibarrkey().hashCode();
        }
        if (getSourceapplication() != null) {
            _hashCode += getSourceapplication().hashCode();
        }
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Authentication.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.dolibarr.org/ns/", "authentication"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dolibarrkey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dolibarrkey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceapplication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceapplication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("", "login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entity"));
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
