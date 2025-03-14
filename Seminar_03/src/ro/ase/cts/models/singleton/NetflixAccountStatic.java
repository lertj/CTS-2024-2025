package ro.ase.cts.models.singleton;

import ro.ase.cts.interfaces.Netflixable;

public class NetflixAccountStatic implements Netflixable {
    public static NetflixAccountStatic instance;

        static{
            instance = new NetflixAccountStatic();
        }

    private NetflixAccountStatic() {
        System.out.println("Static - Am creat un cont!");
    }

    public static NetflixAccountStatic getInstance() {
        return instance;
    }
}
