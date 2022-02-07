package Problema1;

import java.util.Scanner;  

public class Trabajo {

	static Empleado[] arrayEmpl = new Empleado[10000];
	static Scanner s = new Scanner(System.in);
	static Integer[] menuOptions = {1,2,3};
	
	public static void main(String[] args) {
		
			int opcion = 0;
			while(opcion != 3) {
			displayMenu();
			opcion=s.nextInt();
			
			while(!validOption(menuOptions,opcion)){ 
				System.out.println("Ingrese un valor valido, entre 1 y 3");
	
				displayMenu();
				opcion=s.nextInt();
				
			}  
			
			switch(opcion) {
				case 1:
					consultarEmpleados();
					break;
				case 2:
					crearEmpleados();
					break;
				case 3:
					System.out.println("Saliendo del programa...");
					break;
				default: 
					System.out.println("Hubo un error inesperado");
				break;
			}
		
		}
		s.close();
	}
	public static void consultarEmpleados() {
		System.out.println("Ingrese el id del empleado"); 
		int input = s.nextInt();
		if(input > buscarMaxId() || input <= 0) {
			System.out.println("Id no existe.");
		}
		else {
		arrayEmpl[input].desplegarDatos();
		}
	}
	public static int buscarMaxId() {
		int max = 0;
		for(int j=0;j<10000;j++) {  
			try {
				if(arrayEmpl[j].leerIdEmpleado() > max) {
					max = j;
				} 
			} 
	        catch(NullPointerException e) 
	        {  
	        	continue;
	        } 
		}
		return max;
	}
	public static void crearEmpleados() {
		int cantidad = 0;
		System.out.println("Ingrese cuantos empleados desea crear?");
		cantidad = s.nextInt();
		
		//max id
		int max = buscarMaxId() + 1;
		
		
		for(int i = max; i < cantidad+max; i++) {
			System.out.println("Ingrese el nombre del Empleado a crear con id#"+i); 
			arrayEmpl[i] = new Empleado();
			arrayEmpl[i].crearEmpleado(i, s.next());

		}
		
		System.out.println("Empleados creados:");
		for(int i = max; i < arrayEmpl.length;i++) {
			try {
				arrayEmpl[i].desplegarDatos();
			} 
	        catch(NullPointerException e) 
	        {  
	        	continue;
	        } 
		}
	}
	public static boolean validOption(Integer[] menuOptions, int val) {
		for (int element : menuOptions) {
		    if (element == val) {
		        return true;
		    }
		}
		return false;
	}
	public static void displayMenu() {
		System.out.println("Menu:");
		System.out.println("1.Consultar Empleado");
		System.out.println("2.Crear Empleado");
		System.out.println("3.Salir");
	}

}
