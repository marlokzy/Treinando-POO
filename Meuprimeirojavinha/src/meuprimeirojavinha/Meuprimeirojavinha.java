/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meuprimeirojavinha;
import java.util.Scanner;
/**
 *
 * @author marlon
 */
public class Meuprimeirojavinha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner entrada= new Scanner(System.in);// isto é a instância da classe Scanner
        // agora o java vai ler o primeiro numero
        System.out.println("Informe o primeiro número...");
        n1=entrada.nextInt();// nextInt - método para resgatar o valor 
        
        System.out.println("Informe o segundo número...");
        n2=entrada.nextInt();// nextInt - método para resgatar o valor 
        
        System.out.println();// usei para dar um espaço um pouco maior
        System.out.println("O resultado da multiplicação é: " +(n1*n2));    
        
        }
    
}
