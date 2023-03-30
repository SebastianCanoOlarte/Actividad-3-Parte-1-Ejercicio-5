/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad3parte1ejercicionumero5;


public class Calculos {
    public static String SalMen(int Sal, int Num,String Nombre){
        String resultado;
        double SalarioMen;
        SalarioMen = Sal*Num;
           
        if(SalarioMen>450000){
            resultado = " señor "+Nombre+" su salario es de "+SalarioMen;
        }
        else{
            resultado = " señor "+Nombre;
        }
        return resultado;
    }
    
}
