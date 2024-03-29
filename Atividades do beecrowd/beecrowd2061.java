import java.util.Scanner;

/*QUESTÃO
Péricles é um rapaz que tem um interesse único por história. Utilizando 
seu atualizadíssimo navegador de internet rapoza cromada, conheceu até 
os sitios mais remotos e obscuros atrás de informações sobre a mitologia grega.

Por ironia do destino, o navegador de Péricles acabou sendo infectado 
por um malware com uma caracterísica peculiar: cada vez que Péricles 
fechava uma aba no seu navegador, outras duas abas apareciam! No entanto, 
quando Péricles clicou sem querer em uma das propagandas de uma aba, 
percebeu que, por um erro do navegador, a aba foi encerrada (sem abrir outras 
abas). Por causa do malware, todas as abas possuem irritantes propagandas.

Sua tarefa é descobrir com quantas abas que o navegador de Péricles ficou, 
sabendo o número inicial de abas e a sequência de ações de Péricles. As 
ações podem ser fechou (quando Péricles fechou uma aba) ou clicou (quando 
Péricles clicou em uma propaganda).

ENTRADA
A entrada é iniciada por uma linha contendo dois números inteiros positivos, 
N e M (0 < N, M < 500), representando o número inicial de abas e o número de 
ações de Péricles. Cada linha subsequente contém uma ação (fechou ou clicou). 
Naturalmente, o número de abas é sempre maior ou igual a zero.

SAÍDA
A saída deve ser uma linha contendo o número final de abas.*/

public class beecrowd2061 {
    public static void main(String [] args) {
        
        //variaveis
    	int N, M, i;
        String acao;

        //entrada
    	Scanner entrada = new Scanner(System.in);
        N = entrada.nextInt(); //Número inicial de abas
    	M = entrada.nextInt(); //Número de ações (cliques)

        //processamento e saida
    	for (i=0; i<M; i++){ //Sistema de repetição: "i" igual 0, se "i" for menor que "M", "i" recebe + 1
    		acao = entrada.next(); //Entrada da acao
    		if(acao.equalsIgnoreCase("fechou")){ //Se a entrada da acao for igual a "fechou"
            N++; //Número inicial de abas recebe + 1
            } else{ //Senão
            N--; //Número incial de abas recebe - 1
            }
    	}
        entrada.close();
    	System.out.println(N);
    }
}


//https://github.com/eduardo-mior/URI-Online-Judge-Solutions/blob/master/Iniciante/URI%202061.java