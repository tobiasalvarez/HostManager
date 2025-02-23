/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Calendar;
import static java.util.Calendar.DATE;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import java.util.GregorianCalendar;

/**
 *
 * @author Tobias
 */
public class Hora {
    Calendar fecha = new GregorianCalendar();
    
    String anho = Integer.toString(fecha.get(YEAR));
    String mes = Integer.toString(fecha.get(MONTH));
    String dia = Integer.toString(fecha.get(DATE));
    
    String dataCompleta = anho+"-"+mes+"-"+dia;
    
    String hora = Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
    String minuto = Integer.toString(fecha.get(Calendar.MINUTE));
    
    String horaCompleta = hora+":"+minuto;
}
