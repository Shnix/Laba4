import Interfaces.IsMovable;


class Stair extends Artifact implements IsMovable {
    @Override
    public void move() {
        System.out.println("Веревочную лестницу можно передвигать");
    }
}
