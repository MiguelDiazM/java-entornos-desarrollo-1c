package Persona;
import java.util.*;

/**
 * 
 */
public class Persona {
	private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona() {
    }
    /**
     * @param dni 
     * @param nombre 
     * @param apellidos 
     * @param edad
     */
    public Persona(String dni, String nombre, String apellidos, int edad) {
      this.dni=dni;
      this.nombre=nombre;
      this.apellidos=apellidos;
      this.edad=edad;
    }

    /**
     * @return
     */
    public String GetDni() {
        
        return dni;
    }

    /**
     * @param dni
     */
    public void SetDni(String dni) {
        this.dni=dni;
    }

    /**
     * @return
     */
    public String GetNombre() {
        
        return nombre;
    }

    /**
     * @param nombre
     */
    public void SetNombre(String nombre) {
        this.nombre=nombre;
    }

    /**
     * @return
     */
    public String GetApellidos() {
        
        return apellidos;
    }

    /**
     * @param apellidos
     */
    public void SetApellidos(String apellidos) {
        this.apellidos=apellidos;
    }

    /**
     * @return
     */
    public int GetEdad() {
       
        return edad;
    }

    /**
     * @param edad
     */
    public void SetEdad(int edad) {
       this.edad=edad;
    }
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}
    
    

}