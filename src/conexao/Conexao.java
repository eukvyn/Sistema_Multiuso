/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.*;


/**
 *
 * @author janio
 */
public class Conexao {
        
        private static String url="jdbc:mysql://localhost:3306/sistemamultiuso";
        private static String user="root";
        private static String password="#13Out1982#";
    
    public static Connection conector(){    
        
        Connection conexao = null;
        
        // Armazenando Informações referentes ao banco
        String driver = "com.mysql.jc.jdbc.Driver";
        
        try {
            // tentar estabelecer a conexão
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e){
            // Se der erro na hora de conectar
            System.out.println("Erro ao conectar " + e.getMessage());
            return null;
        }
        
    }
    
}
