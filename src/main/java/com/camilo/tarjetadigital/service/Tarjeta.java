
package com.camilo.tarjetadigital.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tarjeta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tarjeta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cvv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaCaducidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marca" type="{http://service.tarjetaDigital.camilo.com/}marcaEnum" minOccurs="0"/>
 *         &lt;element name="nombreBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreTitular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tarjeta", propOrder = {
    "cvv",
    "fechaCaducidad",
    "marca",
    "nombreBanco",
    "nombreTitular",
    "numeroTarjeta"
})
public class Tarjeta {

    protected String cvv;
    protected String fechaCaducidad;
    @XmlSchemaType(name = "string")
    protected MarcaEnum marca;
    protected String nombreBanco;
    protected String nombreTitular;
    protected String numeroTarjeta;

    /**
     * Obtiene el valor de la propiedad cvv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvv() {
        return cvv;
    }

    /**
     * Define el valor de la propiedad cvv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvv(String value) {
        this.cvv = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCaducidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * Define el valor de la propiedad fechaCaducidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCaducidad(String value) {
        this.fechaCaducidad = value;
    }

    /**
     * Obtiene el valor de la propiedad marca.
     * 
     * @return
     *     possible object is
     *     {@link MarcaEnum }
     *     
     */
    public MarcaEnum getMarca() {
        return marca;
    }

    /**
     * Define el valor de la propiedad marca.
     * 
     * @param value
     *     allowed object is
     *     {@link MarcaEnum }
     *     
     */
    public void setMarca(MarcaEnum value) {
        this.marca = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreBanco() {
        return nombreBanco;
    }

    /**
     * Define el valor de la propiedad nombreBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreBanco(String value) {
        this.nombreBanco = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreTitular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreTitular() {
        return nombreTitular;
    }

    /**
     * Define el valor de la propiedad nombreTitular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreTitular(String value) {
        this.nombreTitular = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * Define el valor de la propiedad numeroTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTarjeta(String value) {
        this.numeroTarjeta = value;
    }

}
