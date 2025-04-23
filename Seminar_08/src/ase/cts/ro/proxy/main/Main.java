package ase.cts.ro.proxy.main;

import ase.cts.ro.proxy.LoginModule;
import ase.cts.ro.proxy.LoginProxy;

public class Main {
    public static void main(String[] args) {
        LoginModule db = new LoginModule("1234");

        String[] dictionary = { "123456", "admin", "root", "catdog", "1234"};

        for(String pass: dictionary){
            System.out.println("Incerc parola " + pass);
            db.login(pass);
        }

        System.out.println("**********");

        LoginProxy proxyDb = new LoginProxy(db);

        for(String pass: dictionary){
            System.out.println("Incerc parola " + pass);
            proxyDb.login(pass);
        }
    }
}
