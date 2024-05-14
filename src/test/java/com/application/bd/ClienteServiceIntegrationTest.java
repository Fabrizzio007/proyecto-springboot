package com.application.bd;

import com.application.bd.Entity.Cliente;
import com.application.bd.Repository.ClienteRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ClienteServiceIntegrationTest {

    @Autowired
    private ClienteRepo clienteRepository;

    @Test
    public void testCrearCliente() {
        // Crear un cliente
        Cliente cliente = new Cliente("jorge vargas", "centro calle 50 # 63-16", "jorge123@gmail.com", 2147483647);

        // Guardar el cliente en la base de datos
        clienteRepository.save(cliente);

        // Verificar que el cliente se ha guardado correctamente
        assertThat(clienteRepository.findById(cliente.getId())).isPresent();
    }

    // Aquí puedes agregar más pruebas para los otros métodos de ClienteService, como ModificarCliente, BuscarCliente, EliminarCliente, etc.
}



