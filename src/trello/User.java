/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trello;

/**
 *
 * @author ubaidullah
 */
public class User {
    
    private String name;
    private String password;
    private String email;

    public User(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public User() {
        
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    boolean CreateTeam(){
        boolean flag=false;
        
        
        
        return flag;
    }
    boolean ChangeAccountDetails(){
        boolean flag=false;
       
        
        return flag;
    }
    boolean ShowDashboard(){
        boolean flag=false;
        
        return flag;
    }
}
