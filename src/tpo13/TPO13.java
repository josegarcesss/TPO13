/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package tpo13;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class TPO13 {

    public static void main(String[] args) {
        LocalDate fechaN=LocalDate.of(2003,12,01);
        try{
            Connection con=Conexion.getConexion();
            
            String sql="INSERT INTO alumno(dni,apellido,nombre,fechaN,estado) VALUES (?,?,?,?,?)";
            PreparedStatement miStatement=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            miStatement.setInt(1,42999565);
            miStatement.setString(2, "Gomez");
            miStatement.setString(3, "Thomas");
            miStatement.setDate(4, Date.valueOf(fechaN));
            miStatement.setBoolean(5, true);
            ResultSet miResulset=miStatement.executeQuery();
            miResulset= miStatement.getGeneratedKeys();
            if(miResulset.next()){
                System.out.println(miResulset.getInt(1));
            }
            
        } catch (SQLException e){
                JOptionPane.showMessageDialog(null, "No se pudo conectar");
            
            }
        fechaN=LocalDate.of(1999, 5, 20);
        try{
            Connection con=Conexion.getConexion();
            
            String sql="INSERT INTO alumno(dni,apellido,nombre,fechaN,estado) VALUES (?,?,?,?,?)";
            PreparedStatement miStatement=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            miStatement.setInt(1,40698967);
            miStatement.setString(2, "Perez");
            miStatement.setString(3, "Marcos");
            miStatement.setDate(4, Date.valueOf(fechaN));
            miStatement.setBoolean(5, true);
            ResultSet miResulset=miStatement.executeQuery();
            miResulset= miStatement.getGeneratedKeys();
            if(miResulset.next()){
                System.out.println(miResulset.getInt(1));
            }
            
        } catch (SQLException e){
                JOptionPane.showMessageDialog(null, "No se pudo conectar");
            
            }
        fechaN=LocalDate.of(2004, 6, 16);
        try{
            Connection con=Conexion.getConexion();
            
            String sql="INSERT INTO alumno(dni,apellido,nombre,fechaN,estado) VALUES (?,?,?,?,?)";
            PreparedStatement miStatement=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            miStatement.setInt(1,42999565);
            miStatement.setString(2, "Barroso");
            miStatement.setString(3, "Alfredo");
            miStatement.setDate(4, Date.valueOf(fechaN));
            miStatement.setBoolean(5, true);
            ResultSet miResulset=miStatement.executeQuery();
            miResulset= miStatement.getGeneratedKeys();
            if(miResulset.next()){
                System.out.println(miResulset.getInt(1));
            }
            
        } catch (SQLException e){
                JOptionPane.showMessageDialog(null, "No se pudo conectar");
            
            }
        
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
        
        try{
            Connection con= Conexion.getConexion();
            String sql="INSERT INTO inscripcion (nota, id_alumno, id_materia) VALUES(?,?,?)";
            PreparedStatement miStatement=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            miStatement.setDouble( 1, 4.5);
            miStatement.setInt(2, 1);
            miStatement.setInt(3,2);
            ResultSet miResulset=miStatement.executeQuery();
            miResulset=miStatement.getGeneratedKeys();
            if(miResulset.next()){
                System.out.println(miResulset.getInt(1));
            }
            
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "No se pudo conectar");
        }
//        
        try{
            Connection con= Conexion.getConexion();
            String sql="INSERT INTO inscripcion (nota, id_alumno, id_materia) VALUES(?,?,?)";
            PreparedStatement miStatement=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            miStatement.setDouble( 1, 6);
            miStatement.setInt(2, 1);
            miStatement.setInt(3,3);
            ResultSet miResulset=miStatement.executeQuery();
            miResulset=miStatement.getGeneratedKeys();
            if(miResulset.next()){
                System.out.println(miResulset.getInt(1));
            }  
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "No se pudo conectar");
        }
//        
        try{
            Connection con= Conexion.getConexion();
            String sql="INSERT INTO inscripcion (nota, id_alumno, id_materia) VALUES(?,?,?)";
            PreparedStatement miStatement=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            miStatement.setDouble( 1, 5);
            miStatement.setInt(2, 2);
            miStatement.setInt(3,3);
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
            String sql="INSERT INTO inscripcion (nota, id_alumno, id_materia) VALUES(?,?,?)";
            PreparedStatement miStatement=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            miStatement.setDouble( 1, 9);
            miStatement.setInt(2, 2);
            miStatement.setInt(3,4);
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
            String sql="INSERT INTO inscripcion (nota, id_alumno, id_materia) VALUES(?,?,?)";
            PreparedStatement miStatement=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            miStatement.setDouble( 1, 10);
            miStatement.setInt(2, 3);
            miStatement.setInt(3,4);
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
            String sql="INSERT INTO inscripcion (nota, id_alumno, id_materia) VALUES(?,?,?)";
            PreparedStatement miStatement=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            miStatement.setDouble( 1, 4);
            miStatement.setInt(2, 3);
            miStatement.setInt(3,2);
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
            String sql="SELECT alumno.id_alumno,dni,apellido,nombre,fechaN,estado FROM alumno JOIN inscripcion ON(alumno.id_alumno=inscripcion.id_alumno) WHERE inscripcion.nota > 8";
            PreparedStatement miStatement=con.prepareStatement(sql);
            miStatement.setDouble( 1, 4);
            miStatement.setInt(2, 3);
            miStatement.setInt(3,2);
            ResultSet miResulset=miStatement.executeQuery();
            while(miResulset.next()){
                System.out.println(miResulset.getInt(1)+" - "+miResulset.getInt(2)+" - "+miResulset.getString(3)+" - "+miResulset.getString(4)+" - "+miResulset.getDate(5)+" - "+miResulset.getBoolean(6));
            }
            
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "No se pudo conectar");
        }

        try{
            Connection con= Conexion.getConexion();
            String sql="DELETE FROM inscripcion WHERE id_alumno = 1 AND id_materia = 3";
            PreparedStatement miStatement=con.prepareStatement(sql);
            miStatement.setDouble( 1, 4);
            miStatement.setInt(2, 3);
            miStatement.setInt(3,2);
            ResultSet miResulset=miStatement.executeQuery();
            if(!miResulset.next()){
                System.out.println("Alumno eliminado de la materia ocn exito!");
            }
            
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "No se pudo conectar");
        }
        
        
        
        
    }

}
