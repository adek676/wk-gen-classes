
package org.w3._2009.xmlenc11_;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2000._09.xmldsig_.DigestMethodType;


/**
 * <p>Java class for ConcatKDFParamsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConcatKDFParamsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}DigestMethod"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AlgorithmID" type="{http://www.w3.org/2001/XMLSchema}hexBinary" /&gt;
 *       &lt;attribute name="PartyUInfo" type="{http://www.w3.org/2001/XMLSchema}hexBinary" /&gt;
 *       &lt;attribute name="PartyVInfo" type="{http://www.w3.org/2001/XMLSchema}hexBinary" /&gt;
 *       &lt;attribute name="SuppPubInfo" type="{http://www.w3.org/2001/XMLSchema}hexBinary" /&gt;
 *       &lt;attribute name="SuppPrivInfo" type="{http://www.w3.org/2001/XMLSchema}hexBinary" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConcatKDFParamsType", propOrder = {
    "digestMethod"
})
public class ConcatKDFParamsType {

    @XmlElement(name = "DigestMethod", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected DigestMethodType digestMethod;
    @XmlAttribute(name = "AlgorithmID")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] algorithmID;
    @XmlAttribute(name = "PartyUInfo")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] partyUInfo;
    @XmlAttribute(name = "PartyVInfo")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] partyVInfo;
    @XmlAttribute(name = "SuppPubInfo")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] suppPubInfo;
    @XmlAttribute(name = "SuppPrivInfo")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] suppPrivInfo;

    /**
     * Gets the value of the digestMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DigestMethodType }
     *     
     */
    public DigestMethodType getDigestMethod() {
        return digestMethod;
    }

    /**
     * Sets the value of the digestMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigestMethodType }
     *     
     */
    public void setDigestMethod(DigestMethodType value) {
        this.digestMethod = value;
    }

    /**
     * Gets the value of the algorithmID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getAlgorithmID() {
        return algorithmID;
    }

    /**
     * Sets the value of the algorithmID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgorithmID(byte[] value) {
        this.algorithmID = value;
    }

    /**
     * Gets the value of the partyUInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getPartyUInfo() {
        return partyUInfo;
    }

    /**
     * Sets the value of the partyUInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyUInfo(byte[] value) {
        this.partyUInfo = value;
    }

    /**
     * Gets the value of the partyVInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getPartyVInfo() {
        return partyVInfo;
    }

    /**
     * Sets the value of the partyVInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyVInfo(byte[] value) {
        this.partyVInfo = value;
    }

    /**
     * Gets the value of the suppPubInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSuppPubInfo() {
        return suppPubInfo;
    }

    /**
     * Sets the value of the suppPubInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppPubInfo(byte[] value) {
        this.suppPubInfo = value;
    }

    /**
     * Gets the value of the suppPrivInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSuppPrivInfo() {
        return suppPrivInfo;
    }

    /**
     * Sets the value of the suppPrivInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppPrivInfo(byte[] value) {
        this.suppPrivInfo = value;
    }

}
