import Interfaces.IsMovable;

abstract class MusicalInstrument extends Artifact implements IsMovable {
   private int sound;

    public int getSound() {
        return sound;
    }

    public void setSound(int sound) {
        this.sound = sound;
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " ");
    }
    abstract void play();


}
