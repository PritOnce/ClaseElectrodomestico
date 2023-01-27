public class Main {
    public static void main(String[] args) {

        Electrodomestico [] e1 = new Electrodomestico[10];

        double precioElectrodomesticos=0;
        double precioSecadoras=0;
        double precioTelevision=0;

        e1 [0] = new Electrodomestico(30,"ROSA",'A',60);
        /*e1 [1] = new Television(150,"ROJO",'F',60,50,true);
        e1 [2] = new Electrodomestico(90,"NARANJA",'F',10);
        e1 [3] = new Secadora(60,30,90,'F',"ROJO");
        e1 [4] = new Electrodomestico(300,"BLANCO",'C',120);
        e1 [5] = new Television(600,"ROJO",'D',55,70,false);
        e1 [6] = new Television(250,"LILA",'A',45,40,false);
        e1 [7] = new Electrodomestico(700,"AMARILLO",'D',1);
        e1 [8] = new Electrodomestico(1000,"BLANCO",'B',5);
        e1 [9] = new Secadora(50,250,130,'E',"GRIS");*/

        /*for (int i=0; i< e1.length;i++){
            if (e1[i] instanceof Electrodomestico){
                precioElectrodomesticos+=e1[i].precioFinal();
            }
            if (e1[i] instanceof Television){
                precioTelevision+=e1[i].precioFinal();
            }
            if (e1[i] instanceof Secadora){
                precioSecadoras+=e1[i].precioFinal();
            }
        }*/

        System.out.println(e1[0]);

        /*System.out.println("Precio de los Electrodomésticos " +precioElectrodomesticos);
        System.out.println("Precio de las Televisiones " +precioTelevision);
        System.out.println("Precio de las Secadoras " +precioSecadoras);*/
    }

}