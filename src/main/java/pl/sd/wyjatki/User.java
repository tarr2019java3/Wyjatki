package pl.sd.wyjatki;

import pl.sd.wyjatki.exceptions.EmailException;

public class User {
    private  String email;
    private String login;

    public User() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws EmailException {
     if (!this.checkEmail(email)){
         throw new EmailException("Nieprawidłowy email ");
     }else
        this.email = email;
    }


    public boolean checkEmail(String email){
        return email.contains("@");
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
