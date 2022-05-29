package com.anki;
import java.sql.Connection;
import java.sql.PreparedStatement;
class StudentDao {
    public static boolean insertStudentToDB(Student st)
    {
        boolean f = false;
        try
        {
            //jdbc code....
            Connection con = CP.createC();
            String q = "insert into students(sname,sphone,scity) values(?,?,?)";
            //Prepared Statement
            PreparedStatement pstmt = con.prepareStatement(q);
            //Set the value of parameter
            pstmt.setString(1, st.getStudentName());
            pstmt.setString(2, st.getStudentPhone());
            pstmt.setString(3, st.getStudentCity());
            // execute....
            pstmt.executeUpdate();
            f = true;
        }
        catch(Exception e)
        {
            //Handle Exception
            e.printStackTrace();
        }
        return f;
    }
}