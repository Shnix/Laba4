import Enums.Mood;
import Enums.Whistle;

class Snusmum extends FantasyCreature {
    public Whistle whistle;

    public Snusmum(String name, Mood mood, String location,Whistle whistle) {
        super(name, mood, location);
        this.whistle = whistle;
    }

    @Override
    public void whoIs(){
        System.out.format( "%s - %s настроение, местоположение -  %s\n", this.getName(), this.getMood(), this.getLocation());
    }
}
