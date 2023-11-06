/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Josue Gavidia
 */
public class Usuario {
    public static String Ncompleto;
    public static String ID;
    public static String PASS;
    public static int Edad;
 

    public Usuario(String Ncompleto, String ID, String PASS, int Edad) {
        this.Ncompleto = Ncompleto;
        this.ID = ID;
        this.PASS = PASS;
        this.Edad = Edad;
      
    }

    public  String getNcompleto() {
        return Ncompleto;
    }

    public  void setNcompleto(String Ncompleto) {
        Usuario.Ncompleto = Ncompleto;
    }

    public  String getID() {
        return ID;
    }

    public  void setID(String ID) {
        Usuario.ID = ID;
    }

    public  String getPASS() {
        return PASS;
    }

    public  void setPASS(String PASS) {
        Usuario.PASS = PASS;
    }

    public  int getEdad() {
        return Edad;
    }

    public  void setEdad(int Edad) {
        Usuario.Edad = Edad;
    }
  
    
    
    
    
    
}
