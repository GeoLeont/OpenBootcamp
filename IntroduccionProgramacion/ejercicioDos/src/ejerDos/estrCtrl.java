package ejerDos;

public class estrCtrl {
    public static void main(String[] args) {
        int numeroIf = -5;
        int numeroWhile =0;
        int numeroFor;
        var estacion="VERANO";

        if (numeroIf< 0){
            System.out.println("Es un numero Negativo.");
        } else if (numeroIf>0) {
            System.out.println("Es un Numero Positivo.");
        } else {
            System.out.println("el numero es Cero '0'");
        }

        while (numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        do {
            System.out.println("El numero Do-While: "+numeroWhile);
            numeroWhile++;
        }while (numeroWhile<1);

        for (numeroFor=0; numeroFor<=3;numeroFor++){
            System.out.println("Numero For: "+numeroFor);
        }

        switch (estacion){
            case "INVIERNO":
                System.out.println("La estacion es Invierno.");
                break;
            case "OTONO":
                System.out.println("La estacion es Otono.");
                break;
            case "VERANO":
                System.out.println("La estacion es Verano.");
                break;
            case "PRIMAVERA":
                System.out.println("La estacion es Primavera");
                break;
        }



    }
}
