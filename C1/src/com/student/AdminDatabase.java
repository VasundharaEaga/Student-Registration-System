package com.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDatabase {
	Connection con ;

    public AdminDatabase(Connection con) {
        this.con = con;
    }
    
    //for register user 
    public boolean saveAdmin(Admin admin){
        boolean set = false;
        try{
            //Insert register data to database
            String query = "insert into admin(id,name,email,password) values(?,?,?,?)";
           
           PreparedStatement pt = this.con.prepareStatement(query);
           pt.setInt(1,admin.getId());
           pt.setString(2, admin.getName());
           pt.setString(3, admin.getEmail());
           pt.setString(4, admin.getPassword());
       
          
           pt.executeUpdate();
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
    //log user
    public Admin logAdmin(String email, String password) {
        Admin admin = null;

        try {
            String query = "select * from admin where email=? and password=?";
            PreparedStatement ps = this.con.prepareStatement(query); 
            ps.setString(1,email);
            ps.setString(2, password);
            
            ResultSet rs  = ps.executeQuery();
            
            if(rs.next()){
                 admin = new Admin();
                 admin.setId(rs.getInt("id"));
                 admin.setName(rs.getString("name"));
                 admin.setEmail(rs.getString("email"));
                 admin.setPassword(rs.getString("password"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return admin;
    }
}
