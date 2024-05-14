import com.application.bd.Entity.Cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteServiceTest {

    @Test
    public void testConstructorCliente() {
        // Datos de prueba
        int id = 1;
        String nombre = "Juan";
        String direccion = "Calle Principal";
        String correo = "juan@example.com";
        int telefono = 123456789;

        // Crear instancia de Cliente usando el constructor
        Cliente cliente = new Cliente( nombre, direccion, correo, telefono);

        // Verificar los valores de los campos
        assertEquals(id, cliente.getId());
        assertEquals(nombre, cliente.getNombre());
        assertEquals(direccion, cliente.getDireccion());
        assertEquals(correo, cliente.getCorreo());
        assertEquals(telefono, cliente.getTelefono());
    }



    
}
