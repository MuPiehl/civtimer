//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.01.25 um 08:07:16 PM CET 
//


package de.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TKunde complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TKunde">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nummer_t" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="name_t" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="vorname_t" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TKunde", propOrder = {
    "nummerT",
    "nameT",
    "vornameT"
})
public class TKunde {

    @XmlElement(name = "nummer_t", required = true)
    protected BigInteger nummerT;
    @XmlElement(name = "name_t", required = true)
    protected BigInteger nameT;
    @XmlElement(name = "vorname_t", required = true)
    protected BigInteger vornameT;

    /**
     * Ruft den Wert der nummerT-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *     
     */
    public BigInteger getNummerT() {
        return nummerT;
    }

    /**
     * Legt den Wert der nummerT-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setNummerT(BigInteger value) {
        this.nummerT = value;
    }

    /**
     * Ruft den Wert der nameT-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *     
     */
    public BigInteger getNameT() {
        return nameT;
    }

    /**
     * Legt den Wert der nameT-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setNameT(BigInteger value) {
        this.nameT = value;
    }

    /**
     * Ruft den Wert der vornameT-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *     
     */
    public BigInteger getVornameT() {
        return vornameT;
    }

    /**
     * Legt den Wert der vornameT-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setVornameT(BigInteger value) {
        this.vornameT = value;
    }

    public TKunde()
    { System.out.print("12334456");}

}
