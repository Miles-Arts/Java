
/***/
public class AutoElectrico extends Automovil
{
    
    private int nivelCarga;

    
    public AutoElectrico()
    {
        super();
        nivelCarga = 50;
    }

    
    public void recargar()
    {
       nivelCarga = 100;
       
    }
    
     public void mostrarCarga()
    {
       System.out.println("El nivel de carga es: " + nivelCarga);
       
    }
    
    
}
