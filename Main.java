import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Producto> catalogo = new HashSet<>();

        Producto p1 = new Producto("P001", "Teclado Mecánico", 45000.0);
        Producto p2 = new Producto("P002", "Mouse Inalámbrico", 22000.0);
        // Mismo código que p1, pero distinta instancia y otros datos
        Producto p1Duplicado = new Producto("P001", "Teclado Mecánico RGB", 49500.0);
        // Otra instancia más con el mismo código "P002"
        Producto p2Duplicado = new Producto("P002", "Mouse Gamer", 25000.0);
        Producto p3 = new Producto("P003", "Monitor 24\"", 185000.0);

        System.out.println("Agregando p1: " + catalogo.add(p1));
        System.out.println("Agregando p2: " + catalogo.add(p2));
        System.out.println("Agregando p1Duplicado (código P001): " + catalogo.add(p1Duplicado));
        System.out.println("Agregando p2Duplicado (código P002): " + catalogo.add(p2Duplicado));
        System.out.println("Agregando p3: " + catalogo.add(p3));

        System.out.println("\nTotal de productos únicos en el HashSet: " + catalogo.size());
        System.out.println("Productos en el conjunto:");
        for (Producto prod : catalogo) {
            System.out.println("  - " + prod + " | hashCode=" + prod.hashCode());
        }
    }
}