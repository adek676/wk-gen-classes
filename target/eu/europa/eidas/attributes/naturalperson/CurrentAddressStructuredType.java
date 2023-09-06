
package eu.europa.eidas.attributes.naturalperson;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Current address of the natural person.
 * 			
 * 
 * <p>Java class for CurrentAddressStructuredType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrentAddressStructuredType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PoBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocatorDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CvaddressArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Thoroughfare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdminunitFirstline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdminunitSecondline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentAddressStructuredType", propOrder = {
    "poBox",
    "locatorDesignator",
    "locatorName",
    "cvaddressArea",
    "thoroughfare",
    "postName",
    "adminunitFirstline",
    "adminunitSecondline",
    "postCode"
})
public class CurrentAddressStructuredType {

    @XmlElement(name = "PoBox")
    protected String poBox;
    @XmlElement(name = "LocatorDesignator")
    protected String locatorDesignator;
    @XmlElement(name = "LocatorName")
    protected String locatorName;
    @XmlElement(name = "CvaddressArea")
    protected String cvaddressArea;
    @XmlElement(name = "Thoroughfare")
    protected String thoroughfare;
    @XmlElement(name = "PostName")
    protected String postName;
    @XmlElement(name = "AdminunitFirstline")
    protected String adminunitFirstline;
    @XmlElement(name = "AdminunitSecondline")
    protected String adminunitSecondline;
    @XmlElement(name = "PostCode")
    protected String postCode;

    /**
     * Gets the value of the poBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoBox() {
        return poBox;
    }

    /**
     * Sets the value of the poBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoBox(String value) {
        this.poBox = value;
    }

    /**
     * Gets the value of the locatorDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocatorDesignator() {
        return locatorDesignator;
    }

    /**
     * Sets the value of the locatorDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocatorDesignator(String value) {
        this.locatorDesignator = value;
    }

    /**
     * Gets the value of the locatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocatorName() {
        return locatorName;
    }

    /**
     * Sets the value of the locatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocatorName(String value) {
        this.locatorName = value;
    }

    /**
     * Gets the value of the cvaddressArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvaddressArea() {
        return cvaddressArea;
    }

    /**
     * Sets the value of the cvaddressArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvaddressArea(String value) {
        this.cvaddressArea = value;
    }

    /**
     * Gets the value of the thoroughfare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThoroughfare() {
        return thoroughfare;
    }

    /**
     * Sets the value of the thoroughfare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThoroughfare(String value) {
        this.thoroughfare = value;
    }

    /**
     * Gets the value of the postName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostName() {
        return postName;
    }

    /**
     * Sets the value of the postName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostName(String value) {
        this.postName = value;
    }

    /**
     * Gets the value of the adminunitFirstline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminunitFirstline() {
        return adminunitFirstline;
    }

    /**
     * Sets the value of the adminunitFirstline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminunitFirstline(String value) {
        this.adminunitFirstline = value;
    }

    /**
     * Gets the value of the adminunitSecondline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminunitSecondline() {
        return adminunitSecondline;
    }

    /**
     * Sets the value of the adminunitSecondline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminunitSecondline(String value) {
        this.adminunitSecondline = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

}
