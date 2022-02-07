package VentanasDelGUI;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class CerebroDeLaCalculadora {
	
	private String[] DatosGuardados = new String[50];
	private int Frente = 49, Final = 49;
	boolean inicio1= true;
	String suma(String Numero1, String Numero2){
		
     
	BigDecimal N1 = new BigDecimal(Numero1);	
	BigDecimal N2 = new BigDecimal(Numero2);	
	String Resultado =  N1.add(N2).toPlainString();
     
    return Resultado;
	}
	
	String resta(String Numero1, String Numero2){
		
	     
	BigDecimal N1 = new BigDecimal(Numero1);	
	BigDecimal N2 = new BigDecimal(Numero2);	
	String Resultado =  N1.subtract(N2).toPlainString();
     
    return Resultado;
	}
	
	String multiplicacion(String Numero1, String Numero2){
		
	     
	BigDecimal N1 = new BigDecimal(Numero1);	
	BigDecimal N2 = new BigDecimal(Numero2);	
	String Resultado =  N1.multiply(N2).toPlainString();
     
    return Resultado;
	}
	
	
	String division(String Numero1, String Numero2){
		
	     
	BigDecimal N1 = new BigDecimal(Numero1);	
	BigDecimal N2 = new BigDecimal(Numero2);	
	String Resultado =  N1.	divide(N2,8,RoundingMode.HALF_UP).toPlainString();
     
    return Resultado;
	}	
	
	String modulo(String Numero1, String Numero2){
		
	     
	BigDecimal N1 = new BigDecimal(Numero1);	
	BigDecimal N2 = new BigDecimal(Numero2);	
	String Resultado =  N1.remainder(N2).toPlainString();
		
//	int N1 =Integer.parseInt(Numero1);	
//	int N2 =Integer.parseInt(Numero2); 
//	double r = N1%N2;
//  String Resultado = String.valueOf(r);
    
    return Resultado;
	}
	
	
	String[] agregar(String NumeroDelResultado, String Numero1, String Numero2){
		
//		System.out.println(Arrays.deepToString(DatosGuardados));

		    
		    if ((Final>=0 && Final<=49) && inicio1)
            {	Frente = Final;
		        DatosGuardados[Final] = Numero1+ "+" + Numero2 + "= " +NumeroDelResultado;
		        Final--; inicio1 = true;
		    }else 
		    {   inicio1=false;
		    	for(int i=49; i<=1;i--) {DatosGuardados[i]= DatosGuardados[i-1];}
		    	
		    	DatosGuardados[0] = Numero1+ "+" + Numero2 + "= " +NumeroDelResultado;
		    }
		    

		System.out.println(Arrays.deepToString(DatosGuardados));
        return DatosGuardados;
	}
	
	
    public int regresarFinal() {
        return Final;
    }	
    
    public int regresarFrente() {
        return Frente;
    }	
	
	
	String[] eliminar(){
		
	    if (Final>=49)
	    {
 //           String[] vacia = {"Memoria Vacia"};
            DatosGuardados[Final] = "Memoria Vacia";
//            Final=0;
            inicio1=true;
	    }else
	    {   
	    	Final++;
	    	DatosGuardados[Final] = "null";
	    	
	    	Frente= Final;
	    	inicio1=true;
	    }	
	    
	    return DatosGuardados;
	  
	}
	
	
	String[] imprimir(){
		
	    return DatosGuardados;
	  
	}
	

}
