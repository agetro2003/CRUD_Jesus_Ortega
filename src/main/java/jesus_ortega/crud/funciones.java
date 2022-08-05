/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jesus_ortega.crud;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author jesus
 */
public class funciones {
    
    public void Seleccionar (JTable tabla, JTextField cedula, JTextField nombre, JTextField apellido, JCheckBox vip){
        try {
            int fila = tabla.getSelectedRow();
            if(fila >= 0){
                cedula.setText(tabla.getValueAt(fila, 0).toString());
                nombre.setText(tabla.getValueAt(fila, 1).toString());
                apellido.setText(tabla.getValueAt(fila, 2).toString());
                
                String estado = tabla.getValueAt(fila, 3).toString();
                if ("f".equals(estado)){
                    vip.setSelected(false);
                }else {
                    vip.setSelected(true);
                }
           //     
            }else{
                JOptionPane.showMessageDialog(null,"No se ha seleccionado ninguna fila");
            } 
        }catch (Exception e){
                    JOptionPane.showMessageDialog(null, e);
                    }
    }
    
    public boolean verificar (JTextField cedula, JTextField nombre, JTextField apellido){
        boolean v = true;
        if ("".equals(cedula.getText()) || "".equals(nombre.getText()) || "".equals(apellido.getText()))
        {
            v = false;
            
        }    
        
        
        
        return v;
    }
    
}
