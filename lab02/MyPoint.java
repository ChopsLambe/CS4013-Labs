package lab02;

public class MyPoint {
double x;
double y;

public MyPoint(){
  x = 0;
  y = 0;
}
public MyPoint(double x, double y){
  this.x = x;
  this.y = y;
}
public double returnX(){
  return x;
}
public double returnY(){
  return y;
}
public double distance(MyPoint p){
  return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
}
public double distance(double x, double y){
  return distance(new MyPoint(x, y));
}
}
