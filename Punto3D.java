public class Punto3D {
    private int x;
    private int y;
    private int z;

    public Punto3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void imprimir() {
        System.out.println("x=" + x + "; y=" + y + "; z=" + z);
    }
}
