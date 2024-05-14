package com.application.bd.Controller;

import com.application.bd.Entity.Cliente;
import com.application.bd.Service.ClienteServiceIMPL.CSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CRUDrepo")
public class controlador {

    @Autowired
    private CSIMPL impl;

    @GetMapping
    @RequestMapping(value = "ConsultarCliente",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarCliente(){

        List<Cliente> listaCliente=this.impl.CosultarCliente();
        return ResponseEntity.ok(listaCliente);
    }

    @PostMapping
    @RequestMapping(value = "CrearCliente",method = RequestMethod.POST)
    public ResponseEntity<?> CrearCliente(@RequestBody Cliente cliente){

        Cliente ClienteCreado=this.impl.CrearCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(ClienteCreado);
    }

    @PutMapping
    @RequestMapping(value = "ModificarCliente",method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarClient(@RequestBody Cliente cliente){

        Cliente ClienteModificado=this.impl.ModificarCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(ClienteModificado);
    }

    @GetMapping
    @RequestMapping(value = "BuscarCliente/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> BuscarCliente(@PathVariable int id){

        Cliente Cliente=this.impl.BuscarCliente(id);
        return ResponseEntity.ok(Cliente);
    }

   @DeleteMapping
   @RequestMapping(value = "EliminarCliente/{id}",method = RequestMethod.DELETE)
   public ResponseEntity<?> EliminarCliente(@PathVariable int id) {
       this.impl.EliminarCliente(id);
       return ResponseEntity.ok().build();
   }

}
