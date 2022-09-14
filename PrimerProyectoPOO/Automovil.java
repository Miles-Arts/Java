/***/
public class Automovil
{
    public String marca;
    public int precio;
    public int numPuertas;
    public String color;
    
    public Automovil()
    {
       marca = "Mazda";
       precio = 200000;
       numPuertas = 4;
       color = "Negro";
    }
    
    
    public Automovil(String m, int p, int nP, String c){
    
        marca = m;
        precio = p;
        numPuertas = nP;
        color = c;
    
    }    
    
    public void mostrarPropiedades()
    {
        System.out.println("El automovil es de la marca " + marca + " Su precio es de $" + precio + " pesos. Tiene " + numPuertas + " puertas y su color es " + color + ".");
    }
    
    public void encenderAcelerar(){
        
        System.out.println("El automovil encendió.");
    }
    
    public void acelerar(){
    
        System.out.println("El automovil acelera.");
    }
}
