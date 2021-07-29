package com.student;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CourseDatabase {
	Connection con ;

    public CourseDatabase(Connection con) {
        this.con = con;
    }
    
    //for register user 
    public boolean saveCourse(Course course){
        boolean set = false;
        try{
            //Insert register data to database
            String query = "insert into course(cid,cname,desp,fee) values(?,?,?,?)";
           
           PreparedStatement pt = this.con.prepareStatement(query);
           pt.setString(1,course.getCid());
           pt.setString(2, course.getCname());
           pt.setString(3, course.getDesp());
           pt.setString(4, course.getFee());
       
          
           pt.executeUpdate();
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
}
