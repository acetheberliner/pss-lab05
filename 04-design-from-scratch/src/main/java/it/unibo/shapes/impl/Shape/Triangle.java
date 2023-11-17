package it.unibo.shapes.impl.Shape;

import it.unibo.shapes.api.Shape.Polygon;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Triangle implements Polygon{
    private final int num_edge;
    private final double edge1;
    private final double edge2;
    private final double edge3;

    public Triangle(final int num_edge, final double edge1, final double edge2, final double edge3) {
        this.num_edge = num_edge;
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }

    public int getEdgeCount() {
        return this.num_edge;
    }

    @Override
    public double calcolaPerimetro() {
        return edge1 + edge2 + edge3;
    }

    @Override
    public double calcolaArea() {
        //impiego della formula di Erone
        double semiperim = (calcolaPerimetro()/2);
        return sqrt(pow(semiperim, 3) * ((semiperim-edge1) * (semiperim-edge2) * (semiperim-edge3)));
    }

    public String toString() {
        return "Triangle [ "
            + "\n Num Lati = " + this.getEdgeCount()
            + "\n Misura lato 1 = " + this.edge1
            + "\n Misura lato 2 = " + this.edge2
            + "\n Misura lato 3 = " + this.edge3
            + "\n Perimetro = " + this.calcolaPerimetro()
            + "\n Area = " + this.calcolaArea()
            + "\n ]";
    }
}
