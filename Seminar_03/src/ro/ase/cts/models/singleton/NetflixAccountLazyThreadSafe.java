package ro.ase.cts.models.singleton;

import ro.ase.cts.interfaces.Netflixable;

public class NetflixAccountLazyThreadSafe implements Netflixable {
    private static NetflixAccountLazyThreadSafe instance = null; //private

    private NetflixAccountLazyThreadSafe() {
        System.out.println("Thread safe Lazy - Am creat un cont!");
    }

    public static synchronized NetflixAccountLazyThreadSafe getInstance() {
        if (instance == null) {
            instance = new NetflixAccountLazyThreadSafe();
        }
        return instance;
    }
}
