
import com.application.bd.Entity.Cliente;
import com.application.bd.Repository.ClienteRepo;
import com.application.bd.Service.ClienteServiceIMPL.CSIMPL;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ConsultarClienteTest {

    @Mock
    private ClienteRepo clienteRepo;

    @InjectMocks
    private CSIMPL clienteService;

    @Test
    public void testConsultarCliente() {
        List<Cliente> clientes = new ArrayList<>();
        Cliente cliente1 = new Cliente("Juan", "Calle Principal", "juan@example.com", 123456789);
        Cliente cliente2 = new Cliente("María", "Calle Secundaria", "maria@example.com", 987654321);
        clientes.add(cliente1);
        clientes.add(cliente2);

        when(clienteRepo.findAll()).thenReturn(clientes);

        List<Cliente> clientesEncontrados = clienteService.CosultarCliente();
        assertEquals(clientes.size(), clientesEncontrados.size());
    }



}
