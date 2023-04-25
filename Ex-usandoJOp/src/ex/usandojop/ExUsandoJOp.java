/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex.usandojop;
import javax.swing.JOptionPane;

/**
 *
 * @author marlo
 */
public class ExUsandoJOp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int r= 0;
        int n1= Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro  número... "));
        int n2= Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo  número... "));
        r=(n1*n2);
        JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: "+r);
    }
    
}
