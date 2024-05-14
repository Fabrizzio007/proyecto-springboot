import com.application.bd.Entity.Cliente;
import com.application.bd.Repository.ClienteRepo;
import com.application.bd.Service.ClienteServiceIMPL.CSIMPL;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class EliminarClienteTest {

    @Mock
    private ClienteRepo clienteRepo;

    @InjectMocks
    private CSIMPL clienteService;

    @Test
    public void testEliminarCliente() {
        // ID del cliente a eliminar
        int idCliente = 1;

        // Llama al método de eliminación de cliente
        clienteService.EliminarCliente(idCliente);

        // Verifica si el método deleteById del repositorio clienteRepo fue llamado con el ID correcto
        verify(clienteRepo).deleteById(idCliente);
    }
}
