import Interfaces.IsMovable;

class Hat extends Artifact implements IsMovable {
    @Override
    public void move() {
        System.out.println("Шляпу можно носить");
    }
}
