
package com.camilo.tarjetadigital.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para marcaEnum.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="marcaEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VISA"/>
 *     &lt;enumeration value="MASTERCARD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "marcaEnum")
@XmlEnum
public enum MarcaEnum {

    VISA,
    MASTERCARD;

    public String value() {
        return name();
    }

    public static MarcaEnum fromValue(String v) {
        return valueOf(v);
    }

}
