package it.unibo.shapes.impl.Shape;

import it.unibo.shapes.api.Shape.Polygon;
import static java.lang.Math.pow;

public class Square implements Polygon {
    private final int num_edge;
    private final double edge;

    public Square(final int num_edge, final double edge) {
        this.num_edge = num_edge;
        this.edge = edge;
    }

    public int getEdgeCount() {
        return this.num_edge;
    }

    @Override
    public double calcolaPerimetro() {
        return edge*getEdgeCount();
    }

    @Override
    public double calcolaArea() {
        return pow(edge, 2);
    }

    public String toString() {
        return "Square [ "
            + "\n Num Lati = " + this.getEdgeCount()
            + "\n Misura Lati = " + this.edge
            + "\n Perimetro = " + this.calcolaPerimetro()
            + "\n Area = " + this.calcolaArea()
            + "\n ]";
    }
}
