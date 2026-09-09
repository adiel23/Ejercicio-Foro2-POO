import javax.swing.*;
import java.util.List;

public class Visualizador {
    public static void mostrar(List<? extends Vehiculo> lista, String titulo) {
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay " + titulo + " registrados.");
        } else {
            StringBuilder sb = new StringBuilder("Lista de " + titulo + ":\n\n");
            for (Vehiculo v : lista) {
                sb.append(v.obtenerDetalles()).append("\n----------------------\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }
}

