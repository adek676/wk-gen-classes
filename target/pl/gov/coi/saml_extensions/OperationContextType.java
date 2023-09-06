
package pl.gov.coi.saml_extensions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationContextType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ContextClass" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ContextDescription" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DocumentID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationContextType")
public class OperationContextType {

    @XmlAttribute(name = "ContextClass", required = true)
    protected String contextClass;
    @XmlAttribute(name = "ContextDescription", required = true)
    protected String contextDescription;
    @XmlAttribute(name = "DocumentID", required = true)
    protected String documentID;

    /**
     * Gets the value of the contextClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextClass() {
        return contextClass;
    }

    /**
     * Sets the value of the contextClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextClass(String value) {
        this.contextClass = value;
    }

    /**
     * Gets the value of the contextDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextDescription() {
        return contextDescription;
    }

    /**
     * Sets the value of the contextDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextDescription(String value) {
        this.contextDescription = value;
    }

    /**
     * Gets the value of the documentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentID() {
        return documentID;
    }

    /**
     * Sets the value of the documentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentID(String value) {
        this.documentID = value;
    }

}
