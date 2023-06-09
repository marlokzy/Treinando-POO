/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excecoespoo2;

import javax.swing.*;

/**
 *
 * @author marlo
 */
public class ExcecoesPOO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /* SEM O TRATAMENTO DAS EXCEÇÕES
       int indice;
       String nomes [] = new String [2]; // tamanho =2
       
       nomes[0] = "José";
       nomes[1] = "Maria";
       
       String entrada = JOptionPane.showInputDialog("Informe o indice");
       indice= Integer.parseInt(entrada);
       JOptionPane.showMessageDialog(null,(nomes[indice]));*/
       
       //COM O TRATAMENTO DAS EXCEÇÕES
       int indice;
       String nomes [] = new String [2]; // tamanho =2
       
       try{
       nomes[0] = "José";
       nomes[1] = "Maria";
       
       String entrada = JOptionPane.showInputDialog("Informe o indice");
       indice= Integer.parseInt(entrada);
       JOptionPane.showMessageDialog(null,(nomes[indice]));
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Erro na entrada de dados");
       }
       catch(ArrayIndexOutOfBoundsException e){
           JOptionPane.showMessageDialog(null, "Ultrapassou o limite do indice");
       }
    }
    
}
