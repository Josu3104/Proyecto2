
import java.util.ArrayList;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Josue Gavidia
 */
public class EventoDeportivo extends Evento{
    public static ArrayList<String> players;
    public static String autor;
    public static String tipoDeporte;
    public static String estado;
   
    
    
    

    public EventoDeportivo(int code, String name, String desc, double monto, String author, int count, String tipoSport,int day, int month, int date) {
        super(code, name, desc, monto, author,count,day, month,  date);
       tipoDeporte = tipoSport;
        autor = author;
        players = new ArrayList<>();
    }
    
     
    
    
}
