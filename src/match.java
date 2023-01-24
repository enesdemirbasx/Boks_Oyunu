import java.util.SortedMap;

public class match {
    fighter f1;
    fighter f2;
    int minweight;
    int maxweight;

    match(fighter f1,fighter f2,int minweight,int maxweight){
        this.f1=f1;
        this.f2=f2;
        this.maxweight=maxweight;
        this.minweight=minweight;
    }

    void basla(){
        if(ctrl()){
            double startSayi = Math.random() * 10;
            boolean baslayan;
            if (startSayi > 5) {
                baslayan=true;
            } else {
                baslayan=false;
            }
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("===========YENİ RAUND===========");
                if (baslayan) {
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                } else {
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                }
                System.out.println(this.f1.name + " Sağlık: " + this.f1.health);
                System.out.println(this.f2.name + " Sağlık: " + this.f2.health);
            }
        }else{
            System.out.println("Sporcuların sikletleri uymuyor!");
        }
    }

    boolean ctrl(){
        return ((this.f1.weight >= minweight && this.f1.weight <= maxweight) && (this.f2.weight >= minweight && this.f2.weight <= maxweight));
    }

    boolean isWin(){
        if (this.f1.health == 0) {
            System.out.println(this.f1.name + " Sağlık: " + this.f1.health);
            System.out.println(this.f2.name + " Sağlık: " + this.f2.health);
            System.out.println(f2.name + " Kazandı!");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " Sağlık: " + this.f1.health);
            System.out.println(this.f2.name + " Sağlık: " + this.f2.health);
            System.out.println(f1.name + " Kazandı!");
            return true;
        }
        return false;
    }
}















