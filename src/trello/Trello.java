/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ubaidullah
 */
public class Trello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Team_Management tm=new Team_Management();
//           Connection myConnection =null;
//    
//     Statement myStatement=null;
//     ResultSet myResult=null;
//     ResultSet myResult2=null;
//     ResultSet myResult3=null;
//     ResultSet myResult4=null;
//  String url = "jdbc:derby://localhost:1527/TrelloApp";
//        try{
//            myConnection = DriverManager.getConnection(url,"ubaid","12345");
//            myStatement = myConnection.createStatement();
//            myResult = myStatement.executeQuery("Select * from AllTeams ");
//            while(myResult.next())  {
//             tm.addTeam(myResult.getString(1));
//            //System.out.println(myResult.getString(1));
//            }
//            
//            for (int i=0;i<tm.gettotalteams();i++){
//                 myResult = myStatement.executeQuery("Select Members from "+tm.getTeam(i).getName()+" where Members is not null ");
//                 while(myResult.next()){
//                      tm.getTeam(i).adduser(myResult.getString(1));
//                    
//                 }
//                 myResult2=myStatement.executeQuery("Select ListNames from "+tm.getTeam(i).getName()+" where ListNames is not null ");
//                 
//                 while(myResult2.next()){
//                     List l=new List(myResult2.getString(1));
//                     tm.getTeam(i).addlist(l);
//                 }
//                 for (int j=0;j<tm.getTeam(i).getLists().size();j++){
//                     myResult3=myStatement.executeQuery("Select Name from "+tm.getTeam(i).getLists().get(j).getname()+" where Name is not null ");
//                     while(myResult3.next()){
//                         Card c=new Card(myResult3.getString(1));
//                         tm.getTeam(i).getLists().get(j).addcard(c);
//                         System.out.println(myResult3.getString(1));
//                     }
//                     
//                     for (int k=0;k<tm.getTeam(i).getLists().get(j).getcards().size();k++){
//                          myResult4=myStatement.executeQuery("Select Members from "+tm.getTeam(i).getLists().get(j).getcards().get(k).getname()+" where Members is not null ");
//                         while(myResult4.next()){
//                             System.out.println(myResult4.getString(1));
//                             tm.getTeam(i).getLists().get(j).getcards().get(k).addmemberTocard(myResult4.getString(1));
//                         }
//                         
//                     }
//                     
//                 }
//            }
            
            
        //User ka table construct karna na bholna bhai    
         //User ka table construct karna na bholna bhai 
          //User ka table construct karna na bholna bhai 
           //User ka table construct karna na bholna bhai 
            //User ka table construct karna na bholna bhai 
             //User ka table construct karna na bholna bhai 
              //User ka table construct karna na bholna bhai 
               //User ka table construct karna na bholna bhai 
                //User ka table construct karna na bholna bhai  //User ka table construct karna na bholna bhai  //User ka table construct karna na bholna bhai 
                 //User ka table construct karna na bholna bhai 
                
       // User u1=new User("ubaid","1234567890","ubaid@gmail.com");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });    
//        }
//        catch(SQLException E){
//            E.printStackTrace();
//            System.out.println("Connection not made");
//        }
        
        
    }
    
}
