
package com.camilo.tarjetadigital.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.camilo.tarjetadigital.service package. 
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

    private final static QName _CrearTarjetaResponse_QNAME = new QName("http://service.tarjetaDigital.camilo.com/", "crearTarjetaResponse");
    private final static QName _ObtenerTodasResponse_QNAME = new QName("http://service.tarjetaDigital.camilo.com/", "obtenerTodasResponse");
    private final static QName _CrearTarjeta_QNAME = new QName("http://service.tarjetaDigital.camilo.com/", "crearTarjeta");
    private final static QName _ObtenerTodas_QNAME = new QName("http://service.tarjetaDigital.camilo.com/", "obtenerTodas");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.camilo.tarjetadigital.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearTarjetaResponse }
     * 
     */
    public CrearTarjetaResponse createCrearTarjetaResponse() {
        return new CrearTarjetaResponse();
    }

    /**
     * Create an instance of {@link ObtenerTodasResponse }
     * 
     */
    public ObtenerTodasResponse createObtenerTodasResponse() {
        return new ObtenerTodasResponse();
    }

    /**
     * Create an instance of {@link CrearTarjeta }
     * 
     */
    public CrearTarjeta createCrearTarjeta() {
        return new CrearTarjeta();
    }

    /**
     * Create an instance of {@link ObtenerTodas }
     * 
     */
    public ObtenerTodas createObtenerTodas() {
        return new ObtenerTodas();
    }

    /**
     * Create an instance of {@link Tarjeta }
     * 
     */
    public Tarjeta createTarjeta() {
        return new Tarjeta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearTarjetaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.tarjetaDigital.camilo.com/", name = "crearTarjetaResponse")
    public JAXBElement<CrearTarjetaResponse> createCrearTarjetaResponse(CrearTarjetaResponse value) {
        return new JAXBElement<CrearTarjetaResponse>(_CrearTarjetaResponse_QNAME, CrearTarjetaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.tarjetaDigital.camilo.com/", name = "obtenerTodasResponse")
    public JAXBElement<ObtenerTodasResponse> createObtenerTodasResponse(ObtenerTodasResponse value) {
        return new JAXBElement<ObtenerTodasResponse>(_ObtenerTodasResponse_QNAME, ObtenerTodasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearTarjeta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.tarjetaDigital.camilo.com/", name = "crearTarjeta")
    public JAXBElement<CrearTarjeta> createCrearTarjeta(CrearTarjeta value) {
        return new JAXBElement<CrearTarjeta>(_CrearTarjeta_QNAME, CrearTarjeta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.tarjetaDigital.camilo.com/", name = "obtenerTodas")
    public JAXBElement<ObtenerTodas> createObtenerTodas(ObtenerTodas value) {
        return new JAXBElement<ObtenerTodas>(_ObtenerTodas_QNAME, ObtenerTodas.class, null, value);
    }

}
