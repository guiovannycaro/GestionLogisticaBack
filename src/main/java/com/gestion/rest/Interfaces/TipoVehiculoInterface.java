package com.gestion.rest.Interfaces;

import java.util.List;



import com.gestion.rest.Model.TipoVehiculo;

public interface TipoVehiculoInterface {

	List<TipoVehiculo> devolverListaTipoVehiculo() throws Exception;

	List<TipoVehiculo> devolverTipoVehiculoById(int id)  throws Exception;

	TipoVehiculo buscarTipoVehiculoPorDato(TipoVehiculo datos)  throws Exception;
	 
	String agregarTipoVehiculo(TipoVehiculo datos)  throws Exception;

	String actualizarTipoVehiculo(TipoVehiculo datos)  throws Exception;

	String eliminarTipoVehiculo(int id)  throws Exception;

}
