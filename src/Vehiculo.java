public class Vehiculo {
    private String codigo;
    private String marca;
    private String modelo;
    private String anio;
    private double precio;

    public Vehiculo(String codigo, String marca, String modelo, String anio, double precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String obtenerDetalles() {
        return """
               Código: %s
               Marca: %s
               Modelo: %s
               Año: %s
               Precio: $%.2f
               """.formatted(codigo, marca, modelo, anio, precio);
    }
}
