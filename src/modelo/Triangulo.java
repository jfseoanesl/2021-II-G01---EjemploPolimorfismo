/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jairo
 */
public class Triangulo extends FiguraGeometrica {
    private int dimension2;

    public Triangulo(int dimension2, int dimension1) {
        super(dimension1);
        this.dimension2 = dimension2;
    }

    /**
     * @return the dimension2
     */
    public int getDimension2() {
        return dimension2;
    }

    /**
     * @param dimension2 the dimension2 to set
     */
    public void setDimension2(int dimension2) {
        this.dimension2 = dimension2;
    }

    @Override
    public double getArea() {
        return (this.dimension2 * this.getDimension1())/(double)2;
    }

    @Override
    public double getPerimetro() {
        return 0;
    }
    
    
}
