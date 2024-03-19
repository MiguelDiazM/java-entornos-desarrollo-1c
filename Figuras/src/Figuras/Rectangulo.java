package Figuras;
public class Rectangulo {

    private int base;
    private int altura;
    
    public Rectangulo() {
    	this.base=1;
    	this.altura=1;
    }

    public Rectangulo(int base, int altura) {
       this.base=base;
       this.altura=altura;
    }

    public void setBase(int base) {
        this.base=base;
    }

 
    public int getBase() {
        
        return base;
    }

   
    public void setAltura(int altura) {
       this.altura=altura;
    }

    public int getAltura() {
        
        return altura;
    }

 
    public int CalcularArea() {
      return base*altura;
    }

    public int CalcularPerimetro() {
       return (base+base)+(altura+altura); 
    }

}