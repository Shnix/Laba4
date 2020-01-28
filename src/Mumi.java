import Enums.Mood;


class Mumi extends FantasyCreature {
    public String action4;

    public Mumi(String name, Mood mood, String location) {
        super(name, mood, location);
    }

    @Override
    public void whoIs(){
        System.out.format( "%s - %s настроение, местоположение -  %s\n", this.getName(), this.getMood(), this.getLocation());
    }

}
