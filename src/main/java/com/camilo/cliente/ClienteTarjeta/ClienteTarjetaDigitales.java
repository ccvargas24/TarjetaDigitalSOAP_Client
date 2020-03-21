package com.camilo.cliente.ClienteTarjeta;

import java.util.List;

import com.camilo.tarjetadigital.service.Tarjeta;
import com.camilo.tarjetadigital.service.TarjetaService;
import com.camilo.tarjetadigital.service.TarjetaServiceImplService;

public class ClienteTarjetaDigitales {

	private TarjetaService tarjetaService = new TarjetaServiceImplService().getTarjetaServiceImplPort();

	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		System.out.println(tarjeta.getCvv());
		System.out.println(tarjetaService);
		return tarjetaService.crearTarjeta(tarjeta);
	}

	public List<Tarjeta> obtenerTodas() {
		return tarjetaService.obtenerTodas();
	}
}
