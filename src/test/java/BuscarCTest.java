import com.application.bd.Entity.Cliente;
import com.application.bd.Repository.ClienteRepo;
import com.application.bd.Service.ClienteServiceIMPL.CSIMPL;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BuscarCTest {

    @Mock
    private ClienteRepo clienteRepo;

    @InjectMocks
    private CSIMPL clienteService;

    @Test
    public void testBuscarCliente() {
        int idCliente = 1;
        Cliente cliente = new Cliente("Juan", "Calle Principal", "juan@example.com", 123456789);

        when(clienteRepo.findById(idCliente)).thenReturn(Optional.of(cliente));

        Cliente clienteEncontrado = clienteService.BuscarCliente(idCliente);
        assertEquals(cliente, clienteEncontrado);
    }
}
