public class Automovil extends Vehiculo{
    private int cantidadPuertas;
    private String tipoCombustible;

    public Automovil(String codigo, String marca, String modelo, String anio, double precio, int cantidadPuertas, String tipoCombustible) {
        super(codigo, marca, modelo, anio, precio);
        this.cantidadPuertas = cantidadPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + """
               Puertas: %d
               Combustible: %s
               """.formatted(cantidadPuertas, tipoCombustible);
    }
}
