/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import dominio.Administrador;
import dominio.Flete;
import dominio.Productor;
import dominio.Quimico;
import dominio.Residuo;
import dominio.Transportista;
import dominio.Traslado;
import dominio.Vehiculo;

/**
 *
 * @author HP
 */
public interface INegocio {

    //Administrador
    public Administrador agregarAdministrador(Administrador administrador);

    //Flete
    public Flete agregarFlete(Flete flete);

    //Productor
    public Productor agregarProductor(Productor productor);

    //Quimico
    public Quimico agregarQuimico(Quimico quimico);

    //Residuo
    public Residuo agregarResiduo(Residuo residuo);

    //Transportista
    public Transportista agregarTransportista(Transportista transportista);

    //Traslado
    public Traslado agregarTraslado(Traslado traslado);

    //Vehiculo
    public Vehiculo agregarVehiculo(Vehiculo vehiculo);
}