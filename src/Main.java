import javax.swing.*;

public class Main {
    public static void main() {
        GestorVehiculos gestorVehiculos = new GestorVehiculos();

        JOptionPane.showMessageDialog(null, "¡Bienvenido a la aplicación!");

        String[] opciones = {"registrar", "consultar", "visualizar", "eliminar"};
        String[] tiposVehiculo = {"automovil", "motocicleta", "camion"};

        int respuesta;

        do {
            int operacionEscogida = JOptionPane.showOptionDialog(
                    null,                             // Componente padre (null para centrar en pantalla)
                    "Seleccione el tipo de operacion a realizar:",         // Mensaje
                    "Menú Principal",                // Título de la ventana
                    JOptionPane.DEFAULT_OPTION,       // Tipo de botones por defecto
                    JOptionPane.PLAIN_MESSAGE,     // Tipo de icono
                    null,                             // Icono personalizado (null para default)
                    opciones,                         // Array con las opciones
                    opciones[0]                       // Opción elegida por defecto al presionar Enter
            );

            switch (operacionEscogida) {
                case 0: {
                    int tipoVehiculo = JOptionPane.showOptionDialog(
                            null,                             // Componente padre (null para centrar en pantalla)
                            "Seleccione el tipo de vehiculo a registrar:",         // Mensaje
                            "Registro de vehiculo",                // Título de la ventana
                            JOptionPane.DEFAULT_OPTION,       // Tipo de botones por defecto
                            JOptionPane.PLAIN_MESSAGE,     // Tipo de icono (pregunta)
                            null,                             // Icono personalizado (null para default)
                            tiposVehiculo,                         // Array con las opciones
                            tiposVehiculo[0]                       // Opción elegida por defecto al presionar Enter
                    );

                    String codigo = JOptionPane.showInputDialog("Ingrese el codigo");
                    String marca = JOptionPane.showInputDialog("Ingrese la marca");
                    String modelo = JOptionPane.showInputDialog("ingrese el modelo");
                    String anio = JOptionPane.showInputDialog("ingrese el anio");
                    double precio = Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio"));

                    switch (tipoVehiculo) {
                        case 0:
                            int cantidadPuertas = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de puertas"));
                            String tipoCombustible = JOptionPane.showInputDialog("ingrese el tipo de combustible");

                            Automovil automovil = new Automovil(
                                    codigo,
                                    marca,
                                    modelo,
                                    anio,
                                    precio,
                                    cantidadPuertas,
                                    tipoCombustible
                            );

                            gestorVehiculos.agregarVehiculo(automovil);

                            break;
                        case 1:
                            String cilindraje = JOptionPane.showInputDialog("ingrese el cilindraje");
                            String tipoMotocicleta = JOptionPane.showInputDialog("ingrese el tipo de motocicleta");

                            Motocicleta motocicleta = new Motocicleta(
                                    codigo,
                                    marca,
                                    modelo,
                                    anio,
                                    precio,
                                    cilindraje,
                                    tipoMotocicleta
                            );

                            gestorVehiculos.agregarVehiculo(motocicleta);
                            break;
                        case 2:
                            String capacidadCarga = JOptionPane.showInputDialog("ingrese la capacidad de carga");
                            int cantidadEjes = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de ejes"));

                            Camion camion = new Camion(
                                    codigo,
                                    marca,
                                    modelo,
                                    anio,
                                    precio,
                                    capacidadCarga,
                                    cantidadEjes
                            );

                            gestorVehiculos.agregarVehiculo(camion);
                            break;
                    }

                    JOptionPane.showMessageDialog(null, "Vehiculo agregado con exito");
                    break;
                }
                case 1: {
                    String codigo = JOptionPane.showInputDialog("Ingrese el codigo del vehiculo que quiere consultar");

                    Vehiculo vehiculo = gestorVehiculos.obtenerVehiculoPorCodigo(codigo);

                    if (vehiculo == null) {
                        JOptionPane.showMessageDialog(null, "Vehiculo no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, vehiculo.obtenerDetalles());
                    }
                }
            }

            respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?");
        } while (respuesta == JOptionPane.YES_OPTION);


        // 3. Confirmar una acción (retorna 0 para SÍ, 1 para NO, 2 para CANCELAR)
        /*int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas continuar, " + nombre + "?");

        if (respuesta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Decidiste continuar.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Operación cancelada.", "Atención", JOptionPane.WARNING_MESSAGE);
        } */
    }
}
