package org.Vazquez.Rojas.Diego.Alejandro.pixup.vista;
public class Ventana implements Ejecutable {
    private static Ventana ventana;

    public Ventana() {
    }

    public static Ventana getInstance( )
    {
        if( ventana == null )
        {
            ventana = new Ventana( );
        }
        return ventana;
    }

    public void run()
    {}
}
