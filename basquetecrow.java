public class basquetecrow {
    
            //variaives
            int D;
            Scanner entrada;
    
            //entrada
            entrada = new Scanner(System.in);
            D = entrada.nextInt();
            entrada.close();
    
            //processamento e saida
            if(D<=800){
                System.out.printf("1\n");
            }
            else if(D<800 && D<=1400){
                System.out.printf("2\n");
            }
            else if(D<1400 && D<=2000){
                System.out.printf("3\n");
            }
}
