import Interfaces.CanWalkIn;
import Interfaces.IsMovable;

class Tent extends Artifact implements IsMovable, CanWalkIn {
    @Override
    public void enter() {
        System.out.println("Вошёл в палатку");
    }

    @Override
    public void move() {
        System.out.println("Палатку можно взять с собой куда угодно");
    }
}
