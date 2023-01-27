public class Main {
    public static void main(String[] args) {
        Magic magic = new Magic(200, 22, "Ixuuuuuuuu");
        Medic medic = new Medic(200, 22, "Ayyyyyy",2);
        Warrior warrior = new Warrior(200, 22, "izuuuu");
        Hero[] heroes = {medic,magic,warrior};
        for (int i = 0; i <heroes.length ; i++) {
            System.out.println(heroes[i].info());
            if (heroes[i] == medic) {
                System.out.println(medic.medicHill());
            }
        }
    }
}