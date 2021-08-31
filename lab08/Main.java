
public class Main {
    
    public static void main(String[] args) {
        Rectangle r1= new Rectangle(5, 6);
        Rectangle r2= new Rectangle(5, 6);
        Circle c1= new Circle(5);
        Circle c2= new Circle(7);
        Square s= new Square(3);
        
        GeometricObject[] shapes = {r1, r2, c1, c2, s};

        
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].howToColor();
        }
        
        
            
    
    }
}
