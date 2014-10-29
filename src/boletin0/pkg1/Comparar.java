
package boletin0.pkg1;

import javax.swing.JOptionPane;

public class Comparar {
    private double numero1,numero2;
    
    public Comparar (double n1 , double n2){
        n1=numero1;
        n2=numero2;
    }
   public Comparar(){
       }
   public double pedirDato(){
      String resposta=JOptionPane.showInputDialog("introduce dato");
      double valor=Double.parseDouble(resposta);
      return valor;
      }
   public void compararSimple(){
       if(numero1>numero2)
           System.out.println(numero1+"é maior");
   }
   public void compararSimple(double n1,double n2){
       if(n1>n2)
           JOptionPane.showMessageDialog(null, "o maior é "+n1);
   }
    }
