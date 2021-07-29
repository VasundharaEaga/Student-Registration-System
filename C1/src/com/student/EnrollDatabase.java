package com.student;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EnrollDatabase {
	Connection con ;

    public EnrollDatabase(Connection con) {
        this.con = con;
    }
    
    //for register user 
    public boolean saveCourseEnroll(Enroll enroll){
        boolean set = false;
        try{
            //Insert register data to database
            String query = "insert into enroll(sname,cid,cname,phoneno) values(?,?,?,?)";
           
           PreparedStatement pt = this.con.prepareStatement(query);
           pt.setString(1,enroll.getSname());
           pt.setString(2,enroll.getCid());
           pt.setString(3,enroll.getCname());
           pt.setString(4,enroll.getPhoneno());
         
       
          
           pt.executeUpdate();
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
}
