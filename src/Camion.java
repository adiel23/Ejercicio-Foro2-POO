public class Camion extends Vehiculo {
    private String capacidadCarga;
    private int cantidadEjes;

    public Camion(String codigo, String marca, String modelo, String anio, double precio, String capacidadCarga, int cantidadEjes) {
        super(codigo, marca, modelo, anio, precio);
        this.capacidadCarga = capacidadCarga;
        this.cantidadEjes = cantidadEjes;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + """
               Capacidad de carga: %s
               Cantidad de ejes: %d
               """.formatted(capacidadCarga, cantidadEjes);
    }
}
