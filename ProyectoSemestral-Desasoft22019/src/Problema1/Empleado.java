package Problema1;

public class Empleado {
	private int idEmpleado; 
	private String nombreDelEmpleado;
	
	public void crearEmpleado(int id, String nombre) {
		idEmpleado=id;
		nombreDelEmpleado=nombre;
	}
	
	public String leerNombre(){
		return nombreDelEmpleado;
	}
	
	public int leerIdEmpleado() {
		return idEmpleado;
	}
	
	public void desplegarDatos() {
		System.out.println("id: " + leerIdEmpleado());
		System.out.println("nombre: "+leerNombre());
		System.out.println();
	}
}
