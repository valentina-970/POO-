public class Linea {
    private Punto p1;
    private Punto p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void imprimir() {
        System.out.print("Punto #1: ");
        p1.imprimir();
        System.out.print("Punto #2: ");
        p2.imprimir();
    }
}
