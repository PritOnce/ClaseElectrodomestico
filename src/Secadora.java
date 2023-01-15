public class Secadora extends Electrodomestico {
     protected final int carga_F=5;

     protected int carga;

     public Secadora(){

     }

    public Secadora(int precio_base,int peso, int carga){
        this.precio_base=precio_base;
        this.peso=peso;
        this.color=color_F;
        this.consumo_energetico=consumo_energetico_F;
        this.carga=carga;
    }
    public Secadora (int carga,int precio_base, int peso, char consumo_energetico, String color){
        super(precio_base, color,consumo_energetico, peso);
        this.carga=carga;
    }

    public int getCarga() {
        return carga;
    }

    public int precioFinal(){
         double preciofinal2 = super.precioFinal();
         if(carga>=30){
             preciofinal2+=50;
         }
         return (int) preciofinal2;
    }
}
