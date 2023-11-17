package it.unibo.shapes.impl.Shape;

import it.unibo.shapes.api.Shape.Shape;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle implements Shape {
  private final double radius;

  public Circle(final double radius) {
    this.radius = radius;
  }

  public double calcolaPerimetro() {
    return 2*PI*this.radius;
  }

  public double calcolaArea() {
    return PI*pow(this.radius, 2);
  }

  public String toString() {
    return "Circle [ "
        + "\n Raggio = " + this.radius
        + "\n Perimetro = " + this.calcolaPerimetro()
        + "\n Area = " + this.calcolaArea()
        + "\n ]";
  }
}
