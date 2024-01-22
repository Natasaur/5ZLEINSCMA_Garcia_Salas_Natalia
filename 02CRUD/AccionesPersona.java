import java.util.*;

//un controlador manipula las acciones
public class AccionesPersona {
    //Vamos a hacer un CRUD
    
    //Mostrar Persona
    public ArrayList<Persona> listaPersonas = new ArrayList<Persona>(); //Crea la instancia de la lista de personas

    //Listar a las personas
    public ArrayList<Persona>mostrarPersonas(){
        return listaPersonas;
    }

    //Resgitrar
    public void agregarPersona(Persona p){
        listaPersonas.add(p);
    }

    //Buscar
    public Persona buscarPersona(int id){
        Persona encontrada = new Persona();
        for(Persona p : listaPersonas){
            if(id == p.getId()){
                encontrada = p;
            }else{
                System.out.println("Persona no encontrada");
            }
        }
        return encontrada;
    }

    //Actualizar
    public void actualizarPersona(Persona actualizada){
        Persona actualizar = buscarPersona(actualizada.getId());
        listaPersonas.remove(actualizar);
        listaPersonas.add(actualizar);
    }

    //Eliminar
    public void eliminarPersona(Persona eliminar){
        listaPersonas.remove(eliminar);
    }
}
