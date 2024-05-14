package com.application.bd.Controller;

import com.application.bd.Entity.Cliente;
import com.application.bd.Repository.ClienteRepo;
import com.application.bd.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {


    @Autowired
    public ClienteService servicio;


    @GetMapping({"/clientes", "/"})
    public String listarClientes(Model modelo) {
        modelo.addAttribute("cliente",
                servicio.CosultarCliente());
        return "clientes"; //retorna al archivo cliente
    }






//  @Autowired
//   private ClienteRepo clienteRepo;
//
//    @GetMapping
//    public ResponseEntity<List<Cliente>> mostrarClientes() {
//        List<Cliente> clientes = (List<Cliente>) clienteRepo.findAll();
//        return ResponseEntity.ok(clientes);
//    }



}

