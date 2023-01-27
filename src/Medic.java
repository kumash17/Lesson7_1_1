public class Medic extends Hero {

    private double healPoint;

    public Medic(int health, int damage, String typeAbility, double healPoint) {
        super(health, damage, typeAbility);
        this.healPoint = healPoint;
    }

    @Override
    public void SuperAbility() {
        System.out.println("Medic Salam " + getTypeAbility());
    }
    public String medicHill () {
        double tenPercent = (((10 * healPoint)/ 100) + healPoint);
        return "Heal point " + healPoint + tenPercent;
    }

    @Override
    public String info() {
        return super.info();
    }
}
