/** Aprendo*/
public class PrimeraClase
{
    public static void main (String[] args){

        int edad = 22;
        String descripcionEdad = "";
        String nombre = "Celeste";
        // if = si "la pregunta tiene respuesta verdadera" 
        //entra a mi estructura
        // < , > , == , >= , <= Operadores comparación
        //Operadores Logicos
        // && El operador L. "Y" y entra al ser todo verdadero
        // || El operador L. "O" y entra al ser una o varias de las P.V.
        if  (edad >= 18 && edad <=40)  {
            if (edad < 18 && nombre == "Celeste"){

                if (edad < 18 && nombre == "Celeste"){

                }
            }
            descripcionEdad = "Eres interesante me puedes llamar";   
            System.out.println(descripcionEdad);

        }else if (nombre == "Miranda"){
            descripcionEdad = "Eres mala persona y creída";
            System.out.println(descripcionEdad);

        }
    }    
}
