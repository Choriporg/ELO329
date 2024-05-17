import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Atributos
    static Scanner input = new Scanner(System.in);
    static ArrayList<Persona> personas = new ArrayList<Persona>();
    
    public static void main(String[] args) {

        
    }
    
}

public class Persona{

    //Atributos
    protected String nombre;
    protected String apellido;
    protected int edad;

    //Constructor
    public Persona(String name, String lastname, int age){
        nombre = name;
        apellido = lastname;
        edad = age;
    }

    //Getters
    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public int getEdad(){
        return edad;
    } 
}

public class Futbolista extends Persona{
    //Atributos
    private int dorsal;
    private String posicion;

    //Constructor
    public Futbolista(String name, String lastname, int age, int numberShirt, String position){
        super(name, lastname, age);
        dorsal = numberShirt;
        posicion = position;        

    }
    //Getters
    public int getDorsal(){
        return dorsal;
    }
    public String getPosicion(){
        return posicion;
    }
}

public class Entrenador extends Persona{
    //Atributos
    private String estrategia;

    //Constructor
    public Entrenador(String name, String lastname, int age, String strategy){
        super(name, lastname, age);
        estrategia = strategy;
    }

    //Getters
    public String getEstrategia(){
        return estrategia;
    }
}

public class Medico extends Persona{
    //Atributos
    String titulo;
    int aniosExperiencia;

    //Constructor
    public Medico(String name, String lastname, int age, String career, int expirienceYears){
        super(name, lastname, age);
        titulo = career;
        aniosExperiencia = expirienceYears;
    }

    //Getters
    public String getTitulo(){
        return titulo;
    }

    public int getAniosExperiencia(){
        return aniosExperiencia;
    }
}

    