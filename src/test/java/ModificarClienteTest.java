import com.application.bd.Entity.Cliente;
import com.application.bd.Repository.ClienteRepo;
import com.application.bd.Service.ClienteServiceIMPL.CSIMPL;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ModificarClienteTest {

    @Mock
    private ClienteRepo clienteRepo;

    @InjectMocks
    private CSIMPL clienteService;

    @Test
    public void testModificarCliente() {
        // Cliente original
        Cliente clienteOriginal = new Cliente( "Juan", "Calle Principal", "juan@example.com", 123456789);

        // Cliente modificado
        Cliente clienteModificado = new Cliente("Juan Modificado", "Nueva Dirección", "nuevo@email.com", 987654321);

        // Configuración de simulación para aceptar cualquier instancia de Cliente
        when(clienteRepo.save(any(Cliente.class))).thenReturn(clienteModificado);

        // Llama al método de modificación de cliente
        Cliente clienteActualizado = clienteService.ModificarCliente(clienteOriginal);

        // Verifica si el cliente modificado es igual al cliente devuelto por el servicio
        assertEquals(clienteModificado, clienteActualizado);
    }
}

