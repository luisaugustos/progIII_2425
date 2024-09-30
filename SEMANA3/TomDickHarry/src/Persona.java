public class Persona {

    /**
     * Tom, Dick y Harry introducen sus pesos y tallas en el ordenador. 
     * ¿Quién es el más alto? ¿Quién pesa más? 
     * Realizar este ejercicio usando clases.
     * 
     */
    private String nombre;
    private double peso;
    private double talla;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }


}
