import Enums.Mood;

abstract class FantasyCreature {
    private String name;
    private Mood mood;
    private String location;
    private String action1;
    private String action2;
    private String action3;

    public FantasyCreature(String name, Mood mood, String location) {
        this.name = name;
        this.mood = mood;
        this.location = location;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAction1() {
        return action1;
    }

    public void setAction1(String action1) {
        this.action1 = action1;
    }

    public String getAction2() {
        return action2;
    }

    public void setAction2(String action2) {
        this.action2 = action2;
    }

    public String getAction3() {
        return action3;
    }

    public void setAction3(String action3) {
        this.action3 = action3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void whoIs();

    public static class Parent extends FantasyCreature{

        private String type;
        private String nameChild;

        public Parent(String name, Mood mood, String location, String type){
            super(name, mood, location);
            this.type = type;
        }

        public String getType() {
            return this.type;
        }

        public String getNameChild() {
            return nameChild;
        }

        public void setNameChild(String nameChild) {
            this.nameChild = nameChild;
        }

        @Override
        public void whoIs(){
            System.out.println(this.getName() + "- " + this.getType() + " " + this.getNameChild());
        }
    }


}









