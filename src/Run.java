import Exceptions.DifferentMoodException;
import Exceptions.LostHatException;

public class Run {
    public static void main(String[] args) {
        World world = new World();
        try {
            world.go();
        }
        catch(LostHatException e){
            System.out.println(e.getMessage());
            System.out.println("Программа сработала не совсем так, как нужно");
        }

        catch(DifferentMoodException ex){
            System.out.println(ex.getMessage());
            System.out.println("Программа сработала не совсем так, как нужно");
        }

    }
}
