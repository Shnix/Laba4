import Interfaces.CanWalkIn;

class House extends Artifact implements CanWalkIn {
    @Override
    public void enter() {
        System.out.println("Вошёл в дом");
    }
}
