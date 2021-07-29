package com.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDatabase {
	Connection con ;

    public UserDatabase(Connection con) {
        this.con = con;
    }
    
    //for register user 
    public boolean saveUser(User user){
        boolean set = false;
        try{
            //Insert register data to database
            String query = "insert into user(id,name,email,password,phoneno,address) values(?,?,?,?,?,?)";
           
           PreparedStatement pt = this.con.prepareStatement(query);
           pt.setInt(1,user.getId());
           pt.setString(2, user.getName());
           pt.setString(3, user.getEmail());
           pt.setString(4, user.getPassword());
           pt.setString(5, user.getPhoneno());
           pt.setString(6, user.getAddress());
          
           pt.executeUpdate();
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
    //log user
    public User logUser(String email, String password) {
        User user = null;

        try {
            String query = "select * from user where email=? and password=?";
            PreparedStatement ps = this.con.prepareStatement(query); 
            ps.setString(1,email);
            ps.setString(2, password);
            
            ResultSet rs  = ps.executeQuery();
            
            if(rs.next()){
                 user = new User();
                 user.setId(rs.getInt("id"));
                 user.setName(rs.getString("name"));
                 user.setEmail(rs.getString("email"));
                 user.setPassword(rs.getString("password"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
