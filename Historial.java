import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Historial {

    Stack<String> acciones = new Stack<>();
    Stack<String> rehacer = new Stack<>();

    public void hacer(String accion){
        acciones.push(accion);
    }

    public String deshacer(){
        String accion = acciones.pop();
        System.out.println("Accion deshecha: " + accion);
        return rehacer.push(accion);
    }

    public String rehacer(){
        String accion = rehacer.pop();
        System.out.println("Accion recuperada: " + accion);
        return acciones.push(accion);
    }
    public static void main(String[] args) {
        Historial historial = new Historial();
        historial.hacer("Escribir Hola");
        historial.hacer("Borrar palabra");
        historial.hacer("Escribir Mundo");

        for (String actions : historial.acciones) {
            System.out.println(actions);
        }

        historial.deshacer();
        historial.deshacer();
        
        historial.rehacer();

        System.out.println("----------------------------------");
        System.out.println("Acciones actualizadas:");

        for (String actions : historial.acciones) {
            System.out.println(actions);
        }

        

    }
}