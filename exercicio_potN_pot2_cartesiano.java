import java.util.Scanner;

public class exercicio_potN_pot2_cartesiano{

    /*Exercicios
        13. Faça uma função chamada pot2 que retorna verdadeiro caso o parâmetro passado seja uma potência de 2.

        14. Desenvolva uma função chamada potN, que possui dois parâmetros x e n. A função deve retornar verdadeiro caso x seja uma potência de n.

        15. Implemente uma função chamada distanciaCartesiana que recebe dois pares de números, que correspondem a pontos em um plano cartesiano com coordenadas x, y. A função deve retornar a distância entre esses dois pontos. Não é necessário arredondar valores.
    */

    public static boolean pot2(int x){
        //https://www.w3schools.com/go/go_bitwise_operators.php

        if(x <= 0){ //"x" não pode ser menor ou igual a 0
            return false;
        }
        return (x & (x - 1)) == 0; //Operação bitwise AND (&) --> (Verificador de potências de 2) 

        //As potências de 2 têm apenas um bit 1 em sua representação binária, enquanto "x - 1" terá todos os bits à direita do bit 1 igual a 1. Fazer uma operação bitwise AND entre "x e x - 1" resulta em zero somente para números que são potências de 2. Ocorre pois o único bit 1 em "x" é cancelado pela operação AND com os bits 1 em "x - 1", deixando todos os bits como zero.

        //Tentar aplicar a mesma ideia do potN para pot2
    }

    public static void eh_pot2(int x){

        if(pot2(x)){
            System.out.printf("%d é uma potência de 2.\n", x);
        }else{
            System.out.printf("%d não é uma potência de 2.\n", x);
        }
    }

    public static void potN(int x, int n){

        //Potência- propriedades
        //potência: 5² = 25
        //5 = base; ² = expoente; 25 = potência

        if(eh_potN(x, n)){
            System.out.printf("%d é uma potência de %d", x, n);
            }else{
                System.out.printf("%d não é uma potência de %d", x, n);
            }
        }
                
        public static boolean eh_potN(int x, int n){
            
            int resultado;
            
            if(x == 1){ //Qualquer número expoente de 1 é igual a 1.
                return true;  
            }
                    
            for (int i = 1; i <= x; i++){ //Sistema de repetição
                resultado = (int) Math.pow(n, i);
                //A variável "resultado" vai calcular a base "n" com o expoente "i" e guardar o resultado para comparação até "i" ser maior ou igual a "x" no sistema de repetição.
                
                if(resultado == x){ //Se o resultado da potência for igual a "x", retorne true.
                    return true;
                }else if(resultado > x){
                    break;  // Se o resultado da potência exceder "x", retorne false.
                }
            }  
            return false;
    }

    public static void distanciaCartesiana() {

            double distancia, x1, y1, x2, y2;
            Scanner entrada = new Scanner (System.in);

            x1 = entrada.nextDouble();
            y1 = entrada.nextDouble();
            x2 = entrada.nextDouble();
            y2 = entrada.nextDouble();

        distancia = calculo_cartesiano(x1, y1, x2, y2);
        System.out.printf("Distância entre os pontos: %d\n", distancia);
    }

    public static double calculo_cartesiano(double x1, double y1, double x2, double y2) {

        double ponto_X, ponto_Y, distancia;

        ponto_X = x2 - x1;
        ponto_Y = y2 - y1;

        distancia = Math.sqrt(ponto_X * ponto_Y + ponto_Y * ponto_Y);

        return distancia;
    }

    public static void main(String[] args) {
        
        int x, y;

        Scanner entrada = new Scanner (System.in);
        x = entrada.nextInt();
        //y = entrada.nextInt();
        entrada.close();

        eh_pot2(x);
        //eh_potN(x, y);
        //distanciaCartesiana();
    }
}