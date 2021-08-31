package lab01;

public class rectangle {

double width ;
double height ;

public rectangle (){
    width = 1;
    height = 1;
}
public rectangle(double width, double height){
    this.width = width;
    this.height = height;
}
public double getArea(){
    return width * height;
}
public double getPerimeter(){
    return 2 * width + 2 * height;
}
}
