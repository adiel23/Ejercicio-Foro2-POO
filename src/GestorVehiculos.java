import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GestorVehiculos {
    private List<Vehiculo> vehiculos;

    public GestorVehiculos() {
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public Vehiculo obtenerVehiculoPorCodigo(String codigo) {
        return vehiculos.stream()
                .filter(vehiculo -> Objects.equals(vehiculo.getCodigo(), codigo))
                .findFirst()
                .orElse(null);
    }
}
