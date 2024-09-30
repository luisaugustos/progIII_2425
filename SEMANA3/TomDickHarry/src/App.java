import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[3];

        for (int i=0; i<3; i++) {
            personas[i] = new Persona();
            //Nombre de la Persona
            String prompt = String.format("Escriba el nombre de la persona %d \n", i+1);
            String nombre = Esdia.readString(prompt);
            personas[i].setNombre(nombre);

            //Peso de la Persona
            String promptPeso = String.format("Escriba el peso de la persona %d \n", i+1);
            double peso = Esdia.readDouble(promptPeso);
            personas[i].setPeso(peso);

            //Talla de la Persona
            String promptTalla = String.format("Escriba la talla de la persona %d \n", i+1);
            double talla = Esdia.readDouble(promptTalla);
            personas[i].setTalla(talla);

        }

        Persona masAlta = personas[0];
        Persona masPesada = personas[0];

        for (int i = 0; i < 3; i++) {
            if (personas[i].getTalla() > masAlta.getTalla()) {
                masAlta = personas[i];
            }
            if (personas[i].getPeso() > masPesada.getPeso()) {
                masPesada = personas[i];
            }
        }

        System.out.println("La persona mas alta es " + masAlta.getNombre() +
         " Altura: " + masAlta.getTalla() + " metros"
         );

         System.out.println("La persona mas pesada es " + masPesada.getNombre() +
         " Peso: " + masPesada.getPeso() + " kilos"
         );





        
    }
}
