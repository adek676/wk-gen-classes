
package eu.europa.eidas.attributes.naturalperson;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 *  Current given names of the natural person.
 * 			
 * 
 * <p>Java class for CurrentGivenNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrentGivenNameType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute ref="{http://eidas.europa.eu/attributes/naturalperson}LatinScript"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentGivenNameType", propOrder = {
    "value"
})
public class CurrentGivenNameType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "LatinScript", namespace = "http://eidas.europa.eu/attributes/naturalperson")
    protected Boolean latinScript;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the latinScript property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLatinScript() {
        if (latinScript == null) {
            return true;
        } else {
            return latinScript;
        }
    }

    /**
     * Sets the value of the latinScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLatinScript(Boolean value) {
        this.latinScript = value;
    }

}
