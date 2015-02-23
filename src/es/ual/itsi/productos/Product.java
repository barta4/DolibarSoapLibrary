/**
 * Product.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.ual.itsi.productos;

import java.util.Calendar;

public class Product  implements java.io.Serializable {
    private java.lang.String id="";

    private java.lang.String ref="";

    private java.lang.String ref_ext="";

    private java.lang.String type="";

    private java.lang.String label="";

    private java.lang.String description="";

    private java.util.Calendar date_creation=Calendar.getInstance();

    private java.util.Calendar date_modification=Calendar.getInstance();

    private java.lang.String note="";

    private java.lang.String status_tobuy="";

    private java.lang.String status_tosell="";

    private java.lang.String barcode="";

    private java.lang.String barcode_type="";

    private java.lang.String country_id="";

    private java.lang.String country_code="";

    private java.lang.String customcode="";

    private java.lang.String price_net="";

    private java.lang.String price;

    private java.lang.String price_min_net="";

    private java.lang.String price_min="";

    private java.lang.String price_base_type="";

    private java.lang.String vat_rate="";

    private java.lang.String vat_npr="";

    private java.lang.String localtax1_tx="";

    private java.lang.String localtax2_tx="";

    private java.lang.String stock_alert="";

    private java.lang.String stock_real="";

    private java.lang.String stock_pmp="";

    private java.lang.String canvas="";

    private java.lang.String import_key="";

    private java.lang.String dir="";

    private es.ual.itsi.productos.Image[] images=new Image[0];

    public Product() {
    }

    public Product(
           java.lang.String id,
           java.lang.String ref,
           java.lang.String ref_ext,
           java.lang.String type,
           java.lang.String label,
           java.lang.String description,
           java.util.Calendar date_creation,
           java.util.Calendar date_modification,
           java.lang.String note,
           java.lang.String status_tobuy,
           java.lang.String status_tosell,
           java.lang.String barcode,
           java.lang.String barcode_type,
           java.lang.String country_id,
           java.lang.String country_code,
           java.lang.String customcode,
           java.lang.String price_net,
           java.lang.String price,
           java.lang.String price_min_net,
           java.lang.String price_min,
           java.lang.String price_base_type,
           java.lang.String vat_rate,
           java.lang.String vat_npr,
           java.lang.String localtax1_tx,
           java.lang.String localtax2_tx,
           java.lang.String stock_alert,
           java.lang.String stock_real,
           java.lang.String stock_pmp,
           java.lang.String canvas,
           java.lang.String import_key,
           java.lang.String dir,
           es.ual.itsi.productos.Image[] images) {
           this.id = id;
           this.ref = ref;
           this.ref_ext = ref_ext;
           this.type = type;
           this.label = label;
           this.description = description;
           this.date_creation = date_creation;
           this.date_modification = date_modification;
           this.note = note;
           this.status_tobuy = status_tobuy;
           this.status_tosell = status_tosell;
           this.barcode = barcode;
           this.barcode_type = barcode_type;
           this.country_id = country_id;
           this.country_code = country_code;
           this.customcode = customcode;
           this.price_net = price_net;
           this.price = price;
           this.price_min_net = price_min_net;
           this.price_min = price_min;
           this.price_base_type = price_base_type;
           this.vat_rate = vat_rate;
           this.vat_npr = vat_npr;
           this.localtax1_tx = localtax1_tx;
           this.localtax2_tx = localtax2_tx;
           this.stock_alert = stock_alert;
           this.stock_real = stock_real;
           this.stock_pmp = stock_pmp;
           this.canvas = canvas;
           this.import_key = import_key;
           this.dir = dir;
           this.images = images;
    }


    /**
     * Gets the id value for this Product.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Product.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the ref value for this Product.
     * 
     * @return ref
     */
    public java.lang.String getRef() {
        return ref;
    }


    /**
     * Sets the ref value for this Product.
     * 
     * @param ref
     */
    public void setRef(java.lang.String ref) {
        this.ref = ref;
    }


    /**
     * Gets the ref_ext value for this Product.
     * 
     * @return ref_ext
     */
    public java.lang.String getRef_ext() {
        return ref_ext;
    }


    /**
     * Sets the ref_ext value for this Product.
     * 
     * @param ref_ext
     */
    public void setRef_ext(java.lang.String ref_ext) {
        this.ref_ext = ref_ext;
    }


    /**
     * Gets the type value for this Product.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Product.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the label value for this Product.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this Product.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the description value for this Product.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Product.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the date_creation value for this Product.
     * 
     * @return date_creation
     */
    public java.util.Calendar getDate_creation() {
        return date_creation;
    }


    /**
     * Sets the date_creation value for this Product.
     * 
     * @param date_creation
     */
    public void setDate_creation(java.util.Calendar date_creation) {
        this.date_creation = date_creation;
    }


    /**
     * Gets the date_modification value for this Product.
     * 
     * @return date_modification
     */
    public java.util.Calendar getDate_modification() {
        return date_modification;
    }


    /**
     * Sets the date_modification value for this Product.
     * 
     * @param date_modification
     */
    public void setDate_modification(java.util.Calendar date_modification) {
        this.date_modification = date_modification;
    }


    /**
     * Gets the note value for this Product.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this Product.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the status_tobuy value for this Product.
     * 
     * @return status_tobuy
     */
    public java.lang.String getStatus_tobuy() {
        return status_tobuy;
    }


    /**
     * Sets the status_tobuy value for this Product.
     * 
     * @param status_tobuy
     */
    public void setStatus_tobuy(java.lang.String status_tobuy) {
        this.status_tobuy = status_tobuy;
    }


    /**
     * Gets the status_tosell value for this Product.
     * 
     * @return status_tosell
     */
    public java.lang.String getStatus_tosell() {
        return status_tosell;
    }


    /**
     * Sets the status_tosell value for this Product.
     * 
     * @param status_tosell
     */
    public void setStatus_tosell(java.lang.String status_tosell) {
        this.status_tosell = status_tosell;
    }


    /**
     * Gets the barcode value for this Product.
     * 
     * @return barcode
     */
    public java.lang.String getBarcode() {
        return barcode;
    }


    /**
     * Sets the barcode value for this Product.
     * 
     * @param barcode
     */
    public void setBarcode(java.lang.String barcode) {
        this.barcode = barcode;
    }


    /**
     * Gets the barcode_type value for this Product.
     * 
     * @return barcode_type
     */
    public java.lang.String getBarcode_type() {
        return barcode_type;
    }


    /**
     * Sets the barcode_type value for this Product.
     * 
     * @param barcode_type
     */
    public void setBarcode_type(java.lang.String barcode_type) {
        this.barcode_type = barcode_type;
    }


    /**
     * Gets the country_id value for this Product.
     * 
     * @return country_id
     */
    public java.lang.String getCountry_id() {
        return country_id;
    }


    /**
     * Sets the country_id value for this Product.
     * 
     * @param country_id
     */
    public void setCountry_id(java.lang.String country_id) {
        this.country_id = country_id;
    }


    /**
     * Gets the country_code value for this Product.
     * 
     * @return country_code
     */
    public java.lang.String getCountry_code() {
        return country_code;
    }


    /**
     * Sets the country_code value for this Product.
     * 
     * @param country_code
     */
    public void setCountry_code(java.lang.String country_code) {
        this.country_code = country_code;
    }


    /**
     * Gets the customcode value for this Product.
     * 
     * @return customcode
     */
    public java.lang.String getCustomcode() {
        return customcode;
    }


    /**
     * Sets the customcode value for this Product.
     * 
     * @param customcode
     */
    public void setCustomcode(java.lang.String customcode) {
        this.customcode = customcode;
    }


    /**
     * Gets the price_net value for this Product.
     * 
     * @return price_net
     */
    public java.lang.String getPrice_net() {
        return price_net;
    }


    /**
     * Sets the price_net value for this Product.
     * 
     * @param price_net
     */
    public void setPrice_net(java.lang.String price_net) {
        this.price_net = price_net;
    }


    /**
     * Gets the price value for this Product.
     * 
     * @return price
     */
    public java.lang.String getPrice() {
        return price;
    }


    /**
     * Sets the price value for this Product.
     * 
     * @param price
     */
    public void setPrice(java.lang.String price) {
        this.price = price;
    }


    /**
     * Gets the price_min_net value for this Product.
     * 
     * @return price_min_net
     */
    public java.lang.String getPrice_min_net() {
        return price_min_net;
    }


    /**
     * Sets the price_min_net value for this Product.
     * 
     * @param price_min_net
     */
    public void setPrice_min_net(java.lang.String price_min_net) {
        this.price_min_net = price_min_net;
    }


    /**
     * Gets the price_min value for this Product.
     * 
     * @return price_min
     */
    public java.lang.String getPrice_min() {
        return price_min;
    }


    /**
     * Sets the price_min value for this Product.
     * 
     * @param price_min
     */
    public void setPrice_min(java.lang.String price_min) {
        this.price_min = price_min;
    }


    /**
     * Gets the price_base_type value for this Product.
     * 
     * @return price_base_type
     */
    public java.lang.String getPrice_base_type() {
        return price_base_type;
    }


    /**
     * Sets the price_base_type value for this Product.
     * 
     * @param price_base_type
     */
    public void setPrice_base_type(java.lang.String price_base_type) {
        this.price_base_type = price_base_type;
    }


    /**
     * Gets the vat_rate value for this Product.
     * 
     * @return vat_rate
     */
    public java.lang.String getVat_rate() {
        return vat_rate;
    }


    /**
     * Sets the vat_rate value for this Product.
     * 
     * @param vat_rate
     */
    public void setVat_rate(java.lang.String vat_rate) {
        this.vat_rate = vat_rate;
    }


    /**
     * Gets the vat_npr value for this Product.
     * 
     * @return vat_npr
     */
    public java.lang.String getVat_npr() {
        return vat_npr;
    }


    /**
     * Sets the vat_npr value for this Product.
     * 
     * @param vat_npr
     */
    public void setVat_npr(java.lang.String vat_npr) {
        this.vat_npr = vat_npr;
    }


    /**
     * Gets the localtax1_tx value for this Product.
     * 
     * @return localtax1_tx
     */
    public java.lang.String getLocaltax1_tx() {
        return localtax1_tx;
    }


    /**
     * Sets the localtax1_tx value for this Product.
     * 
     * @param localtax1_tx
     */
    public void setLocaltax1_tx(java.lang.String localtax1_tx) {
        this.localtax1_tx = localtax1_tx;
    }


    /**
     * Gets the localtax2_tx value for this Product.
     * 
     * @return localtax2_tx
     */
    public java.lang.String getLocaltax2_tx() {
        return localtax2_tx;
    }


    /**
     * Sets the localtax2_tx value for this Product.
     * 
     * @param localtax2_tx
     */
    public void setLocaltax2_tx(java.lang.String localtax2_tx) {
        this.localtax2_tx = localtax2_tx;
    }


    /**
     * Gets the stock_alert value for this Product.
     * 
     * @return stock_alert
     */
    public java.lang.String getStock_alert() {
        return stock_alert;
    }


    /**
     * Sets the stock_alert value for this Product.
     * 
     * @param stock_alert
     */
    public void setStock_alert(java.lang.String stock_alert) {
        this.stock_alert = stock_alert;
    }


    /**
     * Gets the stock_real value for this Product.
     * 
     * @return stock_real
     */
    public java.lang.String getStock_real() {
        return stock_real;
    }


    /**
     * Sets the stock_real value for this Product.
     * 
     * @param stock_real
     */
    public void setStock_real(java.lang.String stock_real) {
        this.stock_real = stock_real;
    }


    /**
     * Gets the stock_pmp value for this Product.
     * 
     * @return stock_pmp
     */
    public java.lang.String getStock_pmp() {
        return stock_pmp;
    }


    /**
     * Sets the stock_pmp value for this Product.
     * 
     * @param stock_pmp
     */
    public void setStock_pmp(java.lang.String stock_pmp) {
        this.stock_pmp = stock_pmp;
    }


    /**
     * Gets the canvas value for this Product.
     * 
     * @return canvas
     */
    public java.lang.String getCanvas() {
        return canvas;
    }


    /**
     * Sets the canvas value for this Product.
     * 
     * @param canvas
     */
    public void setCanvas(java.lang.String canvas) {
        this.canvas = canvas;
    }


    /**
     * Gets the import_key value for this Product.
     * 
     * @return import_key
     */
    public java.lang.String getImport_key() {
        return import_key;
    }


    /**
     * Sets the import_key value for this Product.
     * 
     * @param import_key
     */
    public void setImport_key(java.lang.String import_key) {
        this.import_key = import_key;
    }


    /**
     * Gets the dir value for this Product.
     * 
     * @return dir
     */
    public java.lang.String getDir() {
        return dir;
    }


    /**
     * Sets the dir value for this Product.
     * 
     * @param dir
     */
    public void setDir(java.lang.String dir) {
        this.dir = dir;
    }


    /**
     * Gets the images value for this Product.
     * 
     * @return images
     */
    public es.ual.itsi.productos.Image[] getImages() {
        return images;
    }


    /**
     * Sets the images value for this Product.
     * 
     * @param images
     */
    public void setImages(es.ual.itsi.productos.Image[] images) {
        this.images = images;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Product)) return false;
        Product other = (Product) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.ref==null && other.getRef()==null) || 
             (this.ref!=null &&
              this.ref.equals(other.getRef()))) &&
            ((this.ref_ext==null && other.getRef_ext()==null) || 
             (this.ref_ext!=null &&
              this.ref_ext.equals(other.getRef_ext()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.date_creation==null && other.getDate_creation()==null) || 
             (this.date_creation!=null &&
              this.date_creation.equals(other.getDate_creation()))) &&
            ((this.date_modification==null && other.getDate_modification()==null) || 
             (this.date_modification!=null &&
              this.date_modification.equals(other.getDate_modification()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.status_tobuy==null && other.getStatus_tobuy()==null) || 
             (this.status_tobuy!=null &&
              this.status_tobuy.equals(other.getStatus_tobuy()))) &&
            ((this.status_tosell==null && other.getStatus_tosell()==null) || 
             (this.status_tosell!=null &&
              this.status_tosell.equals(other.getStatus_tosell()))) &&
            ((this.barcode==null && other.getBarcode()==null) || 
             (this.barcode!=null &&
              this.barcode.equals(other.getBarcode()))) &&
            ((this.barcode_type==null && other.getBarcode_type()==null) || 
             (this.barcode_type!=null &&
              this.barcode_type.equals(other.getBarcode_type()))) &&
            ((this.country_id==null && other.getCountry_id()==null) || 
             (this.country_id!=null &&
              this.country_id.equals(other.getCountry_id()))) &&
            ((this.country_code==null && other.getCountry_code()==null) || 
             (this.country_code!=null &&
              this.country_code.equals(other.getCountry_code()))) &&
            ((this.customcode==null && other.getCustomcode()==null) || 
             (this.customcode!=null &&
              this.customcode.equals(other.getCustomcode()))) &&
            ((this.price_net==null && other.getPrice_net()==null) || 
             (this.price_net!=null &&
              this.price_net.equals(other.getPrice_net()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.price_min_net==null && other.getPrice_min_net()==null) || 
             (this.price_min_net!=null &&
              this.price_min_net.equals(other.getPrice_min_net()))) &&
            ((this.price_min==null && other.getPrice_min()==null) || 
             (this.price_min!=null &&
              this.price_min.equals(other.getPrice_min()))) &&
            ((this.price_base_type==null && other.getPrice_base_type()==null) || 
             (this.price_base_type!=null &&
              this.price_base_type.equals(other.getPrice_base_type()))) &&
            ((this.vat_rate==null && other.getVat_rate()==null) || 
             (this.vat_rate!=null &&
              this.vat_rate.equals(other.getVat_rate()))) &&
            ((this.vat_npr==null && other.getVat_npr()==null) || 
             (this.vat_npr!=null &&
              this.vat_npr.equals(other.getVat_npr()))) &&
            ((this.localtax1_tx==null && other.getLocaltax1_tx()==null) || 
             (this.localtax1_tx!=null &&
              this.localtax1_tx.equals(other.getLocaltax1_tx()))) &&
            ((this.localtax2_tx==null && other.getLocaltax2_tx()==null) || 
             (this.localtax2_tx!=null &&
              this.localtax2_tx.equals(other.getLocaltax2_tx()))) &&
            ((this.stock_alert==null && other.getStock_alert()==null) || 
             (this.stock_alert!=null &&
              this.stock_alert.equals(other.getStock_alert()))) &&
            ((this.stock_real==null && other.getStock_real()==null) || 
             (this.stock_real!=null &&
              this.stock_real.equals(other.getStock_real()))) &&
            ((this.stock_pmp==null && other.getStock_pmp()==null) || 
             (this.stock_pmp!=null &&
              this.stock_pmp.equals(other.getStock_pmp()))) &&
            ((this.canvas==null && other.getCanvas()==null) || 
             (this.canvas!=null &&
              this.canvas.equals(other.getCanvas()))) &&
            ((this.import_key==null && other.getImport_key()==null) || 
             (this.import_key!=null &&
              this.import_key.equals(other.getImport_key()))) &&
            ((this.dir==null && other.getDir()==null) || 
             (this.dir!=null &&
              this.dir.equals(other.getDir()))) &&
            ((this.images==null && other.getImages()==null) || 
             (this.images!=null &&
              java.util.Arrays.equals(this.images, other.getImages())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getRef() != null) {
            _hashCode += getRef().hashCode();
        }
        if (getRef_ext() != null) {
            _hashCode += getRef_ext().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDate_creation() != null) {
            _hashCode += getDate_creation().hashCode();
        }
        if (getDate_modification() != null) {
            _hashCode += getDate_modification().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getStatus_tobuy() != null) {
            _hashCode += getStatus_tobuy().hashCode();
        }
        if (getStatus_tosell() != null) {
            _hashCode += getStatus_tosell().hashCode();
        }
        if (getBarcode() != null) {
            _hashCode += getBarcode().hashCode();
        }
        if (getBarcode_type() != null) {
            _hashCode += getBarcode_type().hashCode();
        }
        if (getCountry_id() != null) {
            _hashCode += getCountry_id().hashCode();
        }
        if (getCountry_code() != null) {
            _hashCode += getCountry_code().hashCode();
        }
        if (getCustomcode() != null) {
            _hashCode += getCustomcode().hashCode();
        }
        if (getPrice_net() != null) {
            _hashCode += getPrice_net().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getPrice_min_net() != null) {
            _hashCode += getPrice_min_net().hashCode();
        }
        if (getPrice_min() != null) {
            _hashCode += getPrice_min().hashCode();
        }
        if (getPrice_base_type() != null) {
            _hashCode += getPrice_base_type().hashCode();
        }
        if (getVat_rate() != null) {
            _hashCode += getVat_rate().hashCode();
        }
        if (getVat_npr() != null) {
            _hashCode += getVat_npr().hashCode();
        }
        if (getLocaltax1_tx() != null) {
            _hashCode += getLocaltax1_tx().hashCode();
        }
        if (getLocaltax2_tx() != null) {
            _hashCode += getLocaltax2_tx().hashCode();
        }
        if (getStock_alert() != null) {
            _hashCode += getStock_alert().hashCode();
        }
        if (getStock_real() != null) {
            _hashCode += getStock_real().hashCode();
        }
        if (getStock_pmp() != null) {
            _hashCode += getStock_pmp().hashCode();
        }
        if (getCanvas() != null) {
            _hashCode += getCanvas().hashCode();
        }
        if (getImport_key() != null) {
            _hashCode += getImport_key().hashCode();
        }
        if (getDir() != null) {
            _hashCode += getDir().hashCode();
        }
        if (getImages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Product.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.dolibarr.org/ns/", "product"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ref");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ref_ext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ref_ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_creation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_creation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_modification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_modification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("", "note"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "barcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barcode_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "barcode_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price_net");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price_net"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price_min_net");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price_min_net"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price_min");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price_min"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price_base_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price_base_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vat_rate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vat_rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vat_npr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vat_npr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localtax1_tx");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localtax1_tx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localtax2_tx");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localtax2_tx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stock_alert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stock_alert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stock_real");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stock_real"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stock_pmp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stock_pmp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canvas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "canvas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("import_key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "import_key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dir");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("images");
        elemField.setXmlName(new javax.xml.namespace.QName("", "images"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.dolibarr.org/ns/", "image"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "image"));
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
