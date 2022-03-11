package isp.lab3.exercise4;

public class MyPoint {
    private int x;
    private int y;
    private int z;

    public MyPoint() {
        x = 0;
        y = 0;
        z = 0;
    }

    public MyPoint(int x , int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }

    public double distance(int x, int y, int z) {
        return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2) + Math.pow((this.z - z), 2));
    }

    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow((this.x - another.x), 2) + Math.pow((this.y - another.y), 2) + Math.pow((this.z - another.z), 2));
    }
}
