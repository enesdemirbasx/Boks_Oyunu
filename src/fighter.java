public class fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;


    fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.weight = weight;
        this.health = health;
        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge=0;
        }
    }

    int hit(fighter foe) {
        System.out.println(this.name + " " + foe.name + "'a " + this.damage + " hasar vurdu.");
        if (foe.isdodge()) {
            System.out.println(foe.name + " gelen hasarı blokladı.");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;

    }

    boolean isdodge() {
        double randomSayi = Math.random() * 100;
        return randomSayi <= this.dodge;
    }
}
























