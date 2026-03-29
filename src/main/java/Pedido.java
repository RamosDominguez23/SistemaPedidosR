import java.time.LocalDate;

public class Pedido {
    private String codigo;
    private String cliente;
    private int mesa;
    private double monto;
    private LocalDate fecha;

    public Pedido(String codigo, String cliente, int mesa, double monto, LocalDate fecha) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.mesa = mesa;
        this.monto = monto;
        this.fecha = fecha;
    }

    public String validar() {
        if (codigo == null || cliente == null || fecha == null || codigo.isEmpty() || cliente.isEmpty()) {
            return "Debe ingresar todos los datos requeridos";
        }

        if (!codigo.matches("P\\d{3}")) {
            return "Ingrese un código de pedido válido";
        }

        if (!cliente.matches("[a-zA-Z]{3,}")) {
            return "El nombre del cliente debe tener al menos tres caracteres alfabéticos";
        }

        if (mesa < 1 || mesa > 50) {
            return "Ingrese un número de mesa válido";
        }

        if (monto <= 0) {
            return "El monto total debe ser mayor a cero";
        }

        if (!fecha.equals(LocalDate.now())) {
            return "La fecha del pedido debe ser la fecha actual";
        }

        return "El pedido ha sido registrado correctamente";
    }
}
