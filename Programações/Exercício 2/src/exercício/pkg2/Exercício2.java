/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercício.pkg2;

import javax.swing.JOptionPane;

public class Exercício2 {

    public static void main(String[] args) {
        
        double disTotal, combTotal, mediaAuto;
        
        disTotal = Double.parseDouble(JOptionPane.showInputDialog(null, "Distancia total percorrida " + "pelo automovel."));

        combTotal = Double.parseDouble(JOptionPane.showInputDialog(null, "Total de combustivel gasto."));
        
        mediaAuto = disTotal/combTotal;
        
        JOptionPane.showMessageDialog(null, "O consumo medio de um " + "automovel eh " + mediaAuto);
        
        
    }
    
}
