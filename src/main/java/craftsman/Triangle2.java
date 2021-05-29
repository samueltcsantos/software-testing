package craftsman;

public class Triangle2 {

    private int a;
    private int b;
    private int c;

    public Triangle2(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isATriangle(){
        return a < (b + c) && (b < (a + c)) && (c < (a + b));
    }

    public String triangleType(){
        String type = "";
        if (isATriangle()) {
            if ((a == b) && (b == c)) {
                type = "Triangle Equilateral";
            } else if ((a != b) && (a != c) && (b != c)) {
                type = "Triangle Scalene";
            } else {
                type = "Triangle Isosceles";
            }
        }
        else {
            type = "Not a Triangle";
        }
        return type;
    }

}
