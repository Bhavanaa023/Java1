class Mypoint1 {
    private int x;
    private int y;
    public Mypoint1() {
        this.x=0;
        this.y=0;
    }
    public Mypoint1(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int[] getXY() {
        int[] points={x,y};
        return points;
    }
    public double distance(int x, int y) {
        int xDiff=this.x-x;
        int yDiff=this.y-y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    public double distance() {
        return Math.sqrt(x*x + y*y);
    }
    }
public class B3 {
    public static void main(String[] args) {
        Mypoint1 point1=new Mypoint1();
        Mypoint1 point2=new Mypoint1(3,4);
        point1.setXY(1,2);
        int[]points=point1.getXY();
        System.out.print("Point1 coordinates are ");
        System.out.print(points[0]+","+points[1]+"\n");
        System.out.println(point1.distance(5,6));
        System.out.println(point1.distance());
    }
}