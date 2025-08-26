public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(2, 3);
        Punto p2 = new Punto(5, 7);

        Linea linea = new Linea(p1, p2);
        Circulo circulo = new Circulo(p1, 10);
        Rectangulo rect = new Rectangulo(p1, 4, 6);
        Cuadrado cuadrado = new Cuadrado(p1, 5);
        Punto3D p3d = new Punto3D(1, 2, 3);

        p1.imprimir();
        linea.imprimir();
        circulo.imprimir();
        rect.imprimir();
        cuadrado.imprimir();
        p3d.imprimir();
    }
}