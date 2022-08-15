package ejrUno;


public class ejercicio1 {
    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.sumarPuertas();
        System.out.println("El numero de puertas es: " + miCoche.puertas);


        int suma;
        suma=num(5,6,2);
        System.out.println(suma);

    }
    public static int num(int num1, int num2, int num3){
        return num1+num2+num3;
    }



}

class coche{
    public int puertas = 4;
    public void sumarPuertas(){
        this.puertas++;
    }

}
