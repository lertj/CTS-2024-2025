import ro.ase.cts.models.NetflixAccount;
import ro.ase.cts.interfaces.Netflixable;
import ro.ase.cts.models.singleton.NetflixAccountEager;
import ro.ase.cts.models.singleton.NetflixAccountLazy;
import ro.ase.cts.models.singleton.NetflixAccountLazyThreadSafe;
import ro.ase.cts.models.singleton.NetflixAccountStatic;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Netflixable account = null;

        for (int i=0;i<5;i++) {
            account = NetflixAccountEager.getInstance();
//            account = NetflixAccountLazy.getInstance();
            account = NetflixAccountStatic.getInstance();
        }

        for (int i=0;i<5;i++){
            new Thread(() -> {
                System.out.println("***** Thread *****");
                Netflixable threadAcc = NetflixAccountLazy.getInstance(); // not thread safe
                System.out.println("***** Thread *****\n");
            }).start();
        }

        Thread.sleep(1000);
        System.out.println("______________________________________________________\n");

        for (int i=0;i<5;i++) {
            new Thread(() -> {
                System.out.println("***** Thread *****");
                Netflixable threadSafeAcc = NetflixAccountLazyThreadSafe.getInstance(); // thread safe
                System.out.println("***** Thread *****\n");
            }).start();
        }

    }
}