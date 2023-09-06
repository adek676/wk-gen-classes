
package eu.europa.eidas.saml_extensions;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.eidas.saml_extensions package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SPType_QNAME = new QName("http://eidas.europa.eu/saml-extensions", "SPType");
    private final static QName _RequestedAttributes_QNAME = new QName("http://eidas.europa.eu/saml-extensions", "RequestedAttributes");
    private final static QName _RequestedAttribute_QNAME = new QName("http://eidas.europa.eu/saml-extensions", "RequestedAttribute");
    private final static QName _AttributeValue_QNAME = new QName("http://eidas.europa.eu/saml-extensions", "AttributeValue");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.eidas.saml_extensions
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestedAttributesType }
     * 
     */
    public RequestedAttributesType createRequestedAttributesType() {
        return new RequestedAttributesType();
    }

    /**
     * Create an instance of {@link RequestedAttributeType }
     * 
     */
    public RequestedAttributeType createRequestedAttributeType() {
        return new RequestedAttributeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SPTypeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SPTypeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://eidas.europa.eu/saml-extensions", name = "SPType")
    public JAXBElement<SPTypeType> createSPType(SPTypeType value) {
        return new JAXBElement<SPTypeType>(_SPType_QNAME, SPTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestedAttributesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestedAttributesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://eidas.europa.eu/saml-extensions", name = "RequestedAttributes")
    public JAXBElement<RequestedAttributesType> createRequestedAttributes(RequestedAttributesType value) {
        return new JAXBElement<RequestedAttributesType>(_RequestedAttributes_QNAME, RequestedAttributesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestedAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestedAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://eidas.europa.eu/saml-extensions", name = "RequestedAttribute")
    public JAXBElement<RequestedAttributeType> createRequestedAttribute(RequestedAttributeType value) {
        return new JAXBElement<RequestedAttributeType>(_RequestedAttribute_QNAME, RequestedAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://eidas.europa.eu/saml-extensions", name = "AttributeValue")
    public JAXBElement<Object> createAttributeValue(Object value) {
        return new JAXBElement<Object>(_AttributeValue_QNAME, Object.class, null, value);
    }

}
