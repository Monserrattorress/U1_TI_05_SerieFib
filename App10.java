package App6;

import java.util.ArrayList;
import java.util.List;

public class App10{
    //Metodos

    private List<String> materias = new ArrayList<>();
    public void agregar(String materia){
        materias.add(materia);
    }

    public boolean contiene(String materia){
        for (String m : materias) {
            if(m.equals(materia)){
                return true;
            }
        }
        return false;
    }

    public void imprimir(){
        System.out.println("Materias: " + materias);
    }

    public static void main(String[] args) throws Exception{
        App10 lista = new App10();

        lista.agregar("Matematicas");
        lista.agregar("Fisica");
        lista.agregar("Química");
        lista.agregar("Historia");
        lista.agregar("Programación");

        lista.imprimir();

        String buscar = "Programación";
        System.out.println("Busqueda: " + buscar);

        if(lista.contiene(buscar)){
            System.out.println("Resultado: Materia encontrada");
        } 
    }


}