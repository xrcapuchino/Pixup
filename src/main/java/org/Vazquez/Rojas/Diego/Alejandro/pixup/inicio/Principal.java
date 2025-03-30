package org.Vazquez.Rojas.Diego.Alejandro.pixup.inicio;

import org.Vazquez.Rojas.Diego.Alejandro.pixup.util.ReadUtil;
import org.Vazquez.Rojas.Diego.Alejandro.pixup.vista.Consola;
import org.Vazquez.Rojas.Diego.Alejandro.pixup.vista.Ejecutable;
import org.Vazquez.Rojas.Diego.Alejandro.pixup.vista.Menu;

public class Principal {
    public static void main (String a[]) {

        boolean flag = true;
        int opcion = 0;
        Ejecutable ejecutable = null;
        while (flag) {
            ejecutable = null;
            Menu.principal();
            opcion = ReadUtil.getInstance().leerInt();
            switch (opcion){
                case 1:
                    ejecutable = Consola.getInstance();
                    break;
                case 2:
                    break;

            }

        }

    }
}
