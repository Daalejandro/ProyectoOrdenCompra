
import Modelos.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class EjemploOrdenesCompra {
    public static void main(String[] args) {
        // Crear productos
        Producto p1 = new Producto("Sony", "Televisor", 500);
        Producto p2 = new Producto("Samsung", "Celular", 300);
        Producto p3 = new Producto("Dell", "Laptop", 800);
        Producto p4 = new Producto("HP", "Impresora", 200);
        Producto p5 = new Producto("Logitech", "Teclado", 50);
        Producto p6 = new Producto("Apple", "iPad", 700);
        Producto p7 = new Producto("Bose", "Audífonos", 150);
        Producto p8 = new Producto("Lenovo", "Tablet", 250);
        Producto p9 = new Producto("Xiaomi", "Smartwatch", 120);
        Producto p10 = new Producto("Asus", "Monitor", 400);
        Producto p11 = new Producto("Canon", "Cámara", 600);
        Producto p12 = new Producto("Kingston", "SSD", 100);

        // Crear clientes
        Cliente c1 = new Cliente("Juan", "Pérez");
        Cliente c2 = new Cliente("Ana", "Gómez");
        Cliente c3 = new Cliente("Luis", "Martínez");

        // Crear órdenes
        OrdenCompra orden1 = new OrdenCompra("Compra de electrónicos");
        orden1.setCliente(c1);
        orden1.setFecha(new Date());
        orden1.addProducto(p1);
        orden1.addProducto(p2);
        orden1.addProducto(p3);
        orden1.addProducto(p4);
        orden1.addProducto(p5);

        OrdenCompra orden2 = new OrdenCompra("Compra de gadgets");
        orden2.setCliente(c2);
        orden2.setFecha(new Date());
        orden2.addProducto(p5);
        orden2.addProducto(p6);
        orden2.addProducto(p7);
        orden2.addProducto(p8);

        OrdenCompra orden3 = new OrdenCompra("Compra de accesorios");
        orden3.setCliente(c3);
        orden3.setFecha(new Date());
        orden3.addProducto(p9);
        orden3.addProducto(p10);
        orden3.addProducto(p11);
        orden3.addProducto(p12);

//        orden1.imprimir();
//        orden2.imprimir();
//        orden3.imprimir();


        List<BaseOrden> elementos = Arrays.asList(orden1, orden2, orden3);

        elementos.forEach(imp ->{
            imp.imprimir();

        });

        orden1.imprimir();
        orden2.imprimir();



    }
}
