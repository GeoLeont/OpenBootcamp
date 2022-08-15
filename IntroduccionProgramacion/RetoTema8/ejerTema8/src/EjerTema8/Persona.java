package EjerTema8;

import java.util.Scanner;


public  class Persona {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Perso persona1 = new Perso(33,"Andres",526988431);
        System.out.println("Edad: "+persona1.getEdad());
        System.out.println("Nombre: "+persona1.getNombre());
        System.out.println("Telefono: "+persona1.getTelefono());

        System.out.println("ingrese nueva edad: ");
        String inEdad = scanner.nextLine();
        System.out.println("Ingrese nuevo nombre: ");
        String inNombre = scanner.nextLine();
        System.out.println("Ingrese nuevo numero de telefono");
        String inTelefono = scanner.nextLine();

        persona1.cambioEdad(inEdad);
        persona1.cambioNombre(inNombre);
        persona1.cambioTelefono(inTelefono);

        System.out.println("Nueva edad: "+persona1.getEdad());
        System.out.println("Nuevo nombre: "+ persona1.getNombre());
        System.out.println("Nuevo telefono: "+ persona1.getTelefono());

    }
}


 class Perso{
    private int edad;
    private String nombre;
    private long telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public Perso(int edad, String nombre, long telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void cambioEdad (String eDad){
        int edad = Integer.parseInt(eDad);
        setEdad(edad);
    }

    public void cambioNombre(String nom) {
        setNombre(nom);
    }
    public void cambioTelefono (String Tel){
        long telefonoN = Long.parseLong(Tel);
        setTelefono(telefonoN);
    }
}