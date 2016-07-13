//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.01.25 um 08:07:16 PM CET 
//


package de.generated;

import de.generated.TKunde;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="test" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="kunde">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nummer" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="vorname" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="derKunde" type="{}TKunde"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "test",
    "id",
    "kunde",
    "derKunde"
})
@XmlRootElement(name = "shiporder")
public class Shiporder {

    @XmlElement(required = true)
    protected String test;
    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(required = true)
    protected Kunde kunde;
    @XmlElement(required = true)
    protected TKunde derKunde;

    /**
     * Ruft den Wert der test-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTest() {
        return test;
    }

    /**
     * Legt den Wert der test-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTest(String value) {
        this.test = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der kunde-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link de.generated.Shiporder.Kunde }
     *     
     */
    public Kunde getKunde() {
        return kunde;
    }

    /**
     * Legt den Wert der kunde-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link de.generated.Shiporder.Kunde }
     *     
     */
    public void setKunde(Kunde value) {
        this.kunde = value;
    }

    /**
     * Ruft den Wert der derKunde-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link generated.TKunde }
     *     
     */
    public TKunde getDerKunde() {
        return derKunde;
    }

    /**
     * Legt den Wert der derKunde-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link generated.TKunde }
     *     
     */
    public void setDerKunde(TKunde value) {
        this.derKunde = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="nummer" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="vorname" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nummer",
        "name",
        "vorname"
    })
    public static class Kunde {

        @XmlElement(required = true)
        protected BigInteger nummer;
        @XmlElement(required = true)
        protected BigInteger name;
        @XmlElement(required = true)
        protected BigInteger vorname;

        /**
         * Ruft den Wert der nummer-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link java.math.BigInteger }
         *     
         */
        public BigInteger getNummer() {
            return nummer;
        }

        /**
         * Legt den Wert der nummer-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link java.math.BigInteger }
         *     
         */
        public void setNummer(BigInteger value) {
            this.nummer = value;
        }

        /**
         * Ruft den Wert der name-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link java.math.BigInteger }
         *     
         */
        public BigInteger getName() {
            return name;
        }

        /**
         * Legt den Wert der name-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link java.math.BigInteger }
         *     
         */
        public void setName(BigInteger value) {
            this.name = value;
        }

        /**
         * Ruft den Wert der vorname-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link java.math.BigInteger }
         *     
         */
        public BigInteger getVorname() {
            return vorname;
        }

        /**
         * Legt den Wert der vorname-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link java.math.BigInteger }
         *     
         */
        public void setVorname(BigInteger value) {
            this.vorname = value;
        }

    }

}
