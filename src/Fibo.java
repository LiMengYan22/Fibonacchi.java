import java.util.*;
public class Fibo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero,fibo1,fibo2,i;
        do{
        System.out.print("Introduce Número para la Serie de repeticiones: ");
        numero = sc.nextInt();
        }while(numero<=1);
        System.out.println("Los " + numero + " primeros Términos de la Serie son:");
        fibo1=1;
        fibo2=1;
        System.out.print(fibo1 + " ");
        for(i=2;i<=numero;i++){
             System.out.print(fibo2 + " ");
             fibo2 = fibo1 + fibo2;
             fibo1 = fibo2 - fibo1;
        }
        System.out.println();
    }
}
//Serie de Fibonacchi en Java
//Programa que imprime los N primeros números de la serie de Fibonacchi.
//El primer número de la serie es 1, el segundo número es 1 y cada uno de los
//siguientes es la suma de los dos anteriores: 1, 1, 2, 3, 5, 8, 13.. , N
