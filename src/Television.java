public class Television extends Electrodomestico{
protected final int pulgadas_F=20;
protected final boolean sintonizador_F=false;

protected int pulgadas;
protected boolean sintonizador;

public Television(){

}
    public Television(int precio_base,int peso, int pulgadas, boolean sintonizador){
        this.precio_base=precio_base;
        this.peso=peso;
        this.color=color_F;
        this.consumo_energetico=consumo_energetico_F;
        this.pulgadas=pulgadas;
        this.sintonizador=sintonizador;
    }

    public Television(int precio_base, String color, char consumo_energetico, int peso, int pulgadas, boolean sintonizador){
    super(precio_base,color, consumo_energetico, peso);
    this.pulgadas=pulgadas;
    this.sintonizador=sintonizador;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public int precioFinal(){
    double preciofinal3 = super.precioFinal();
    if(pulgadas >= 40){
        preciofinal3=0.3*super.precioFinal();
    }
    if(!sintonizador){
        preciofinal3+=50;
    }
        return (int) preciofinal3;
    }

}
