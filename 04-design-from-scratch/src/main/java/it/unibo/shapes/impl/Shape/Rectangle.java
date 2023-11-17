package it.unibo.shapes.impl.Shape;

import it.unibo.shapes.api.Shape.Polygon;

public class Rectangle implements Polygon {
    private final int num_edge;
    private final double length;
    private final double heigth;

    public Rectangle(final int num_edge, final double length, final double heigth) {
        this.length = length;
        this.heigth = heigth;
        this.num_edge = num_edge;
    }

    public int getEdgeCount(){
        return this.num_edge;
    }

    @Override
    public double calcolaPerimetro() {
        return (length + heigth) * 2;
    }

    @Override
    public double calcolaArea() {
        return length * heigth;
    }

    public String toString() {
        return "Rectangle [ "
            + "\n Num Lati = " + this.getEdgeCount()
            + "\n Miusra Base = " + this.length
            + "\n Miusra Altezza = " + this.heigth
            + "\n Perimetro = " + this.calcolaPerimetro()
            + "\n Area = " + this.calcolaArea()
            + "\n ]";
    }
}
