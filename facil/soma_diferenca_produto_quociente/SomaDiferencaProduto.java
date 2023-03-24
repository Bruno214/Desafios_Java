package Desafios;

import java.util.Scanner;

public class SomaDiferencaProduto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        int soma = somarNumeros(numero1, numero2);
        int diferenca = diferencaNumeros(numero1, numero2);
        int produto = produtoNumeros(numero1, numero2);

        System.out.println("A soma: " + soma);
        System.out.println("A diferença: " + diferenca);
        System.out.println("O produto: " + produto);

        try {
            float quociente = quocienteNumeros(numero1, numero2);
            System.out.println("O quociente: " + quociente);
        }catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }


    }

    // este metodo retorna o quociente de dois numeros
    private static float quocienteNumeros(int numero1, int numero2) {
        if (numero2 == 0)
            throw new ArithmeticException("Erro: divisão por 0");
        return (float) numero1 / numero2;
    }

    // este metodo retorna o produto de dois numeros inteiros recebidos por parametro
    private static int produtoNumeros(int numero1, int numero2) {
        return numero1 * numero2;
    }

    // este metodo faz a soma de dois inteiros passados por parametro
    public static int somarNumeros(int num1, int num2){
        return num1 + num2;
    }
   //este metodo faz a diferença de dois inteiros passados por parametro
    public static int diferencaNumeros(int num1, int num2){
        return num1 - num2;
    }
}
