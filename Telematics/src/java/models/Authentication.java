package models;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Authentication {

    /**
     * Creates a new instance of Admin
     */
    private String user, pass;

    public Authentication() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public boolean login(){
        return this.user.equals("admin") && this.pass.equals("admin");
    }
}
