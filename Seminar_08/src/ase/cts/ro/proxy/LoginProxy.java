package ase.cts.ro.proxy;

public class LoginProxy implements Loginable{

    Loginable loginModule;

    public static int noTries = 0;

    public LoginProxy(Loginable loginModule){
        this.loginModule = loginModule;
    }

    @Override
    public boolean login(String password) {

        if(noTries > 3){
            System.out.println("Prea multe incercari!!!");
            return false;
        }
        noTries++;

        return loginModule.login(password);
    }
}
