public class Magic extends Hero {

    public Magic(int health, int damage, String typeAbility) {
        super(health, damage, typeAbility);
    }

    @Override
    public void SuperAbility() {
        System.out.println("Magic salam " + getTypeAbility());
    }

    @Override
    public String info() {
        return super.info();
    }
}
