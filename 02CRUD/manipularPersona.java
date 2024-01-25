import java.util.*;

public class ManipularPersona {
    //void ni recibe ni devuelve
    public void menu(){
        Scanner entrada = new Scanner(System.in);
        AccionesPersona control = new AccionesPersona();
        System.out.println("Bienvenido a este programa");
        System.out.println("Elige una opción válida:");
        System.out.println("1. Mostrar todos los registros de personas");
        System.out.println("2. Registrar un nuevo objeto");
        System.out.println("3. Editar el objeto");//buscar??
        System.out.println("4. Borrar el objeto");
        System.out.println("5. Salir");

        int opcion = entrada.nextInt();
    
            switch(opcion){
                case 1:
                    //mostrar todo el registro de personas
                    System.out.println("Registro de Personas:");
                    //es una intancia de la lista de personas
                    ArrayList<Persona> listadepersonas = control.mostrarPersonas();
    
                    //al tener la lista de personas hace falta recorrer los registros de dicha lista
                    for(Persona objeto : listadepersonas){
                        System.out.println("ID: " + objeto.getId() + "\n"
                                            + "Nombre: " + objeto.getNombre()+ "\n"
                                            + "Edad: " + objeto.getEdad()+ "\n" );
                    }
                    menu();
                    break;
                case 2:
                    //debemos registrar los datos de la persona
                    System.out.println("Ingrese el ID: ");
                    int idpersona = entrada.nextInt();
                    System.out.println("Ingresa el nombre: ");
                    String nombrepersona = entrada.nextLine();
                    System.out.println("Ingrese la edad: ");
                    int edadpersona = Integer.parseInt(entrada.nextLine());
    
                    //ahora debo de realizar una instancia de la persona 
                    Persona personaNueva = new Persona(idpersona, nombrepersona, edadpersona);
    
                    control.agregarPersona(personaNueva);
                    menu();
                    break;
                case 3:
                    //primero debo de buscar a la persona que quiero editar, por medio del id
                    System.out.println("Ingresa el ID de la persona a buscar: ");
                    idpersona = Integer.parseInt(entrada.nextLine());
    
                    //mando a llamar al metodo de busqueda
                    Persona personabuscar = control.buscarPersona(idpersona);
    
                    //veo la informacion
                    System.out.println("La informacion de la persona es: "+ "\n" 
                                    + "ID: " + personabuscar.getId() + "\n"
                                    + "Nombre: " + personabuscar.getNombre() + "\n"
                                    + "Edad: " + personabuscar.getEdad() + "\n");
                    
                    //cambio los datos que desee
                    System.out.println("Ingresa el nuevo nombre de la persona: ");
                    String nuevonombre = entrada.nextLine();
                    System.out.println("Ingresa la nueva edad de la persona: ");
                    int nuevaedad = Integer.parseInt(entrada.nextLine());
    
                    //al tener los nuevos datos debo enviarlos
                    personabuscar.setNombre(nuevonombre);
                    personabuscar.setEdad(nuevaedad);
    
                    //ahora si actualizo el registro
                    control.actualizarPersona(personabuscar);
                    menu();
                    break;
                case 4:
                    System.out.println("Ingresa el la persona a eliminar: ");
                    idpersona = Integer.parseInt(entrada.nextLine());
    
                    //creo la persona para eliminarla
                    Persona personaEliminar = control.buscarPersona(idpersona);
    
                    //lo elimino
                    control.eliminarPersona(personaEliminar);
    
                    System.out.println("Persona eliminada");
                    menu();
                    break;
                default:
                    System.out.println("Opcion no válida");
                    break;
    
    
            }
    }
}
