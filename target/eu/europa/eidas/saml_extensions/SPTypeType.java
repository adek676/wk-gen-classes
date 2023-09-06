
package eu.europa.eidas.saml_extensions;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SPTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SPTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="public"/&gt;
 *     &lt;enumeration value="private"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SPTypeType")
@XmlEnum
public enum SPTypeType {

    @XmlEnumValue("public")
    PUBLIC("public"),
    @XmlEnumValue("private")
    PRIVATE("private");
    private final String value;

    SPTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SPTypeType fromValue(String v) {
        for (SPTypeType c: SPTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
