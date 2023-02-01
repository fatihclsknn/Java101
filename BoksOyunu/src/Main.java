public class Main {
    public static void main(String[] args) {

        Fighter marc = new Fighter("Marc",100,20,90,50,70);
        Fighter alex = new Fighter("Alex",100,15,90,50,30);
        Ring r = new Ring(marc, alex,90, 100);
        r.run();
    }
}