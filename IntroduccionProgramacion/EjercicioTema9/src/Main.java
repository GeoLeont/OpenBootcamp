import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        System.out.println("Nombre: "+ cliente.nombre);
        System.out.println("Edad: "+ cliente.edad);
        System.out.println("Telefono: " + cliente.telefono);
        System.out.println("Credito: " + cliente.credito);



            }


    }
    class  Persona{
        int edad;
        String nombre;
        long telefono;

        Persona (){
            int edad = 55;
            String nombre="Andres";
            long telefono=305811778;
        }
    }

    class  Cliente extends Persona{
        long credito=5620112;

    }
    class Trabajador extends Persona{
        long salario;
    }

