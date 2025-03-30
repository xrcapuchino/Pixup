package org.Vazquez.Rojas.Diego.Alejandro.pixup.vista;

public class Consola implements Ejecutable{
    private static Consola consola;

    public Consola() {
    }

    public static Consola getInstance( )
    {
        if( consola == null )
        {
            consola = new Consola( );
        }
        return consola;
    }

    public void run(){
        boolean flag = true;
        int opcion = 0;
        while (flag){


        }

    }
}
