package asociacion;

import java.util.Scanner;

public class Asociacion {

    public static void main(String[] args) {
        int id = 0, idcurso = 0, op = 0,idcarrera=0,idprograma=0;
        String nombre = "", apellido = "", nombrecurso = "",nombrecarrera="",nombreprograma="",nombreTitulo="";
        Scanner teclado = new Scanner(System.in);
        System.out.println("********Ingreso de Datos******");
        System.out.println("Alex");
        System.out.print("Codigo: ");
        id = teclado.nextInt();
        System.out.print("Nombre: ");
        nombre = teclado.next();
        System.out.print("Apellido: ");
        apellido = teclado.next();
        System.out.println("****Curso***");
        System.out.print("Codigo del Curso: ");
        idcurso = teclado.nextInt();
        System.out.print("Nombre del Curso: ");
        nombrecurso = teclado.next();
        System.out.println("**Tipo Estudiante**");
        System.out.println("1)Estudiante Posgrado");
        System.out.println("2)Estudiante Pregrado");
        System.out.print("Elija una opcion: ");
        op = teclado.nextInt();
        if (op == 2) {
            System.out.println("****Carrera***");
            System.out.print("Codigo de la Carrera: ");
            idcarrera = teclado.nextInt();
            System.out.print("Nombre de la Carrera: ");
            nombrecarrera = teclado.next();
            Estudiante_Pregrado Estudiante1 = new Estudiante_Pregrado(id, nombre, apellido, new Curso(idcurso, nombrecurso), new Carrera(idcarrera, nombrecarrera));
            System.out.println("*****************Impresion de Datos************");
            Estudiante1.imprimirDatos();
        } else {
            System.out.print("Ingrese el Titulo: ");
            nombreTitulo = teclado.next();
            System.out.println("****Programa***");
            System.out.print("Codigo del Programa: ");
            idprograma = teclado.nextInt();
            System.out.print("Nombre del Programa: ");
            nombreprograma = teclado.next();
            Estudiante_Posgrado Estudiante2 = new Estudiante_Posgrado(id, nombre, apellido, new Curso(idcurso, nombrecurso), nombreTitulo, new Programa(idprograma, nombreprograma));
            System.out.println("*****************Impresion de Datos************");
            Estudiante2.imprimirDatos();
        }

    }

}
