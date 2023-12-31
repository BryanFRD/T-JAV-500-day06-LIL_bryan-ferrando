
public abstract class Character implements Movable {

    protected String name;
    protected int life = 50;
    protected int agility = 2;
    protected int strength = 2;
    protected int wit = 2;
    protected final String RPGClass;

    protected Character(String name, String RPGClass) {
        this.name = name;
        this.RPGClass = RPGClass;
    }

    public void attack(String arg) throws WeaponException {
        if(arg == null || arg.isEmpty()){
            throw new WeaponException(name + ": I refuse to fight with my bare hands.");
        }
        System.out.println(this.name + ": Rrrrrrrrr....");
    }

    public void tryToAttack(String arg) {
        try {
            attack(arg);
        } catch (WeaponException ex){
            System.out.println(ex.getMessage());
        }
    }

    public String getName() {
        return name;
    }

    public int getAgility() {
        return agility;
    }

    public int getLife() {
        return life;
    }

    public int getStrength() {
        return strength;
    }

    public int getWit() {
        return wit;
    }

    public String getRPGClass() {
        return RPGClass;
    }

    @Override
    public void moveForward() {
        System.out.println(this.name + ": moves forward");
    }

    @Override
    public void moveBack() {
        System.out.println(this.name + ": moves back");
    }

    @Override
    public void moveRight() {
        System.out.println(this.name + ": moves right");
    }

    @Override
    public void moveLeft() {
        System.out.println(this.name + ": moves left");
    }

    public final void unsheathe(){
        System.out.println(this.name + ": unsheathes his weapon.");
    }

}
