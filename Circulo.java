public class Circulo {
    private Punto esquina;
    private int radio;

    public Circulo(Punto esquina, int radio) {
        this.esquina = esquina;
        this.radio = radio;
    }

    public void imprimir() {
        System.out.print("Esquina: ");
        esquina.imprimir();
        System.out.println("Radio: " + radio);
    }
}
