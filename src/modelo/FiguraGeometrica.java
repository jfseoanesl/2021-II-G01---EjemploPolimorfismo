
package modelo;

/**
 *
 * @author jairo
 */
public abstract class FiguraGeometrica {
    private int dimension1;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(int dimension1) {
        this.dimension1 = dimension1;
    }

    /**
     * @return the dimension1
     */
    public int getDimension1() {
        return dimension1;
    }

    /**
     * @param dimension1 the dimension1 to set
     */
    public void setDimension1(int dimension1) {
        this.dimension1 = dimension1;
    }
    
    public abstract double getArea();
    public abstract double getPerimetro();
    
}
