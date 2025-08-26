public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void imprimir() {
        System.out.println("x=" + x + "; y=" + y);
    }

    // getters
    public int getX() { return x; }
    public int getY() { return y; }
}
