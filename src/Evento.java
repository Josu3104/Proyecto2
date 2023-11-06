/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Josue Gavidia
 */
public  class Evento {

    
    public  int codigo;
    public static String titulo;
    public static String descripcion;
    public static double montoRenta;
    public static int cantPersonas;
    public static int dia, mes, fecha;
    public  String estado;
    

    public Evento(int code, String name, String desc, double monto, String author, int count,int day, int month, int date) {
        codigo = code;
        titulo = name;
        descripcion = desc;
        dia = day;
        mes = month;
        fecha = date;
        montoRenta = monto;
        cantPersonas = count;
        estado="creado";
        
       
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public  String getTitulo() {
        return titulo;
    }

    public  void setTitulo(String titulo) {
        Evento.titulo = titulo;
    }

    public  String getDescripcion() {
        return descripcion;
    }

    public  void setDescripcion(String descripcion) {
        Evento.descripcion = descripcion;
    }

    public  double getMontoRenta() {
        return montoRenta;
    }

    public  void setMontoRenta(double montoRenta) {
        Evento.montoRenta = montoRenta;
    }

    public  int getCantPersonas() {
        return cantPersonas;
    }

    public  void setCantPersonas(int cantPersonas) {
        Evento.cantPersonas = cantPersonas;
    }

    public  int getDia() {
        return dia;
    }

    public  void setDia(int dia) {
        Evento.dia = dia;
    }

    public  int getMes() {
        return mes;
    }

    public  void setMes(int mes) {
        Evento.mes = mes;
    }

    public  int getFecha() {
        return fecha;
    }

    public  void setFecha(int fecha) {
        Evento.fecha = fecha;
    }

    
 
    
    
    
    
            
}
