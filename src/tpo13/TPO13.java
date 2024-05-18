/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package tpo13;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;

//try {
//            //1. CREAR CONEXIÓN
//            Connection miConexion= DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
//            
//            //2. CREAR OBJETO STATEMENT
//            Statement miStatement=miConexion.createStatement();
//            
//            //3. EJECUTAR LA INSTRUCCION SQL
//            ResultSet miResulset=miStatement.executeQuery("SELECT * FROM herramienta");
//            
//            //4. RECORRER EL RESULSET
//            while(miResulset.next()){
//                System.out.println(miResulset.getString("idHerramienta")+" "+ miResulset.getString("nombre")+" "+ miResulset.getString("descripcion"));
//            }
//            
//        } catch (Exception e) {
//            System.out.println("No se a conectado");
//            e.printStackTrace();
//        }
public class TPO13 {
        //@param args the command line arguments
    public static void main(String[] args) {
        LocalDate fechaN=LocalDate.of(2003,12,01);
//        try{
//            Connection con=Conexion.getConexion();
//            
//            String sql="INSERT INTO alumno(dni,apellido,nombre,fechaN,estado) VALUES (?,?,?,?,?)";
//            PreparedStatement miStatement=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
//            miStatement.setInt(1,42999565);
//            miStatement.setString(2, "Gomez");
//            miStatement.setString(3, "Thomas");
//            miStatement.setDate(4, Date.valueOf(fechaN));
//            miStatement.setBoolean(5, true);
//            ResultSet miResulset=miStatement.executeQuery();
//            miResulset= miStatement.getGeneratedKeys();
//            if(miResulset.next()){
//                System.out.println(miResulset.getInt(1));
//            }
//            
//        } catch (SQLException e){
//                JOptionPane.showMessageDialog(null, "No se pudo conectar");
//            
//            }
//        fechaN=LocalDate.of(1999, 5, 20);
//        try{
//            Connection con=Conexion.getConexion();
//            
//            String sql="INSERT INTO alumno(dni,apellido,nombre,fechaN,estado) VALUES (?,?,?,?,?)";
//            PreparedStatement miStatement=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
//            miStatement.setInt(1,40698967);
//            miStatement.setString(2, "Perez");
//            miStatement.setString(3, "Marcos");
//            miStatement.setDate(4, Date.valueOf(fechaN));
//            miStatement.setBoolean(5, true);
//            ResultSet miResulset=miStatement.executeQuery();
//            miResulset= miStatement.getGeneratedKeys();
//            if(miResulset.next()){
//                System.out.println(miResulset.getInt(1));
//            }
//            
//        } catch (SQLException e){
//                JOptionPane.showMessageDialog(null, "No se pudo conectar");
//            
//            }
//        fechaN=LocalDate.of(2004, 6, 16);
//        try{
//            Connection con=Conexion.getConexion();
//            
//            String sql="INSERT INTO alumno(dni,apellido,nombre,fechaN,estado) VALUES (?,?,?,?,?)";
//            PreparedStatement miStatement=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
//            miStatement.setInt(1,42999565);
//            miStatement.setString(2, "Barroso");
//            miStatement.setString(3, "Alfredo");
//            miStatement.setDate(4, Date.valueOf(fechaN));
//            miStatement.setBoolean(5, true);
//            ResultSet miResulset=miStatement.executeQuery();
//            miResulset= miStatement.getGeneratedKeys();
//            if(miResulset.next()){
//                System.out.println(miResulset.getInt(1));
//            }
//            
//        } catch (SQLException e){
//                JOptionPane.showMessageDialog(null, "No se pudo conectar");
//            
//            }
        
        try{
            Connection con= Conexion.getConexion();
            String sql="INSERT INTO materia(nombre, año, estado) VALUES(?,?,?)";
            PreparedStatement miStatement=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            miStatement.setString(1, "Laboratorio de Programacion 2");
            miStatement.setInt(2, 2022);
            miStatement.setBoolean(3, true);
            ResultSet miResulset=miStatement.executeQuery();
            miResulset=miStatement.getGeneratedKeys();
            if(miResulset.next()){
                System.out.println(miResulset.getInt(1));
            }
            
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "No se pudo conectar");
        }
        
        try{
            Connection con= Conexion.getConexion();
            String sql="INSERT INTO materia(nombre, año, estado) VALUES(?,?,?)";
            PreparedStatement miStatement=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            miStatement.setString(1, "Entorno .NET");
            miStatement.setInt(2, 2021);
            miStatement.setBoolean(3, true);
            ResultSet miResulset=miStatement.executeQuery();
            miResulset=miStatement.getGeneratedKeys();
            if(miResulset.next()){
                System.out.println(miResulset.getInt(1));
            }
            
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "No se pudo conectar");
        }
        
        try{
            Connection con= Conexion.getConexion();
            String sql="INSERT INTO materia(nombre, año, estado) VALUES(?,?,?)";
            PreparedStatement miStatement=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            miStatement.setString(1, "Matematicas 1");
            miStatement.setInt(2, 2019);
            miStatement.setBoolean(3, true);
            ResultSet miResulset=miStatement.executeQuery();
            miResulset=miStatement.getGeneratedKeys();
            if(miResulset.next()){
                System.out.println(miResulset.getInt(1));
            }
            
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "No se pudo conectar");
        }
        
        try{
            Connection con= Conexion.getConexion();
            String sql="INSERT INTO materia(nombre, año, estado) VALUES(?,?,?)";
            PreparedStatement miStatement=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            miStatement.setString(1, "Ingles Tecnico 1");
            miStatement.setInt(2, 2022);
            miStatement.setBoolean(3, true);
            ResultSet miResulset=miStatement.executeQuery();
            miResulset=miStatement.getGeneratedKeys();
            if(miResulset.next()){
                System.out.println(miResulset.getInt(1));
            }
            
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "No se pudo conectar");
        }
        
        /*INSERT INTO inscripcion (nota, id_alumno, id_materia)
            VALUES (8,1,1)*/

    }

}
