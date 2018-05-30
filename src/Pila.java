public class Pila 
{
    private int[] tamaño;
    private int tope, max;
    private boolean verifica = false;

    public Pila(int tam) 
    {
        tamaño = new int[tam];
        tope = -1;
        max = tamaño.length - 1;
    }
    
    private boolean pilaLena()
    {
        if(tope == max)
        {
           verifica = true;
        }
        
        else
        {
            verifica = false;
        }
        return verifica;
    }
    private boolean pilaVacia()
    {
        if(tope < 0)
        {
           verifica = true;
        }
        
        else
        {
            verifica = false;
        }
        return verifica;
    }
    
    public void agregarElementos(int cant,int dato)
    {
        if(pilaLena())
        {
            System.out.println("La pila esta llena");
        }
        else
        {
            int x = 0;
            while(x<cant && !pilaLena())
            {
                
                tope++;
                tamaño[tope] = dato;
                x++;
            }
            if(tope==max)
            {
                System.out.println("\nSeccion llena, sobraron " + (cant-x) + " cargas");
            } 
        }
    }
    
    public void quitarelementos(int cant)
    {
        if(pilaVacia())
        {
            System.out.println("La pila esta vacia");
        }
        else
        {
            int x = 0;
            while(x<cant && !pilaVacia())
            {
                tamaño[tope] = 0;
                tope--;
                x++;
            }
        }
    }
    
    public String imprimirPila()
    {
        String n = "";
        for(int x = 0;x<tamaño.length;x++)
        {
           n = n + tamaño[x] + " ";
        }
        return n;
    }
    
    
    
}
