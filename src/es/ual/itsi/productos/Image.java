/**
 * Image.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.ual.itsi.productos;

public class Image  implements java.io.Serializable {
    private java.lang.String photo;

    private java.lang.String photo_vignette;

    private java.lang.String imgWidth;

    private java.lang.String imgHeight;

    public Image() {
    }

    public Image(
           java.lang.String photo,
           java.lang.String photo_vignette,
           java.lang.String imgWidth,
           java.lang.String imgHeight) {
           this.photo = photo;
           this.photo_vignette = photo_vignette;
           this.imgWidth = imgWidth;
           this.imgHeight = imgHeight;
    }


    /**
     * Gets the photo value for this Image.
     * 
     * @return photo
     */
    public java.lang.String getPhoto() {
        return photo;
    }


    /**
     * Sets the photo value for this Image.
     * 
     * @param photo
     */
    public void setPhoto(java.lang.String photo) {
        this.photo = photo;
    }


    /**
     * Gets the photo_vignette value for this Image.
     * 
     * @return photo_vignette
     */
    public java.lang.String getPhoto_vignette() {
        return photo_vignette;
    }


    /**
     * Sets the photo_vignette value for this Image.
     * 
     * @param photo_vignette
     */
    public void setPhoto_vignette(java.lang.String photo_vignette) {
        this.photo_vignette = photo_vignette;
    }


    /**
     * Gets the imgWidth value for this Image.
     * 
     * @return imgWidth
     */
    public java.lang.String getImgWidth() {
        return imgWidth;
    }


    /**
     * Sets the imgWidth value for this Image.
     * 
     * @param imgWidth
     */
    public void setImgWidth(java.lang.String imgWidth) {
        this.imgWidth = imgWidth;
    }


    /**
     * Gets the imgHeight value for this Image.
     * 
     * @return imgHeight
     */
    public java.lang.String getImgHeight() {
        return imgHeight;
    }


    /**
     * Sets the imgHeight value for this Image.
     * 
     * @param imgHeight
     */
    public void setImgHeight(java.lang.String imgHeight) {
        this.imgHeight = imgHeight;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Image)) return false;
        Image other = (Image) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.photo==null && other.getPhoto()==null) || 
             (this.photo!=null &&
              this.photo.equals(other.getPhoto()))) &&
            ((this.photo_vignette==null && other.getPhoto_vignette()==null) || 
             (this.photo_vignette!=null &&
              this.photo_vignette.equals(other.getPhoto_vignette()))) &&
            ((this.imgWidth==null && other.getImgWidth()==null) || 
             (this.imgWidth!=null &&
              this.imgWidth.equals(other.getImgWidth()))) &&
            ((this.imgHeight==null && other.getImgHeight()==null) || 
             (this.imgHeight!=null &&
              this.imgHeight.equals(other.getImgHeight())));
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
        if (getPhoto() != null) {
            _hashCode += getPhoto().hashCode();
        }
        if (getPhoto_vignette() != null) {
            _hashCode += getPhoto_vignette().hashCode();
        }
        if (getImgWidth() != null) {
            _hashCode += getImgWidth().hashCode();
        }
        if (getImgHeight() != null) {
            _hashCode += getImgHeight().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Image.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.dolibarr.org/ns/", "image"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("photo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "photo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("photo_vignette");
        elemField.setXmlName(new javax.xml.namespace.QName("", "photo_vignette"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imgWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imgWidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imgHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imgHeight"));
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
