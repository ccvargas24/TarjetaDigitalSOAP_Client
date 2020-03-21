package com.camilo.cliente.ClienteTarjeta;

import java.util.List;

import com.camilo.tarjetadigital.service.MarcaEnum;
import com.camilo.tarjetadigital.service.Tarjeta;

/**
 * Hello world!
 *
 * wsimport -keep -verbose
 * http://tarjetadigital123.herokuapp.com/TarjetaService?wsdl
 */
public class App {
	public static void main(String[] args) {
		ClienteTarjetaDigitales cliente = new ClienteTarjetaDigitales();
		System.out.println("inicio");
		if (args[0].equals("crear")) {
			System.out.println("Crear");
			Tarjeta tarjeta = new Tarjeta();

			tarjeta.setCvv(args[1]);
			tarjeta.setFechaCaducidad(args[2]);
			tarjeta.setMarca(MarcaEnum.VISA);
			tarjeta.setNombreBanco(args[3]);
			tarjeta.setNombreTitular(args[4]);
			tarjeta.setNumeroTarjeta(args[5]);
			System.out.println(tarjeta);
			cliente.crearTarjeta(tarjeta);
			System.out.println("Enviado");
		} else if (args[0].equals("listar")) {
			System.err.println("listar");
			List<Tarjeta> tarjetas = cliente.obtenerTodas();
			System.err.println("se optiene " + tarjetas);
			for (Tarjeta tarjeta : tarjetas) {
				System.out.println(tarjeta.getNombreBanco());
			}
		}
	}
}
