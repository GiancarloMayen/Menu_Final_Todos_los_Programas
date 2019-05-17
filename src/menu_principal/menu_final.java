package menu_principal;
import ListasEnlazadas.Inicio;
import menu_principal.colas;
import Nomina.Departamentos_empleados;
import arbolBB.Vistaa;
import java.util.*;
import javax.swing.JOptionPane;
import planilla_ventana.Planilla_ventana;

/**
 *
 * @autor Giancarlo Mayen
 */
public class menu_final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int intOpcion_menu;

        do {
            
            intOpcion_menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Que programa desea ver primero:"
                    + "\n1. planilla sin bd\n2. planilla con bd\n3. listas\n4. pilas\n5. hanoi\n6. colas\n7. arboles\n8. salir"));

            switch (intOpcion_menu) {
                case 1:{
                    Departamentos_empleados.main(args);
                    break;}
                case 2:{
                    Planilla_ventana.main(args);
                    break;
                }
                case 3:{
                    Inicio.main(args);
                    break;
                }
                case 4:{
                    pila.main(args);
                    break;
                }
                case 5:{
                    hanoi.main(args);
                    break;
                }
                case 6:{
                    colas.main(args);
                    break;
                }
                case 7:{
                    Vistaa.main(args);
                    break;
                }
                case 8:
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (intOpcion_menu != 8);
    }

}
