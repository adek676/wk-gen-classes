
package org.w3._2009.xmlenc11_;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PBKDF2ParameterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PBKDF2ParameterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Salt"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="Specified" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *                   &lt;element name="OtherSource" type="{http://www.w3.org/2009/xmlenc11#}AlgorithmIdentifierType"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IterationCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="KeyLength" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="PRF" type="{http://www.w3.org/2009/xmlenc11#}PRFAlgorithmIdentifierType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PBKDF2ParameterType", propOrder = {
    "salt",
    "iterationCount",
    "keyLength",
    "prf"
})
public class PBKDF2ParameterType {

    @XmlElement(name = "Salt", required = true)
    protected PBKDF2ParameterType.Salt salt;
    @XmlElement(name = "IterationCount", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger iterationCount;
    @XmlElement(name = "KeyLength", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger keyLength;
    @XmlElement(name = "PRF", required = true)
    protected PRFAlgorithmIdentifierType prf;

    /**
     * Gets the value of the salt property.
     * 
     * @return
     *     possible object is
     *     {@link PBKDF2ParameterType.Salt }
     *     
     */
    public PBKDF2ParameterType.Salt getSalt() {
        return salt;
    }

    /**
     * Sets the value of the salt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PBKDF2ParameterType.Salt }
     *     
     */
    public void setSalt(PBKDF2ParameterType.Salt value) {
        this.salt = value;
    }

    /**
     * Gets the value of the iterationCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIterationCount() {
        return iterationCount;
    }

    /**
     * Sets the value of the iterationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIterationCount(BigInteger value) {
        this.iterationCount = value;
    }

    /**
     * Gets the value of the keyLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKeyLength() {
        return keyLength;
    }

    /**
     * Sets the value of the keyLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKeyLength(BigInteger value) {
        this.keyLength = value;
    }

    /**
     * Gets the value of the prf property.
     * 
     * @return
     *     possible object is
     *     {@link PRFAlgorithmIdentifierType }
     *     
     */
    public PRFAlgorithmIdentifierType getPRF() {
        return prf;
    }

    /**
     * Sets the value of the prf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRFAlgorithmIdentifierType }
     *     
     */
    public void setPRF(PRFAlgorithmIdentifierType value) {
        this.prf = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;element name="Specified" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
     *         &lt;element name="OtherSource" type="{http://www.w3.org/2009/xmlenc11#}AlgorithmIdentifierType"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "specified",
        "otherSource"
    })
    public static class Salt {

        @XmlElement(name = "Specified")
        protected byte[] specified;
        @XmlElement(name = "OtherSource")
        protected AlgorithmIdentifierType otherSource;

        /**
         * Gets the value of the specified property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getSpecified() {
            return specified;
        }

        /**
         * Sets the value of the specified property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setSpecified(byte[] value) {
            this.specified = value;
        }

        /**
         * Gets the value of the otherSource property.
         * 
         * @return
         *     possible object is
         *     {@link AlgorithmIdentifierType }
         *     
         */
        public AlgorithmIdentifierType getOtherSource() {
            return otherSource;
        }

        /**
         * Sets the value of the otherSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link AlgorithmIdentifierType }
         *     
         */
        public void setOtherSource(AlgorithmIdentifierType value) {
            this.otherSource = value;
        }

    }

}
