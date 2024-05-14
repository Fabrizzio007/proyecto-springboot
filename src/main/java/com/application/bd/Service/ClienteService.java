package com.application.bd.Service;

import com.application.bd.Entity.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> CosultarCliente();

    Cliente CrearCliente(Cliente cliente);

    Cliente ModificarCliente(Cliente cliente);

    Cliente BuscarCliente(int id);

    void EliminarCliente(int id);

}