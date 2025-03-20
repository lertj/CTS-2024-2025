package ro.ase.cts.models.registry;

import ro.ase.cts.interfaces.Netflixable;

import java.util.HashMap;

public class NetflixAccount implements Netflixable {
    private static HashMap<String, NetflixAccount> instances = new HashMap<>();
    protected String name;

    private NetflixAccount(String name) {
        this.name = name;
        System.out.println("Lazy - Am creat un cont" + this.name);
    }

    public static NetflixAccount getInstance(String name) {
        NetflixAccount acc = instances.get(name);
        if (acc == null) {
            acc = new NetflixAccount(name);
            instances.put(acc.name, acc);
        }
        return acc;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
