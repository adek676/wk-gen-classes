
package oasis.names.tc.saml._2_0.protocol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import eu.europa.eidas.saml_extensions.RequestedAttributesType;
import eu.europa.eidas.saml_extensions.SPTypeType;


/**
 * <p>Java class for ExtensionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtensionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://eidas.europa.eu/saml-extensions}SPType"/&gt;
 *         &lt;element ref="{http://eidas.europa.eu/saml-extensions}RequestedAttributes"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{http://coi.gov.pl/saml-extensions}CoiOperationContext"/&gt;
 *           &lt;element ref="{http://wb.kir.pl/saml-extensions}OperationContext"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionsType", propOrder = {
    "spType",
    "requestedAttributes",
    "coiOperationContext",
    "operationContext"
})
public class ExtensionsType {

    @XmlElement(name = "SPType", namespace = "http://eidas.europa.eu/saml-extensions", required = true)
    @XmlSchemaType(name = "string")
    protected SPTypeType spType;
    @XmlElement(name = "RequestedAttributes", namespace = "http://eidas.europa.eu/saml-extensions", required = true)
    protected RequestedAttributesType requestedAttributes;
    @XmlElement(name = "CoiOperationContext", namespace = "http://coi.gov.pl/saml-extensions")
    protected pl.gov.coi.saml_extensions.OperationContextType coiOperationContext;
    @XmlElement(name = "OperationContext", namespace = "http://wb.kir.pl/saml-extensions")
    protected pl.kir.wb.saml_extensions.OperationContextType operationContext;

    /**
     * Gets the value of the spType property.
     * 
     * @return
     *     possible object is
     *     {@link SPTypeType }
     *     
     */
    public SPTypeType getSPType() {
        return spType;
    }

    /**
     * Sets the value of the spType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPTypeType }
     *     
     */
    public void setSPType(SPTypeType value) {
        this.spType = value;
    }

    /**
     * Gets the value of the requestedAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedAttributesType }
     *     
     */
    public RequestedAttributesType getRequestedAttributes() {
        return requestedAttributes;
    }

    /**
     * Sets the value of the requestedAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedAttributesType }
     *     
     */
    public void setRequestedAttributes(RequestedAttributesType value) {
        this.requestedAttributes = value;
    }

    /**
     * Gets the value of the coiOperationContext property.
     * 
     * @return
     *     possible object is
     *     {@link pl.gov.coi.saml_extensions.OperationContextType }
     *     
     */
    public pl.gov.coi.saml_extensions.OperationContextType getCoiOperationContext() {
        return coiOperationContext;
    }

    /**
     * Sets the value of the coiOperationContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link pl.gov.coi.saml_extensions.OperationContextType }
     *     
     */
    public void setCoiOperationContext(pl.gov.coi.saml_extensions.OperationContextType value) {
        this.coiOperationContext = value;
    }

    /**
     * Gets the value of the operationContext property.
     * 
     * @return
     *     possible object is
     *     {@link pl.kir.wb.saml_extensions.OperationContextType }
     *     
     */
    public pl.kir.wb.saml_extensions.OperationContextType getOperationContext() {
        return operationContext;
    }

    /**
     * Sets the value of the operationContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link pl.kir.wb.saml_extensions.OperationContextType }
     *     
     */
    public void setOperationContext(pl.kir.wb.saml_extensions.OperationContextType value) {
        this.operationContext = value;
    }

}
