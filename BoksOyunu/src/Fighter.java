public class Fighter {

    String  name;
    int     health;
    int     damage;
    int     weight;
    double  dodge;
    int firstStartChance;


    Fighter(String name, int health, int damage, int weight,int firstStartChance ,int dodge)
    {
        this.name   =   name;
        this.health =   health;
        this.damage =   damage;
        this.weight =   weight;
        this.firstStartChance = firstStartChance;
        if (dodge >= 0 && dodge <= 100)
        {
            this.dodge = dodge;
        }
        else {
            this.dodge = 0;
        }

    }

    public int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " " +  this.damage + " hasar vurdu.");

        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }

        if (foe.health - this.damage < 0)
            return 0;

        return foe.health - this.damage;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
    }

    public boolean isStart() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue >= 50;
    }

}
