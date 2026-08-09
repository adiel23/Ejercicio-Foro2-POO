public class Motocicleta extends Vehiculo{
    private String cilindraje;
    private String tipoMotocicleta;

    public Motocicleta(String codigo, String marca, String modelo, String anio, double precio, String cilindraje, String tipoMotocicleta) {
        super(codigo, marca, modelo, anio, precio);
        this.cilindraje = cilindraje;
        this.tipoMotocicleta = tipoMotocicleta;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + """
               Cilindraje: %s
               Tipo de Motocicleta: %s
               """.formatted(cilindraje, tipoMotocicleta);
    }
}
