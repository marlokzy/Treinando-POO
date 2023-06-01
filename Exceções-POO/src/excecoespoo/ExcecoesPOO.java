/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excecoespoo;

import javax.swing.*;

/**
 *
 * @author marlon
 */
public class ExcecoesPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* *testando a=5 e b=0 vai dar erro* 
        int a, b, divisao, resto;
        String entrada;
        
        entrada = JOptionPane.showInputDialog("Informe um número inteiro");
        a= Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog("Informe outro número inteiro");
        b= Integer.parseInt(entrada);
        
        divisao= a/b;
        resto= a%b;
        
        JOptionPane.showMessageDialog(null, "a/b = " + divisao);
        JOptionPane.showMessageDialog(null, "a%b = " + resto);*/
        
        // *tratando esse erro*
        int a, b;
        String entrada;
        
        try{
            entrada = JOptionPane.showInputDialog("Informe um número inteiro");
            a= Integer.parseInt(entrada);//transforma em inteiro o valor digitado em entrada
            entrada = JOptionPane.showInputDialog("Informe outro número inteiro");
            b= Integer.parseInt(entrada);//idem

            JOptionPane.showMessageDialog(null, "Divisão de a com b = " + (a/b));
            JOptionPane.showMessageDialog(null, "Resto de a com b = " + (a%b));
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Erro na entrada de dados");//testa a=4 e b=2.5
        }
        catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Divisão por zero");//testa a=5 e b=0
        }
        finally{  // é opcional esse bloco de código
            JOptionPane.showMessageDialog(null, "***Final da execução***");
        }
    }
    
}
