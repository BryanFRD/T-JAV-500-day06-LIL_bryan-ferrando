public class Mage extends Character {

    public Mage(String name){
        super(name, "Mage");
        life = 70;
        strength = 3;
        agility = 10;
        wit = 10;
        System.out.println(name + ": May the gods be with me.");
    }

    @Override
    public void attack(String arg) {
        if(arg.equalsIgnoreCase("magic") || arg.equalsIgnoreCase("wand")){
            System.out.println(name + ": Feel the power of my " + arg + "!");
        }
    }

}
