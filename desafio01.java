import java.util.Scanner;

public class Desafio {
/**
* <h1> Desafio de código </h1>
* Nesse desafio, dados dois números, 
* verifique se eles são iguais. 
* Caso sejam, retorne "Sao iguais!”.
* Caso contrário, retorne "Nao sao iguais!” 
* sem as aspas.
* <p>
* <b> Note: </b> Lei atentamente a a descrição
* do desafio

* <h1> Entrada </h1>
*As entradas serão dois valores, um em cada linha,
* representados por A e B, que sempre serão números inteiros. 
* <h1> Saída </h1>
* A saída deverá retornar a frase "Sao iguais!" caso A e B sejam o mesmo valor.
*  Caso contrário,  retorne "Nao sao iguais!", sem as aspas.
* @author Lucas Rocha
* @version 1.0
* @since 22/10/2022
*/
    public static void main(String[] args) {
    
                int  a;
                int  b;
                
                Scanner leitor = new Scanner(System.in);

                System.out.printf("Informe o primeiro valor: ");
                a = leitor.nextInt(); 

                System.out.printf("Informe o segundo valor.: ");
                b = leitor.nextInt(); 
               
                if(a==b){
                    System.out.println("São iguais");
                }
                    System.out.println(" Não são iguais");
                }
            }