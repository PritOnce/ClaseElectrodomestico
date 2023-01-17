public class Electrodomestico {
protected final int precio_base_F=100;
protected final String color_F="BLANCO";
protected final char consumo_energetico_F='F';
protected final int peso_F=5;

protected int precio_base;
protected String color;
protected char consumo_energetico;
protected int peso;



    public Electrodomestico() {
    }

    public Electrodomestico(int precio_base,int peso){
        this.precio_base=precio_base;
        this.peso=peso;
        this.color=color_F;
        this.consumo_energetico=consumo_energetico_F;
    }

    public Electrodomestico(int precio_base, String color, char consumo_energetico, int peso) {
        comprobarColor(color);
        comprobarConsumnoEnergetico(consumo_energetico);
        this.peso=peso;
        this.precio_base=precio_base;

    }

    public int getPrecio_base() {
        return precio_base;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo_energetico() {
        return consumo_energetico;
    }

    public int getPeso() {
        return peso;
    }

    private void comprobarConsumnoEnergetico(char consumo_energetico){
        if(consumo_energetico>= 'A' && consumo_energetico<= 'F'){
            this.consumo_energetico=consumo_energetico;
        }else{
            this.consumo_energetico=consumo_energetico_F;
        }

    }
    private void comprobarColor(String color){
        String tipo_color [] = {"BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS"};
        if(color.equals(tipo_color)){
            this.color=color;
        }else{
            this.color=color_F;
        }
    }

    public double precioFinal(){
        double preciofinal=0;
        switch (consumo_energetico){
            case 'A': preciofinal=precio_base+100;
            break;

            case 'B': preciofinal=precio_base+80;
            break;

            case 'C': preciofinal=precio_base+60;
                break;

            case 'D': preciofinal=precio_base+50;
                break;

            case 'E': preciofinal=precio_base+30;
                break;

            case 'F': preciofinal=precio_base+10;
                break;

            default:preciofinal=precio_base;
        }

        if(peso>=0 && peso<=19){
            preciofinal+=10;
        } else if (peso>=20 && peso<=49) {
            preciofinal+=50;
        } else if (peso>=50 && peso<=79) {
            preciofinal+=80;
        }else {
            preciofinal+=100;
        }
        return preciofinal;
    }
}

