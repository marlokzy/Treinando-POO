/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excecoespoo3;

/**
 *
 * @author marlon
 */
public class ExcecoesPOO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=10, y=0, z=0;
        try{
            z=x/y; // gera uma arithmetic exception (divisão por zero)
        }
        catch(Exception erro) { //exceção genérica!!!
            System.out.println(erro.getMessage()); //mostra a mensagem de erro
            erro.printStackTrace(); //mostra a exceção e a linha onde ocorreu 
        }
    }
    
}
