import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Persona will = new Persona();
        will.nombre = "William Esteban";
        will.edad = 28;
        will.activo = true;
        will.altura = 1.70;
        will.fecha = new Date();

        System.out.println(will.nombre);
        System.out.println(will.edad);
        System.out.println(will.activo);
        System.out.println(will.altura);
        System.out.println(will.fecha);

        //instanciar la historia clinica

        Historiaclinica historiaClinica = new Historiaclinica();
        historiaClinica.eps = "Sanitas";
        historiaClinica.ips = "San Pedro";
        historiaClinica.persona = will;

        System.out.println(historiaClinica.eps);
        System.out.println(historiaClinica.ips);

        //instaciar visita medica

        Visitamedica visitamedica = new Visitamedica();
        visitamedica.fecha = new Date("2022/01/01");
        visitamedica.diagnostico="hidrocefalia";
        visitamedica.sintomas = "mareo";

        System.out.println(visitamedica.fecha);
        System.out.println(visitamedica.sintomas);
        System.out.println(visitamedica.diagnostico);


        historiaClinica.visitamedicas = new ArrayList<>();
        historiaClinica.visitamedicas.add(visitamedica);

        will.type = "profesor";
        System.out.println(will.trabajar());

        Profesor profesor = new Profesor();
        profesor.trabajar();
        System.out.println(profesor.trabajar());

        Deportista deportista = new Deportista();
        deportista.trabajar();
        System.out.println(deportista.trabajar());

        Bombero bombero = new Bombero();
        bombero.trabajar();
        System.out.println(bombero.trabajar());

    }
}