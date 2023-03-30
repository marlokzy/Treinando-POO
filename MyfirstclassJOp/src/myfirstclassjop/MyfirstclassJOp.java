/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myfirstclassjop;
import javax.swing.JOptionPane;

/**
 *
 * @author marlo
 */
public class MyfirstclassJOp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String N1= JOptionPane.showInputDialog("Digite o valor de N1");
        JOptionPane.showMessageDialog(null, "O número digitado é: "+N1);
        JOptionPane.showConfirmDialog(null, "O Marlon é legal?",
                "Escolha o sim tá...", JOptionPane.YES_NO_CANCEL_OPTION);
    }
    
}
