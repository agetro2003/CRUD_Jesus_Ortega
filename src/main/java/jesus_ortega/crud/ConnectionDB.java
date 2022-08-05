
package jesus_ortega.crud;
import java.awt.HeadlessException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class ConnectionDB {

    public void Ejecutar(String query){
        try {
            Connection conn = null;
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/crud", "postgres", "postgres");
           CallableStatement cs = conn.prepareCall(query);
            /*Statement state = conn.createStatement();
            ResultSet rs = state.executeQuery(query);*/
            cs.execute();
        JOptionPane.showMessageDialog(null,"Proceso ejecutado correctamente");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void Consultar(JTable tabla) {

DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ci");
            model.addColumn("nombre");
            model.addColumn("apellido");
            model.addColumn("vip");
            
            tabla.setModel(model);
            
            String [] data = new String[4];
        try{
            
            String query = "select * from personas";
             Connection conn = null;
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/crud", "postgres", "postgres");
            Statement state = conn.createStatement();
            ResultSet rs = state.executeQuery(query);
            
            while(rs.next()){
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                data[3] = rs.getString(4);
                model.addRow(data);
            }
            
            tabla.setModel(model);
            
        }  catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
       
    }
    
     public void Buscar(JTable tabla, String parametro) {

DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ci");
            model.addColumn("nombre");
            model.addColumn("apellido");
            model.addColumn("vip");
            
            tabla.setModel(model);
            
            String [] data = new String[4];
        try{
            
            String query = "select * from personas where ci = " + parametro + ";";
             Connection conn = null;
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/crud", "postgres", "postgres");
            Statement state = conn.createStatement();
            ResultSet rs = state.executeQuery(query);
            
            while(rs.next()){
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                data[3] = rs.getString(4);
                model.addRow(data);
            }
            
            tabla.setModel(model);
            
        }  catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
       
    }
    
}
