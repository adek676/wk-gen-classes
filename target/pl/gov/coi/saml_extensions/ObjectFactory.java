
package pl.gov.coi.saml_extensions;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.gov.coi.saml_extensions package. 
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

    private final static QName _CoiOperationContext_QNAME = new QName("http://coi.gov.pl/saml-extensions", "CoiOperationContext");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.gov.coi.saml_extensions
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OperationContextType }
     * 
     */
    public OperationContextType createOperationContextType() {
        return new OperationContextType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationContextType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperationContextType }{@code >}
     */
    @XmlElementDecl(namespace = "http://coi.gov.pl/saml-extensions", name = "CoiOperationContext")
    public JAXBElement<OperationContextType> createCoiOperationContext(OperationContextType value) {
        return new JAXBElement<OperationContextType>(_CoiOperationContext_QNAME, OperationContextType.class, null, value);
    }

}
