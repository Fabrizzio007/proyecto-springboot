package com.application.bd.Service.ClienteServiceIMPL;

import com.application.bd.Entity.Cliente;
import com.application.bd.Repository.ClienteRepo;
import com.application.bd.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CSIMPL implements ClienteService {

    @Autowired
    private ClienteRepo repo;
    @Override
    public List<Cliente> CosultarCliente() {return (List<Cliente>) this.repo.findAll();
    }



    @Override
    public Cliente CrearCliente(Cliente cliente) {
        cliente.setCorreo(cliente.getCorreo());
        return this.repo.save(new Cliente());
    }

    @Override
    public Cliente ModificarCliente(Cliente cliente) {
        return this.repo.save(new Cliente())
   ; }

    @Override
    public Cliente BuscarCliente(int id) {

        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarCliente(int id) {
        this.repo.deleteById(id);
    }


}
