package Modelos;

public abstract class BaseOrden {


    protected Integer identificador;
    protected String descripcion;


    protected BaseOrden() {
    }


    protected BaseOrden(String descripcion) {
        this.descripcion = descripcion;
    }


    public abstract void imprimir();

    protected void imprimirSeparador() {
        System.out.println("===============================================");
    }
}
