package enunciado_2;

import java.util.*;

/** @author dimorenop
 *  @version 1.0 
 *  @since 09/08/2017
 *  Enunciado #2 Clase 2
 *
 */

public class enunciado_2 {
	
	public static void main(String[] args){

	Scanner dinero = new Scanner(System.in);
        
        
	
        System.out.println("Cantidad de estudiantes");
	int n = dinero.nextInt(); 
        
	double[] RentaLiquida = new double[n];
	double[] Patrimonio = new double[n];
	int[] Valor = new int [n];
	int[] Codigo = new int [n];
	int[] Creditos = new int [n];
	
	
    
    
    if (n <= 10){
    
	    for (int i=0; i < n; i = i + 1){

                    System.out.println("Ingrese su renta líquida: ");
                    RentaLiquida [i] = dinero.nextFloat();
                    System.out.println("Renta Líquida : " + RentaLiquida [i]);
                    
                    System.out.println("Ingrese su patrimonio: ");
                    Patrimonio [i] = dinero.nextFloat();
                    System.out.println("  /Patrimonio : " + Patrimonio [i]);
                    
                    System.out.println("Ingrese su código: ");
                    Codigo [i] = dinero.nextInt();
                    System.out.println("  /Código del estudiante : " + Codigo [i]);
                    
                    System.out.println("Ingrese sus créditos: ");
                    Creditos [i] = dinero.nextInt();
                    System.out.println("  /Creditos : " + Creditos [i]);

	    	
	    	
	    	if (0 <= RentaLiquida[i] <= 25000 || 0 <= Patrimonio[i] <= 100000) {
				
				Valor [i] = 130;
                                System.out.print("  /Valor del crédito : " + Valor[i]);
                                
				}
	    	else if (25000 < RentaLiquida[i] < 30000 || 100000 < Patrimonio[i] <= 150000){
				
				Valor [i] = 200;
                                System.out.print("  /Valor del crédito : " + Valor[i]);
                                
				}
                                    }
    }
    		    		
	    
	else {				
		System.out.println("El sistema no admite más de 10 registros");
			
			
			
	    		}
			}
   	   	}
	
 