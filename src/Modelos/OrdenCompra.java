package Modelos;

import java.util.Date;


public class OrdenCompra extends BaseOrden {
    private static int ultimoId = 0;

    private Date fecha;
    private Cliente cliente;
    private Producto[] productos = new Producto[4];
    private int indiceProducto = 0;

    public OrdenCompra(String descripcion) {
        super(descripcion);
        this.identificador = ++ultimoId;
    }


    public Date getFecha() { return fecha; }
    public Cliente getCliente() { return cliente; }
    public Producto[] getProductos() { return productos; }


    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public void setFecha(Date fecha) { this.fecha = fecha; }


    public void addProducto(Producto producto) {
        if (indiceProducto < productos.length) {
            productos[indiceProducto++] = producto;
        }
    }


    protected int calcularGranTotal() {
        int total = 0;
        for (Producto p : productos) {
            if (p != null) {
                total += p.getPrecio();
            }
        }
        return total;
    }

    @Override
    public void imprimir() {
        imprimirSeparador();
        System.out.println("Orden #" + identificador + ": " + descripcion);
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
        System.out.println("Fecha: " + fecha);
        System.out.println("Productos:");
        for (Producto p : productos) {
            if (p != null) {
                System.out.println(" - " + p.getFabricante() + " | " + p.getNombre() + " | $" + p.getPrecio());
            }
        }
        System.out.println("Gran Total: $" + calcularGranTotal());
        imprimirSeparador();
    }
}
