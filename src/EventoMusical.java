
import java.util.ArrayList;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Josue Gavidia
 */
public class EventoMusical extends Evento{
    public static ArrayList<String> integrantes;
    public static String autor;
    public static String tipoMusica;
    public static String estado;
    
    public EventoMusical(int code, String name, String desc, double monto, String author, int count,String music,int day, int month, int date) {
        super(code, name, desc, monto, author,count, day,  month, date);
        autor = author;
        tipoMusica = music;
         integrantes = new ArrayList<>();
    }
    
    
}
