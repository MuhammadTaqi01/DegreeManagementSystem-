package smiu;

import java.sql.*;

public class DataRecords {
       Connection con;
       Statement st;
       ResultSet rs;
      

    DataRecords(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smiu?zeroDateTimeBehavior=convertToNull", "root", "");
        st=con.createStatement();
       }catch(Exception e){
        System.out.println(e);
       }
     }
    
    public void insertStudentRecord(String Name,String Father,String ID,String Password,String PhoneNo,String Email,String CNIC,String Gender,String Department,String Batch, String Status1, String Status2){
    try{
    String query="insert into registerform (Name,Father,ID,Password,PhoneNo,Email,CNIC,Gender,Department,Batch,Status1,Status2)values('"+Name+"','"+Father+"','"+ID+"','"+Password+"','"+PhoneNo+"','"+Email+"','"+CNIC+"','"+Gender+"','"+Department+"','"+Batch+"','"+Status1+"','"+Status2+"')";
    st.executeUpdate(query);
    }catch(Exception e){
    System.out.println(e);
    }
    }
    
    public ResultSet getStudentRecord(){
        try{
        String query="Select * from registerform";
        rs=st.executeQuery(query);
        }catch(Exception e){
        
           System.out.println(e);
        }
       return rs;
    }
    
    public ResultSet getUsernamePassword(String ID, String Password){
    
        try{
        String query="Select * from registerform where ID = '"+ID+"' and Password = '"+Password+"'";
        rs=st.executeQuery(query);
        }catch(Exception e){
        
           System.out.println(e);
        }
       return rs;
      }
    
    public void insertTranscriptRecords(String ID,String Transcript,String Date){
    try{
    String query="insert into transcriptrecord (ID,Transcript,Date)values('"+ID+"','"+Transcript+"','"+Date+"')";
    st.executeUpdate(query);
    }catch(Exception e){
    System.out.println(e);
    }
    }
    
    public ResultSet searchStudentRecord(String ID){
      try{
      String query="Select * from registerform where ID ='"+ID+"'";
      rs=st.executeQuery(query);
      }catch(Exception e){
      System.out.println(e);
      }   
      return rs;
    }
    
    public void deleteStudentRecord(String ID){
        try{
        String query="delete from registerform where ID ='"+ID+"'";
        st.executeUpdate(query);
        }catch(Exception e){
        System.out.println(e);
        }
     }
    
    public void deleteDegreeRecord(String ID){
        try{
        String query="delete from degreerecord where ID ='"+ID+"'";
        st.executeUpdate(query);
        }catch(Exception e){
        System.out.println(e);
        }
     }
 
    public void deleteTranscriptRecord(String ID){
        try{
        String query="delete from transcriptrecord where ID ='"+ID+"'";
        st.executeUpdate(query);
        }catch(Exception e){
        System.out.println(e);
        }
     }
    
    public void deleteDegreeFormRecord(String ID){
        try{
        String query="delete from degreeform where ID ='"+ID+"'";
        st.executeUpdate(query);
        }catch(Exception e){
        System.out.println(e);
        }
     }
    
    public void deleteFirstSemesterMarks(String ID){
        try{
        String query="delete from firstsemetermarks where ID ='"+ID+"'";
        st.executeUpdate(query);
        }catch(Exception e){
        System.out.println(e);
        }
     }
    
    
    public void deleteSecondSemesterMarks(String ID){
        try{
        String query="delete from seconsemestermarks where ID ='"+ID+"'";
        st.executeUpdate(query);
        }catch(Exception e){
        System.out.println(e);
        }
     }
    
    public void insertFirstSemesterMarks(String ID,String Subject1,String Subject2,String Subject3,String Subject4,String Subject5){
    try{
    String query="insert into firstsemetermarks (ID,Subject1,Subject2,Subject3,Subject4,Subject5)values('"+ID+"','"+Subject1+"','"+Subject2+"','"+Subject3+"','"+Subject4+"','"+Subject5+"')";
    st.executeUpdate(query);
    }catch(Exception e){
    System.out.println(e);
    }
    }
    
    public void insertSecondSemesterMarks(String ID,String Subject1,String Subject2,String Subject3,String Subject4,String Subject5){
    try{
    String query="insert into seconsemestermarks (ID,Subject1,Subject2,Subject3,Subject4,Subject5)values('"+ID+"','"+Subject1+"','"+Subject2+"','"+Subject3+"','"+Subject4+"','"+Subject5+"')";
    st.executeUpdate(query);
    }catch(Exception e){
    System.out.println(e);
    }
    }
    
    public ResultSet searchTranscriptRecord(String ID){
      try{
      String query="Select * from transcriptrecord where ID ='"+ID+"'";
      rs=st.executeQuery(query);
      }catch(Exception e){
      System.out.println(e);
      }   
      return rs;
    }
    
    public ResultSet searchFallSemster(String ID){
      try{
      String query="Select * from firstsemetermarks where ID ='"+ID+"'";
      rs=st.executeQuery(query);
      }catch(Exception e){
      System.out.println(e);
      }   
      return rs;
    }

    public ResultSet searchSpringSemster(String ID){
      try{
      String query="Select * from seconsemestermarks where ID ='"+ID+"'";
      rs=st.executeQuery(query);
      }catch(Exception e){
      System.out.println(e);
      }   
      return rs;
    }
    
    public void insertDegreeRecords(String ID,String Name,String CreditHour,String Grade,String CGPA,String Summer,String Department){
    try{
    String query="insert into degreeform (ID,Name,CreditHour,Grade,CGPA,Summer,Department)values('"+ID+"','"+Name+"','"+CreditHour+"','"+Grade+"','"+CGPA+"','"+Summer+"','"+Department+"')";
    st.executeUpdate(query);
    }catch(Exception e){
    System.out.println(e);
    }
    }
    
    public ResultSet searchDegreeRecords(String ID){
      try{
      String query="Select * from degreeform where ID ='"+ID+"'";
      rs=st.executeQuery(query);
      }catch(Exception e){
      System.out.println(e);
      }   
      return rs;
    }
    
    
    public void insertDegreeRecords(String ID,String Degree, String Date){
    try{
    String query="insert into degreerecord (ID,Degree,Date)values('"+ID+"','"+Degree+"','"+Date+"')";
    st.executeUpdate(query);
    }catch(Exception e){
    System.out.println(e);
    }
    }
    
    public ResultSet searchDegreeRecord(String ID){
      try{
      String query="Select * from degreerecord where ID ='"+ID+"'";
      rs=st.executeQuery(query);
      }catch(Exception e){
      System.out.println(e);
      }   
      return rs;
    }
    
    public ResultSet getDegreeIssue(String Batch){
      try{
      String query="select registerform.ID, registerform.Name, degreerecord.Date from registerform inner join degreerecord on registerform.ID = degreerecord.ID where Batch='"+Batch+"'";
      rs=st.executeQuery(query);
      }catch(Exception e){
      System.out.println(e);
      }   
      return rs;
    }
    
    public ResultSet searchNonDegreeIssue(String Batch){
      try{
      String query="Select * from registerform where Status2='Not issue' and Batch='"+Batch+"'";
      rs=st.executeQuery(query);
      }catch(Exception e){
      System.out.println(e);
      }   
      return rs;
    }
    
    public ResultSet getTranscriptIssue(String Batch){
      try{
      String query="select registerform.ID, registerform.Name, transcriptrecord.Date from registerform inner join transcriptrecord on registerform.ID = transcriptrecord.ID where Batch='"+Batch+"'";
      rs=st.executeQuery(query);
      }catch(Exception e){
      System.out.println(e);
      }   
      return rs;
    }

    public ResultSet searchNonTranscriptIssue(String Batch){
      try{
      String query="Select * from registerform where Status1='Not issue' and Batch='"+Batch+"'";
      rs=st.executeQuery(query);
      }catch(Exception e){
      System.out.println(e);
      }   
      return rs;
    }
    
    public void updateDegreeRecord(String Status, String ID){
    try{
    String query="update registerform set Status2='"+Status+"'where ID ='"+ID+"'";
    st.executeUpdate(query);
    }catch(Exception e){
    System.out.println(e);
    }
    }
    
    public void updateTranscriptRecord(String Status, String ID){
    try{
    String query="update registerform set Status1='"+Status+"'where ID ='"+ID+"'";
    st.executeUpdate(query);
    }catch(Exception e){
    System.out.println(e);
    }
    }
    
    public void updateStudentRecords(String ID,String Name,String Father,String Password,String PhoneNo,String Email,String CNIC,String Department){
    try{
    String query="update registerform set Name='"+Name+"',Father='"+Father+"',Password='"+Password+"',PhoneNo='"+PhoneNo+"',Email='"+Email+"',CNIC='"+CNIC+"',Department='"+Department+"'where ID ='"+ID+"'";
    st.executeUpdate(query);
    }catch(Exception e){
    System.out.println(e);
    }
    }
    
    
    public static void main(String[] args) {
   
    }
    
}
