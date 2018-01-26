package Chapter7;


public class TwoDShape {
    private double width;
    private double height;
    private String name;

    TwoDShape()
    {
        width = height = 0.0;
        name = "none";
    }

    TwoDShape(double w, double h, String n){
        width =w;
        height = h;
        name = n;
    }
    TwoDShape(double x, String n){
        width = height= x;
        name = n;
    }
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }
    double getWidth() {return width;}
    double getHeight() {return height;}
    void setWidth(double w){width = w;}
    void setHeight(double h){height = h;}

    String getName(){return name;}

    void showDim(){
        System.out.println("Width and height - " + width + " and"
        +height);
    }
    double area(){
        System.out.println("area() method must be redefined.");
        return 0.0;
    }

    static class Triangle extends TwoDShape{
        private String style;

        Triangle(){
            super();
            style = "none";
        }
        Triangle(String s, double w, double h){
            super(w,h,"triangle");
            style = s;
        }
        Triangle(double x){
            super(x,"triangle");
            style = "painted";
        }
        Triangle(Triangle ob){
            super(ob);
            style = ob.style;
        }
        double area(){
            return getWidth() * getHeight() /2;
        }
        void showStyle(){
            System.out.println("Triangle " + style);
        }
static class Rectangle extends TwoDShape{
            Rectangle(){
                super();
            }
            Rectangle(double w,double h){
                super(w,h,"Rectangle");
            }
            Rectangle(double x){
                super(x,"Rectangle");
            }
            Rectangle(Rectangle ob){
                super(ob);
            }
            boolean IsSquare(){
                if(getWidth() == getHeight()) return true;
                return false;
            }

}
    }
    class DynShapes{
        public  void Launch()
        {
            TwoDShape shapes[] = new TwoDShape[5];
            shapes[0] = new Triangle("Contour", 8.0,12.0);
            shapes[1] =new Triangle.Rectangle(10);
            shapes[2] = new Triangle.Rectangle(10,4);
            shapes[3] = new Triangle(7.0);
            shapes[4] = new TwoDShape(10,20,"figure");
            for (int i = 0; i< shapes.length; i++){
                System.out.println("Object - " + shapes[i].getName());
                System.out.println("Area - " + shapes[i].area());
                System.out.println();
            }

        }
    }
}

