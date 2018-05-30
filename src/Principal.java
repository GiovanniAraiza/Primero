
import javax.swing.JOptionPane;

public class Principal 
{
    public static void main(String[] args) 
    {
        Pila seccionA = new Pila(15);
        Pila seccionB = new Pila(15);
        Pila seccionC = new Pila(15);
        int n = 0;
        while(n!=4)
        {
            try {
                n = Integer.parseInt(JOptionPane.showInputDialog(null, "_____________Menu____________\n1.Agregar cargamento\n2.Quitar cargamento\n3.Ver estado de secciones\n4.Salir", "Informacion", 3));
            } catch (Exception e) {
                n = 0;
            }

            if(n==1)
            {
                  String opc = JOptionPane.showInputDialog("¿En que seccion pondras el cargamento?\nA\nB\nC");
                  int cant = Integer.parseInt(JOptionPane.showInputDialog("Cantidad del cargamento"));
                  int num = Integer.parseInt(JOptionPane.showInputDialog("¿Que numero contienen los cargamentos?"));
                  if(opc.equalsIgnoreCase("a"))
                  {
                      seccionA.agregarElementos(cant, num);
                  }
                  else
                  {
                      if(opc.equalsIgnoreCase("b"))
                      {
                          seccionB.agregarElementos(cant, num);
                      }
                      else
                      {
                          if(opc.equalsIgnoreCase("c"))
                          {
                              seccionC.agregarElementos(cant, num);
                          }
                      }
                  }
            }
            if(n==2)
            {
                  String opc = JOptionPane.showInputDialog("¿En que seccion quitaras cargamentos?\nA\nB\nC");
                  int cant = Integer.parseInt(JOptionPane.showInputDialog("Cantidad del cargamento"));
                  if(opc.equalsIgnoreCase("a"))
                  {
                      seccionA.quitarelementos(cant);
                  }
                  else
                  {
                      if(opc.equalsIgnoreCase("b"))
                      {
                          seccionB.quitarelementos(cant);
                      }
                      else
                      {
                          if(opc.equalsIgnoreCase("c"))
                          {
                              seccionC.quitarelementos(cant);
                          }
                      }
                  }
            }
            if(n==3)
            {
                String p = seccionA.imprimirPila();
                JOptionPane.showMessageDialog(null, "Seccion A: " +p+"\nSeccion B: "+seccionB.imprimirPila() + "\nSeccion C: "+seccionC.imprimirPila());
            }
        }
    }
}
