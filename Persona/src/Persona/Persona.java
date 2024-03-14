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
        
        return "";
    }

    /**
     * @param dni
     */
    public void SetDni(String dni) {
        
    }

    /**
     * @return
     */
    public String GetNombre() {
        
        return "";
    }

    /**
     * @param nombre
     */
    public void SetNombre(String nombre) {
        
    }

    /**
     * @return
     */
    public String GetApellidos() {
        
        return "";
    }

    /**
     * @param apellidos
     */
    public void SetApellidos(String apellidos) {
        
    }

    /**
     * @return
     */
    public int GetEdad() {
       
        return 0;
    }

    /**
     * @param edad
     */
    public void SetEdad(int edad) {
       
    }

}