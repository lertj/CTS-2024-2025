package ro.ase.cts.interfaces;

public interface Moveable { // I - Interface Segregation ( Impartim interfetele astfel incat sa aiba o singura responsabilitate )
    // Developerii care ne folosesc interfata (design by contract) nu sunt fortati sa foloseasca alte metode decat celel necesare (move in cazul de fata)
    void move();
}
