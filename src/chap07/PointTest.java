package chap07;

public class PointTest {
    static public void main(String[] args) {
        Point3D p3 = new Point3D(1,2,3);
    }
}

class Point {
    int x, y;

    public Point(){}
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x :" + x + ", y :"+ y;
    }
}

class Point3D extends Point{
    int z;

    public Point3D(int x, int y, int z) {
        super();
        this.x = x;
        this.y = y;
        this.z = z;
    }

    String getLocation() {
        return x+" "+y+" "+z;
    }
}
