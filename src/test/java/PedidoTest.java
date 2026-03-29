import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {
    @Test
    void codigoPedidoValido() {
        Pedido pedido = new Pedido("P123", "Carlos", 10, 50.5, java.time.LocalDate.now());
        assertEquals("El pedido ha sido registrado correctamente", pedido.validar());
    }

    @Test
    void nombreClienteInvalido() {
        Pedido pedido = new Pedido("P123", "Jo", 10, 50.5, java.time.LocalDate.now());
        assertEquals("El nombre del cliente debe tener al menos tres caracteres alfabéticos", pedido.validar());
    }

    @Test
    void mesaInvalida() {
        Pedido pedido = new Pedido("P123", "Carlos", 0, 50.5, java.time.LocalDate.now());
        assertEquals("Ingrese un número de mesa válido", pedido.validar());
    }

    @Test
    void montoInvalido() {
        Pedido pedido = new Pedido("P123", "Carlos", 10, -5.0, java.time.LocalDate.now());
        assertEquals("El monto total debe ser mayor a cero", pedido.validar());
    }

    @Test
    void camposVacios() {
        Pedido pedido = new Pedido("", "", 10, 50.5, java.time.LocalDate.now());
        assertEquals("Debe ingresar todos los datos requeridos", pedido.validar());
    }
}



