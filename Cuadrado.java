public class Cuadrado {
    private Punto esquina;
    private int lado;

    public Cuadrado(Punto esquina, int lado) {
        this.esquina = esquina;
        this.lado = lado;
    }

    public void imprimir() {
        System.out.print("Esquina: ");
        esquina.imprimir();
        System.out.println("Lado: " + lado);
    }
}
