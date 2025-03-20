import ro.ase.cts.interfaces.Netflixable;
import ro.ase.cts.models.registry.NetflixAccount;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Netflixable user1 = NetflixAccount.getInstance("user1");
        Netflixable user2 = NetflixAccount.getInstance("user2");
        Netflixable user1Iar = NetflixAccount.getInstance("user1");

    }
}