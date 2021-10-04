/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import modelo.*;

/**
 *
 * @author jairo
 */
public class Test {
    public static void main(String[] args) {
        
        FiguraGeometrica figuras[] = new FiguraGeometrica[2];
        
        FiguraGeometrica figura1 = new Cuadrado(10);
        FiguraGeometrica figura2 = new Triangulo(10,20);
        
        figuras[0] = figura1;
        figuras[1] = figura2;
        
        for(int i=0; i<figuras.length;i++){
            System.out.println("Area: " + figuras[i].getArea());
            System.out.println("Perimetro: " + figuras[i].getPerimetro());
        }
        
        
    }
    
}
