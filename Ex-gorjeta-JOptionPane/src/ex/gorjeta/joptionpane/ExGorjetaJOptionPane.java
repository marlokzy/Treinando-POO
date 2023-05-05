/*
Desenvolva o código de um programa
que irá calcular o valor total de uma conta dividida
entre a quantidade de pessoas
e de uma gorjeta de acordo
com o valor da conta e o número de pessoas
 */

package ex.gorjeta.joptionpane;
import javax.swing.JOptionPane;

/**
 *
 * @author marlon
 */
public class ExGorjetaJOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valorTotal= 0;
        double valorgorjeta= 0;
        
        int pessoas= Integer.parseInt(JOptionPane.showInputDialog("Informe o número de pessoas..."));
        double valorconta= Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da conta..."));
        
        valorTotal = (valorconta/pessoas);
        
        JOptionPane.showMessageDialog(null, "O valor divido para cada pessoa fica...  R$"+valorTotal);
        
        valorgorjeta = ((valorconta*0.10)/pessoas);
        
        JOptionPane.showMessageDialog(null, "O valor da gorjeta para cada pessoa fica...  R$"+valorgorjeta);


    }
    
}
