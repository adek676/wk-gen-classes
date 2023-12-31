
package org.w3._2009.xmlenc11_;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001._04.xmlenc_.ReferenceList;


/**
 * <p>Java class for DerivedKeyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DerivedKeyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.w3.org/2009/xmlenc11#}KeyDerivationMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.w3.org/2001/04/xmlenc#}ReferenceList" minOccurs="0"/&gt;
 *         &lt;element name="DerivedKeyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MasterKeyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Recipient" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivedKeyType", propOrder = {
    "keyDerivationMethod",
    "referenceList",
    "derivedKeyName",
    "masterKeyName"
})
public class DerivedKeyType {

    @XmlElement(name = "KeyDerivationMethod")
    protected KeyDerivationMethodType keyDerivationMethod;
    @XmlElement(name = "ReferenceList", namespace = "http://www.w3.org/2001/04/xmlenc#")
    protected ReferenceList referenceList;
    @XmlElement(name = "DerivedKeyName")
    protected String derivedKeyName;
    @XmlElement(name = "MasterKeyName")
    protected String masterKeyName;
    @XmlAttribute(name = "Recipient")
    protected String recipient;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "Type")
    @XmlSchemaType(name = "anyURI")
    protected String type;

    /**
     * Gets the value of the keyDerivationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link KeyDerivationMethodType }
     *     
     */
    public KeyDerivationMethodType getKeyDerivationMethod() {
        return keyDerivationMethod;
    }

    /**
     * Sets the value of the keyDerivationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyDerivationMethodType }
     *     
     */
    public void setKeyDerivationMethod(KeyDerivationMethodType value) {
        this.keyDerivationMethod = value;
    }

    /**
     * Gets the value of the referenceList property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceList }
     *     
     */
    public ReferenceList getReferenceList() {
        return referenceList;
    }

    /**
     * Sets the value of the referenceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceList }
     *     
     */
    public void setReferenceList(ReferenceList value) {
        this.referenceList = value;
    }

    /**
     * Gets the value of the derivedKeyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerivedKeyName() {
        return derivedKeyName;
    }

    /**
     * Sets the value of the derivedKeyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDerivedKeyName(String value) {
        this.derivedKeyName = value;
    }

    /**
     * Gets the value of the masterKeyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterKeyName() {
        return masterKeyName;
    }

    /**
     * Sets the value of the masterKeyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterKeyName(String value) {
        this.masterKeyName = value;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipient(String value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
