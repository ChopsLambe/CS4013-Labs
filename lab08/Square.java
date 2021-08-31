public class Square extends GeometricObject implements Colorable {
    private double wAndH;

  public Square(double wAndH) {
    this.wAndH = wAndH;
  }

  public double getWidthAndHeight() {
    return wAndH;
  }

  public void setWidthAndHeight(double wAndH) {
    this.wAndH = wAndH;
  }

  public double getArea() {
    return wAndH * wAndH;
  }


  public double getPerimeter() {
    return 4*(wAndH);
  }

  public boolean equals(Square obj) {
    if (getArea() == obj.getArea()) {
      return true;
    }
    else return false;
  }

  public String toString() {
    return "Witdh= " + wAndH + ", " +
    "height= " + wAndH + ", " +
    "area= " + getArea() + ", " +
    "perimeter= " + getPerimeter() + ".";
  }

  @Override
  public void howToColor(){
    System.out.println("Colour all four sides.");
  }

}
