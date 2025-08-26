public class Rectangulo {
    private Punto esquina;
    private int lado1;
    private int lado2;

    public Rectangulo(Punto esquina, int lado1, int lado2) {
        this.esquina = esquina;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void imprimir() {
        System.out.print("Esquina: ");
        esquina.imprimir();
        System.out.println("Lado #1: " + lado1 + "; Lado #2: " + lado2);
    }

}
