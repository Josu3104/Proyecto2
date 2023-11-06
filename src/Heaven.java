
import java.util.ArrayList;

public class Heaven {

    public static ArrayList<Usuario> cuentas;
    public static ArrayList<Evento> eventos;

    public Heaven() {
        cuentas = new ArrayList<>();
        eventos = new ArrayList<>();
    }

    public static boolean ValidarUserDefault(String id, String contra) {
        if (fetchAcc(id, contra) || (id.equals(UsuarioDefault.UsuarioDefault) && contra.equals(UsuarioDefault.ContraDefault))) {
            return true;
        }
        return false;
    }

    public static void CrearUsuario(String name, String user, String pass, int edad) {
        switch (CrearUserGUI.tipoUser) {
            case "admin":
                cuentas.add(new UsuarioAdmin(name, user, pass, edad));
            case "limitado":
                cuentas.add(new UsuarioLimitado(name, user, pass, edad));
            case "contenidos":
                cuentas.add(new UsuarioContenidos(name, user, pass, edad));
            default:
                break;
        }

    }

    public static void CrearSport(int codigo, String titulo, String desc, double renta, String autor, int cantidad, String tipoSport, int dia, int mes, int anio) {
        eventos.add(new EventoDeportivo(codigo, titulo, desc, renta, autor, cantidad, tipoSport, dia, mes, anio));
    }

    public static void CrearMusic(int codigo, String titulo, String desc, double renta, String autor, int cantidad, String music, int dia, int mes, int anio) {
        eventos.add(new EventoMusical(codigo, titulo, desc, renta, autor, cantidad, music, dia, mes, anio));
    }

    public static void CrearReligioso(int codigo, String titulo, String desc, double renta, String autor, int cantidad, int dia, int mes, int anio) {
        eventos.add(new EventoReligioso(codigo, titulo, desc, renta, autor, cantidad, dia, mes, anio));

    }

    public static boolean CancelEvent(int code) {
        for (Evento ev : eventos) {
            if (ev.codigo == code && ev.estado != "cancelado") {

                ev.setEstado("cancelado");

                return true;
            } else {
            
            }
        }
        return false;
    }

   
    /*
    public static String SeeEvent(int code){
        for(Evento ev: eventos){
            if(ev.codigo == code){
                return "Titulo: "+ev.getTitulo()+"/nFecha: "+ev.getDia()+"/"+ev.getMes()+"/"+ev.getFecha()
                        +"/n";
            }
        }
    }
    */
    
     public static boolean EditAcc(String name, String user, String pass) {
        for (Usuario us : cuentas) {
            if (name.equals(us.getNcompleto())&&user.equals(us.getID()) && pass.equals(us.getPASS())) {
                us.setNcompleto(name);us.setID(user);us.setPASS(pass);
                return true;
            }
        }
        return false;
    }
    
    public static boolean fetchAcc(String user, String pass) {
        for (Usuario us : cuentas) {
            if (user.equals(us.ID) && pass.equals(us.PASS)) {
                return true;
            }
        }
        return false;
    }
    
  

}
