/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lerarquivos;

/**
 *
 * @author daniel.lsilva36
 */
public class LerArquivos {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        double matriz[][] = new double[5][5];
        
        double somaL1 = 0;
        double somaL2 = 0;
        double difLinha = 0;
        
        //Primeira linha
        matriz[0][0] = 0.1;
        matriz[0][1] = 0.2;
        matriz[0][2] = 0.75;
        matriz[0][3] = 0.85;
        matriz[0][4] = 0.71;
        
        //Segunda linha
        matriz[1][0] = 0.15;
        matriz[1][1] = 0.24;
        matriz[1][2] = 0.65;
        matriz[1][3] = 0.41;
        matriz[1][4] = 0.35;
        
        //Terceira linha
        matriz[2][0] = 0.16;
        matriz[2][1] = 0.27;
        matriz[2][2] = 0.55;
        matriz[2][3] = 0.32;
        matriz[2][4] = 0.21;
        
        //Quarta linha
        matriz[3][0] = 0.41;
        matriz[3][1] = 0.85;
        matriz[3][2] = 0.95;
        matriz[3][3] = 0.99;
        matriz[3][4] = 0.43;
        
        //Quinta linha
        matriz[4][0] = 0.43;
        matriz[4][1] = 0.71;
        matriz[4][2] = 0.20;
        matriz[4][3] = 0.63;
        matriz[4][4] = 0.83;
        
        //Soma de objtos
        System.out.println(matriz.length);
        System.out.println(matriz[0].length);
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
              if(i != 2){
                System.out.println("Matriz " + i + " " + matriz[i][j]);
                if(i <= 1){
                    somaL1 += matriz[i][j];
                }else if(i >= 3){
                    somaL2 += matriz[i][j]; 
                }
              }else{
                  System.out.println("-----------------------------------");
              }
            }
        }
        System.out.println("-----------------------------------");
        System.out.println(somaL1);
        System.out.println(somaL2);
        
        difLinha = somaL1 - somaL2;
        System.out.println(difLinha);
    }
}


//Fazer logica para caso a matriz seja maior que 5x5 