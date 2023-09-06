
package eu.europa.eidas.attributes.naturalperson;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.eidas.attributes.naturalperson package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.eidas.attributes.naturalperson
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonIdentifierType }
     * 
     */
    public PersonIdentifierType createPersonIdentifierType() {
        return new PersonIdentifierType();
    }

    /**
     * Create an instance of {@link CurrentFamilyNameType }
     * 
     */
    public CurrentFamilyNameType createCurrentFamilyNameType() {
        return new CurrentFamilyNameType();
    }

    /**
     * Create an instance of {@link CurrentGivenNameType }
     * 
     */
    public CurrentGivenNameType createCurrentGivenNameType() {
        return new CurrentGivenNameType();
    }

    /**
     * Create an instance of {@link DateOfBirthType }
     * 
     */
    public DateOfBirthType createDateOfBirthType() {
        return new DateOfBirthType();
    }

    /**
     * Create an instance of {@link CurrentAddressStructuredType }
     * 
     */
    public CurrentAddressStructuredType createCurrentAddressStructuredType() {
        return new CurrentAddressStructuredType();
    }

    /**
     * Create an instance of {@link BirthNameType }
     * 
     */
    public BirthNameType createBirthNameType() {
        return new BirthNameType();
    }

    /**
     * Create an instance of {@link PlaceOfBirthType }
     * 
     */
    public PlaceOfBirthType createPlaceOfBirthType() {
        return new PlaceOfBirthType();
    }

}
