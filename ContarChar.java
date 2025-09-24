package App6;

public class ContarChar{
    public static  int contar(String texto, char objetivo){
        if (texto == null || texto.isEmpty()){ //verificar si esta vacio
            return 0;
        }

        if(texto.charAt(0) == objetivo){ //compara si es igual con charAt
            return 1 + contar(texto.substring(1), objetivo);
        } else {
            return contar(texto.substring(1), objetivo);
        }
    }
        public static void main (String[] args){
            System.out.println(contar("programacion", 'o'));
            System.out.println(contar("aaaa", 'a'));
            System.out.println(contar("", 'x'));
        }
    }
