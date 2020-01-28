import Enums.Mood;
import Enums.Whistle;
import Exceptions.*;


class World {
    public void go() throws LostHatException, DifferentMoodException {
    Snusmum snum = new Snusmum("Снусмумрик", Mood.GOOD, "Улица", Whistle.SECRETLY);
    Mumi mumi = new Mumi("Муми-тролль",Mood.SAD,"Дом");
    MusicalInstrument mouthOrgan = new MusicalInstrument() {

        @Override
        void play() {
            System.out.format("%s%s%s. И играл на ней с громкостью %s", this.getOwner(), this.getAction(), this.getName(), this.getSound());
        }
    };
        mouthOrgan.setSound(1000);
        mouthOrgan.setName("Губная гармошка");
        mouthOrgan.setAction(" часто ходил в такие вечера с ");
        mouthOrgan.setOwner(snum.getName());

        Tent tent = new Tent();
        tent.setName("Палатку");
        tent.setOwner(snum.toString());
        tent.setAction(" cкоро разобьет ");

        House house = new House();
        house.setName("Дома");
        house.setOwner(mumi.getName());
        house.setAction(" сидит ");

        Stair stair = new Stair();
        stair.setName("Веревочной лестницы");
        stair.setOwner(mumi.getName());
        stair.setAction(" стоял у ");

        Hat hat = new Hat();
        hat.setName("Шляпа");
        hat.setOwner("Волшебника");

        FantasyCreature.Parent mom = new FantasyCreature.Parent("Мумми-мама", Mood.NORMAL, "Дом", "Мама");
        mom.setNameChild(mumi.getName());

        FantasyCreature.Parent dad = new FantasyCreature.Parent("Мумми-папа", Mood.NORMAL, "Дом", "Папа");
        dad.setNameChild(mumi.getName());

        mom.whoIs();
        dad.whoIs();

        double a = Math.random();
        if(a >= 0.5){
            System.out.println(dad.getName() + " " + mom.getName() + " узнали о происшествии");
        }
        else{
            System.out.println(dad.getName() + " " + mom.getName() + " узнали о происшествии");
        }


        double b = Math.random();
        if(b >= 0.7){
            dad.setAction2(" сбросил в воду ");
            mom.setMood(Mood.HAPPY);
            dad.setMood(Mood.HAPPY);
            System.out.println(dad.getName() + dad.getAction2() + hat.getName() + " " + hat.getOwner());
        }
        else if(b > 0.3){
            dad.setAction2(" оставил ");
            System.out.println(dad.getName() + dad.getAction2() + hat.getName() + " " + hat.getOwner());
        }
        else{
            mom.setAction3(" потеряла ");
            mom.setMood(Mood.SAD);
            dad.setMood(Mood.SAD);
            System.out.println(mom.getName() + mom.getAction3() + hat.getName() + " " + hat.getOwner());
        }

        mumi.whoIs();
        snum.whoIs();

        double c = Math.random();
        if(c >= 0.5){
            mumi.setAction1(" уснул и забыл ");
            mumi.setMood(Mood.GOOD);
        }
        else{
            mumi.setAction1(" ждал ");
            mumi.setMood(Mood.SAD);
        }
        System.out.println(mumi.getName() + mumi.getAction1() + snum.getName() + "a");

        double d = Math.random();
        if(d >= 0.5){
            snum.setAction1(" разбил ");
            snum.setAction2(" уехал путешествовать");
            System.out.println(snum.getName() + snum.getAction1() + tent.getName() + " и " + snum.getAction2());

        }
        else{
            snum.setAction1(" свистнул ");
            snum.setAction2(" стоял у ");
            mumi.setAction2(" услышал ");
            System.out.println(snum.getName() + snum.getAction1() + Whistle.SECRETLY + " и " + snum.getAction2() + tent.getName());
            System.out.println(mumi.getName() + mumi.getAction2() + snum.getName() + "a");

        }
        if(mom.getAction3()!=null && mom.getAction3().equals(" потеряла ")){
            throw new LostHatException("Шляпа потеряна");
        }

        if (!mom.getMood().equals(mumi.getMood())){
            throw new DifferentMoodException("У родителей и их ребенка разные настроения - не ХЭППИ-ЭНД");
        }


    }
}
