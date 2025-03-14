package ro.ase.cts.models;

public class NetflixAccount {
    public static NetflixAccount instance = null;


//    static{
//       instance = new NetflixAccount();
//    }

    private NetflixAccount() {
        System.out.println("Am creat un cont!");
    }

    public static NetflixAccount getInstance() {
        if (instance == null) {
            instance = new NetflixAccount();
        }
        return instance;
    }
}
