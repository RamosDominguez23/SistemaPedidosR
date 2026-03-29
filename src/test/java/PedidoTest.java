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
}



